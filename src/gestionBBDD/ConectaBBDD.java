package gestionBBDD;

import DAO.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Lidia Baixauli de la Villa
 */
public class ConectaBBDD {
    private Connection connec = null;
    private Statement sentenciaSQL = null;
    private ResultSet rs = null;

    public ConectaBBDD() {
    }
    
    public void conecta() throws SQLException{
        try{
            //registro del driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver).newInstance();
            System.out.println("Driver " + driver + " Registrado correctamente");
            //abrir conexión con la BBDD
            System.out.println("Conectando con la base de datos...");
            String jdbcUrl = "jdbc:mysql://localhost:3306/alquiler";
            connec = DriverManager.getConnection(jdbcUrl,"root","");
            System.out.println("Conexión establecida con la BBDD");
        
        }
        catch(SQLException e){
            //errores JDBC
            e.printStackTrace();
        }catch(Exception e){
            //errores class for name
            e.printStackTrace();
        }
    }
    
    public void crearSentencia() throws java.sql.SQLException {
        sentenciaSQL = connec.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        System.out.println("Sentencia creada con éxito");
    }
    
    public void cerrarConexion() throws java.sql.SQLException{
        //cerrar BBDD
        if(rs!=null){
            rs.close();
        }
        if(sentenciaSQL != null){
            sentenciaSQL.close();
        }
        if(connec!=null){
            connec.close();
        }
        System.out.println("Conexión cerrada con éxito");
    }
    
    //uso sentencias
    public void ejecutaSQL(String sql) throws java.sql.SQLException{
        //realiza consulta y devuelve los resultados
        rs = sentenciaSQL.executeQuery(sql);
    }
    
//    public ResultSet consultaTodo(String tabla) throws java.sql.SQLException{
//        ResultSet rsTodos = sentenciaSQL.executeQuery("SELECT * FROM " + tabla);
//        return rsTodos;
//    }
    
    public int updateSQL(String sql) throws java.sql.SQLException{
        //actualiza la BBDD
        int upd = -1;
        try{
            upd = sentenciaSQL.executeUpdate(sql);
        }
        catch (SQLException e){
            upd = -1;
        }
        return upd;
    }
    
    
    //manejo de los resultados
    public void irAlFinal() throws java.sql.SQLException {
        try {
            rs.last();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void irAlSiguiente() throws java.sql.SQLException {
        try {
            rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
    
    public void irAlAnterior() throws java.sql.SQLException{
        try {
            rs.previous();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void irAlPrimero() throws java.sql.SQLException {
        try {
            rs.first();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean isFinal() throws java.sql.SQLException{
        boolean isFin=false;
        try{
            isFin = rs.isLast();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isFin;
    }
    
    public boolean isPrincipio() throws java.sql.SQLException{
        boolean esPrimero= false;
        try{
            esPrimero= rs.isFirst();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return esPrimero;
        
    }
    
    public boolean isDespFinal() throws java.sql.SQLException{
        boolean despFinal=false;
        try{
            despFinal=rs.isAfterLast();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return despFinal;
    }
    
    
    //operaciones con los vehiculos
    public int grabaVehiculo(Vehiculo v) throws java.sql.SQLException{
        int graba = -1;
        //System.out.println("grabando");
        String tipo = "", idCol, idMot,sql;
        //obtenemos tipos. De esta manera si se modifica la tabla, no habría problemas
        if (v instanceof Coche) {
            //llama al método obtenDatos(campo que queremos saber, tabla de la BBDD, descripcion que debe coincidir)
            tipo = obtenDatos("idtipo","Tipos","Coche");
        } else if (v instanceof MicroBus) {
            tipo = obtenDatos("idtipo","Tipos","MicroBús");
        } else if (v instanceof Camion) {
            tipo = obtenDatos("idtipo","Tipos","Camión");
        } else {
            tipo = obtenDatos("idtipo","Tipos","Furgoneta");
        }
        //sacar id del color  y motor
        idCol = obtenDatos("idcolor", "Colores", v.getColor().toString());
        idMot = obtenDatos("idmotor", "Motores", v.getMotor().toString());
        
        sql = "INSERT INTO Vehiculos VALUES (";
        sql = sql + "'" + v.getMatrícula() + "'";
        sql = sql + ",'" + tipo + "','" + v.getMarca() + "'";
        sql = sql + "," + v.getCilindrada();
        sql = sql + ","+ v.getAnyos() +",";
        sql = sql + "'" + idCol + "','" + idMot +"'";
        //fin datos generales
        //la sentencia cambia según el tipo de vehículo
        if (v instanceof Coche){
            sql = sql + "," + ((Coche) v).getPlazas() + ",0,0,0)";
         }else if ( v instanceof MicroBus){
             sql = sql + "," + ((MicroBus) v).getPlazas() + "," + ((MicroBus) v).getMetros();
             sql = sql + ",0,0)";
         }else if( v instanceof Camion){
             sql = sql + ",0,0," + ((Camion) v).getPma() + "," + ((Camion) v).getRuedas() + ")";
         }else if(v instanceof Furgo) {
             sql = sql + "," + ((Furgo) v).getPlazas() + ",0," + ((Furgo) v).getPma() + ",0)";
         }
        System.out.println(sql);
        graba = this.updateSQL(sql);
        
        return graba;
    }
    
    
    public int modificaVehiculo(Vehiculo veh) throws java.sql.SQLException{
        String tipo = "", idCol, idMot,sql;
        int modif = -1;
        
        //sacar id del color 
        idCol = obtenDatos("idcolor", "Colores", veh.getColor().toString());
        idMot = obtenDatos("idmotor", "Motores", veh.getMotor().toString());
        //se generaliza
        //los objetos que no tengan algunos atributos se quedarán igual
        sql = "UPDATE Vehiculos SET marca = '" + veh.getMarca() + "'";
        sql = sql + ", cilindrada = " + veh.getCilindrada() + ", años = " + veh.getAnyos();
        sql = sql + ", idcolor = '" + idCol + "', idmotor = '" + idMot + "'";
        //cambia la sentencia según el tipo de vehiculo
        if(veh instanceof Coche){
            sql = sql + ", numplazas = " + ((Coche) veh).getPlazas();
        }else if (veh instanceof Camion){
            sql = sql + ", pma = " + ((Camion) veh).getPma() + ", numruedas =" + ((Camion) veh).getRuedas();
        }else if (veh instanceof MicroBus){
            sql = sql + ", numplazas = " + ((MicroBus) veh).getPlazas() + ", metros = " + ((MicroBus) veh).getMetros() ;
        }else  if (veh instanceof Furgo){
            sql = sql + ", numplazas = " + ((Furgo) veh).getPlazas() + ", pma = " + ((Furgo) veh).getPma() ;
        }
        
        sql = sql + " WHERE matricula = '" + veh.getMatrícula() + "'";
        System.out.println(sql);
        modif = this.updateSQL(sql);
        
        return modif;
    }
    
    public boolean borraVehiculo(String matricula) throws SQLException{
        //0 si no se borra nada u otro con el num filas borradas
        boolean borrado = false;
        int resp = -1;
        String sql;
        sql = "DELETE FROM Vehiculos WHERE matricula = '" + matricula + "'";
        resp = updateSQL(sql);
        if (resp == 1) {
            borrado = true;
        }
        return borrado;
        
    }
    
    
    public Vehiculo buscaVehiculo(String matricula) throws SQLException{
        Vehiculo v=null ;
        int cili,anyos,numplazas,metros,pma,ruedas;
        
        ejecutaSQL("SELECT *,Colores.descripcion AS 'micolor', Motores.descripcion AS 'mimotor',Tipos.descripcion AS 'tipodesc'"
                + " FROM Vehiculos JOIN Colores,Motores,Tipos"
                + " WHERE matricula = '" + matricula + "'"
                        + " AND Vehiculos.idcolor = Colores.idcolor"
                        + " AND Vehiculos.idmotor = Motores.idmotor"
                        + " AND Vehiculos.tipo = Tipos.idtipo");
        if(rs.next()){
            //si lo encuentra,recorre resultado e instancia el vehículo. 
            //hay que ver se qué tipo es
            String tipoVeh = rs.getString("tipodesc");
            String marca = rs.getString("marca");
            cili = rs.getInt("cilindrada");
            
            anyos = rs.getInt("años");
//            String idCol = rs.getString("idcolor");
            String color = rs.getString("micolor");
            Color col = Color.asignarColor(color);
//            String idMot = rs.getString("idmotor");
            String motor = rs.getString("mimotor");
            Motor mot = Motor.asignarMotor(motor); 
            if(tipoVeh.equalsIgnoreCase("Coche")){//es un coche
                numplazas = rs.getInt("numplazas");
                v= new Coche(numplazas, matricula, col, marca, mot, cili, anyos);
            }else if(tipoVeh.equalsIgnoreCase("MicroBús")){//es un microbus
                numplazas = rs.getInt("numplazas");
                metros = rs.getInt("metros");
                v = new MicroBus(numplazas, metros, matricula, col, marca, mot, cili, anyos);
            }else if(tipoVeh.equalsIgnoreCase("Camión")){//es camion
                pma = rs.getInt("pma");
                ruedas = rs.getInt("numruedas");
                v = new Camion(ruedas, pma, matricula, col, marca, mot, cili, anyos);
                
            }else if(tipoVeh.equalsIgnoreCase("Furgoneta")){//furgo
                pma = rs.getInt("pma");
                numplazas = rs.getInt("numplazas");
                v = new Furgo(numplazas, pma, matricula, col, marca, mot, cili, anyos);
            }
        }
        return v;
    }
    
    //devuelve el vehículo de la fila en la que está
    public Vehiculo dameVehiAct() throws SQLException {
        Vehiculo v;
        int cili,anyos,numplazas,metros,pma,ruedas;
        String matricula = rs.getString("matricula");
        String tipo = rs.getString("tipodesc");
        String marca = rs.getString("marca");
        cili = rs.getInt("cilindrada");

        anyos = rs.getInt("años");
//            String idCol = rs.getString("idcolor");
        String color = rs.getString("micolor");
        Color col = Color.asignarColor(color);
//            String idMot = rs.getString("idmotor");
        String motor = rs.getString("mimotor");
        Motor mot = Motor.asignarMotor(motor);
        numplazas = rs.getInt("numplazas");
        metros = rs.getInt("metros");
        pma = rs.getInt("pma");
        ruedas = rs.getInt("numruedas");
        if (tipo.equalsIgnoreCase("coche")) {//es un coche
            v = new Coche(numplazas, matricula, col, marca, mot, cili, anyos);
        } else if (tipo.equalsIgnoreCase("microbús")) {//es un microbus
            v = new MicroBus(numplazas, metros, matricula, col, marca, mot, cili, anyos);
        } else if (tipo.equalsIgnoreCase("camión")) {//es camion
            v = new Camion(ruedas, pma, matricula, col, marca, mot, cili, anyos);

        } else {//furgo
            v = new Furgo(numplazas, pma, matricula, col, marca, mot, cili, anyos);
        }

        return v;
    }
    
    //fin operaciones con vehiculos
    
    /*manejo de CLIENTES*/
    public int grabaCliente(Conductor cond) throws java.sql.SQLException{
        int graba = -1;
        String sql;
        sql = "INSERT INTO Clientes VALUES (";
        sql = sql + "'" + cond.getDni() + "','" + cond.getNombre() + "'";
        sql = sql + ",'" + cond.getApellidos() + "'," + cond.getEdad();
        sql = sql + "," + cond.getAnyosCarnet() + ",'B')";
        System.out.println(sql);
        graba = this.updateSQL(sql);
        return graba;
    
    }
    
    public Conductor buscaConductor(String dni) throws SQLException{
        Conductor cond = null;
        String nom, apell;
        int edad,anyCarne;
        ejecutaSQL("SELECT * FROM Clientes WHERE dni = '" + dni + "'");
        if(rs.next()){
            nom = rs.getString("nombre");
            apell = rs.getString("apellidos");
            edad = rs.getInt("edad");
            anyCarne = rs.getInt("añosCarnet");
            cond = new Conductor(dni, nom, apell, edad, anyCarne);
        }
        return cond;
    
    }
    
    public boolean borraConductor(String dni)throws SQLException{
        boolean borrado = false;
        String sql;
        int resp = -1;
        sql = "DELETE FROM Clientes WHERE dni = '" + dni + "'";
        resp = updateSQL(sql);
        if(resp == 1){
            borrado= true;
        }
        return borrado;
    }
    
    public Conductor dameCondActual() throws SQLException{
        Conductor cond;
        String nom, apell,dni;
        int edad,anyCarne;
        dni = rs.getString("dni");
        nom = rs.getString("nombre");
        apell = rs.getString("apellidos");
        edad = rs.getInt("edad");
        anyCarne = rs.getInt("añosCarnet");
        cond = new Conductor(dni, nom, apell, edad, anyCarne);
        return cond;
    
    }
    
    public int modifConductor(String viejoDni, Conductor cond) throws SQLException{
        int mod = -1;
        String sql;
        //tanto si se cambia el dni cm si no, se emplea este método.
        //se busca en la BBDD por el dni registrado → antiguo dni
        sql = "UPDATE Clientes SET dni = '" + cond.getDni() + "'";
        sql = sql + ", nombre = '" + cond.getNombre() + "', apellidos = '" + cond.getApellidos() + "'";
        sql= sql + ",edad =" + cond.getEdad() + ",añosCarnet = " + cond.getAnyosCarnet();
        sql = sql + " WHERE dni = '" + viejoDni + "'";
        mod = this.updateSQL(sql);
        System.out.println(sql);
        
        
        return mod;
        
    }
    /*FIN manejo de CLIENTES*/
    
 /*MANEJO ALQULIER*/
    public int grabaAlq(Alquiler alq) throws java.sql.SQLException {
        int graba = -1;
        String sql, fechaString;
        //Timestamp fecha;
        //fecha = new Timestamp(alq.getFechaAlq().getTime);
        fechaString = MiLibreria.dateAstring(alq.getFechaAlq());
        sql = "INSERT INTO Alquiler VALUES (";
        sql = sql + "'" + alq.getVeh().getMatrícula() + "','" + alq.getCond().getDni() + "'";
        sql = sql + ",'" + fechaString + "'," + alq.getDias() + " )";

        System.out.println(sql);
        graba = this.updateSQL(sql);
        return graba;

    }
        
    public boolean borraAlquiler(String mat)throws SQLException{
        boolean borrado = false;
        String sql;
        int resp = -1;
        sql = "DELETE FROM Alquiler WHERE codVehi = '" + mat + "'";
        resp = updateSQL(sql);
        if(resp == 1){
            borrado= true;
        }
        return borrado;
    }
    
    //solo sirve para una búsqueda
    public Alquiler dameAlqActual() throws SQLException{
        Alquiler alq;
        int dias;
        String dni,mat,fechaSt;
        Conductor cond;
        Vehiculo veh;
        Date date = null;
        dni = rs.getString("codCli");
        mat = rs.getString("codVehi");
        dias = rs.getInt("dias");
        fechaSt = rs.getString("fechaalquiler");
        cond = buscaConductor(dni);
        veh = buscaVehiculo(mat);
        try {
            date = MiLibreria.stringAdate(fechaSt);
        }
        catch (ParseException ex){
            ex.printStackTrace();
        }
        alq = new Alquiler(cond, veh, dias, date);
        return alq;
    
    }
    
    public String dameMatAct() throws  SQLException{
        return rs.getString("codVehi");
    }
    
    public Alquiler buscaAlq(String mat) throws SQLException{
        Alquiler alq=null;
        int dias;
        String dni,fechaSt,sql;
        Conductor cond;
        Vehiculo veh;
        Date date = null;
        //Timestamp fecha;
        //fecha = rs.getTimestamp("fechaalquiler");
        sql = "SELECT * FROM Alquiler WHERE codVehi = '" + mat + "'";
        ejecutaSQL(sql);
        if (rs.next()) {
            dni = rs.getString("codCli");
            dias = rs.getInt("dias");
            fechaSt = rs.getString("fechaalquiler");
            cond = buscaConductor(dni);
            veh = buscaVehiculo(mat);
            try {
                date = MiLibreria.stringAdate(fechaSt);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            alq = new Alquiler(cond, veh, dias, date);
        }
        
        return alq;
    
    }
    
     public Alquiler buscaAlqDni(String dni) throws SQLException{
        Alquiler alq=null;
        int dias;
        String mat,fechaSt,sql;
        Conductor cond;
        Vehiculo veh;
        Date date = null;
        sql = "SELECT * FROM Alquiler WHERE codCli = '" + dni + "'";
        System.out.println(sql);
        ejecutaSQL(sql);
        if (rs.next()) {
            mat = rs.getString("codVehi");
            dias = rs.getInt("dias");
            fechaSt = rs.getString("fechaalquiler");
            cond = buscaConductor(dni);
            veh = buscaVehiculo(mat);
            try {
                date = MiLibreria.stringAdate(fechaSt);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            alq = new Alquiler(cond, veh, dias, date);
            System.out.println(tamanyo());
        }
        
        return alq;
    
    }
    
    public int modifAlquiler(int dias, Alquiler alq) throws SQLException{
        int mod = -1;
        String sql;
        //tanto si se cambia el dni cm si no, se emplea este método.
        //se busca en la BBDD por el dni registrado → antiguo dni
        sql = "UPDATE Alquiler SET dias = " + dias;
        sql = sql + " WHERE codVehi = '" + alq.getVeh().getMatrícula() + "'";
        mod = this.updateSQL(sql);
        System.out.println(sql);
        return mod;
    }   
    
    public int damePosAct() throws SQLException{
        int pos = -1;
        if(rs!=null){
            pos = rs.getRow();
        }
        return pos;
    
    }
    
    public  int tamanyo() throws java.sql.SQLException{
        int tam = 0, origen = 0;
        origen = rs.getRow();//guarda pos actual del cursor
        rs.last();
        tam = rs.getRow();
        //vuelve el cursor a dnd estaba
        rs.absolute(origen);
        return tam;
    }
    
       //obtener el código tipo, por si hubiese cambios en la tabla
    private String obtenDatos(String campoAobtener, String nomTabla, String campoCompara){
        String tipo = "";
        try{
            ejecutaSQL("SELECT " + campoAobtener +" FROM " + nomTabla + " WHERE descripcion = '" + campoCompara + "'");
            irAlPrimero();
            tipo = rs.getString(campoAobtener);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return tipo;
    }
    
    //consultar una tabla
    public void cargaTabla(String nomTabla)  throws java.sql.SQLException{
            ejecutaSQL("SELECT * FROM " + nomTabla);
    }
    
  
    
    //array colores
    public String[] arrayColores() {
        String[] colores = null;
        int i=0;
        try {
            ejecutaSQL("SELECT * FROM Colores");
            colores = new String[tamanyo()];
            while (rs.next()) {
                colores[i] = rs.getString("descripcion");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return colores;
    }
    
     //array motores
    public String[] arrayMotores() {
        String[] motores = null;
        int i = 0;
        try {
            ejecutaSQL("SELECT * FROM Motores");
            motores = new String[tamanyo()];
            while (rs.next()) {
                motores[i] = rs.getString("descripcion");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return motores;
    }
    
    //obtener colores
    public String obtenerColores()throws java.sql.SQLException{
        String color = "";
        color = rs.getString("descripcion");
        return color;
        
    }
    
     //obtener motores
    public String obtenerMotores()throws java.sql.SQLException{
        String motor = "";
        motor = rs.getString("descripcion");
        return motor;
        
    }
    
      //obtener tipo vehiculo
    public String obtenerTipoVeh()throws java.sql.SQLException{
        String tipo = "";
        tipo = rs.getString("descripcion");
        return tipo;
        
    }
    
}
