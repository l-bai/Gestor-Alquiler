/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionBBDD;

import java.sql.SQLException;

/**
 *
 * @author Lidia Baixauli de la Villa
 */
public class LibreriaUsoBBDD {
    
    
    public static  boolean existeMatricula(String matricula) throws SQLException{
        boolean existe = false;
        //conectamos con la base de datos
        ConectaBBDD con = new ConectaBBDD();
        con.conecta();
        con.crearSentencia();
        con.ejecutaSQL("SELECT * FROM Vehiculos WHERE matricula = '" + matricula +"'");
        if(con.tamanyo()>0){
            //significa que ya está esa matrícula
            existe = true;
        }
        con.cerrarConexion();
        return existe;
    
    }
    
     public static  boolean existeAlquiler(String matricula) throws SQLException{
        boolean existe = false;
        //conectamos con la base de datos
        ConectaBBDD con = new ConectaBBDD();
        con.conecta();
        con.crearSentencia();
         
        con.ejecutaSQL("SELECT * FROM Alquiler WHERE codVehi = '" + matricula +"'");
        if(con.tamanyo()>0){
            //significa que  está alquilado
            existe = true;
        }
        con.cerrarConexion();
        return existe;
    
    }
     
      public static  boolean existeAlquilerDni(String dni) throws SQLException{
        boolean existe = false;
        //conectamos con la base de datos
        ConectaBBDD con = new ConectaBBDD();
        con.conecta();
        con.crearSentencia();
         
        con.ejecutaSQL("SELECT * FROM Alquiler WHERE codCli = '" + dni +"'");
        if(con.tamanyo()>0){
            //significa que  tiene alquileres
            existe = true;
        }
        con.cerrarConexion();
        return existe;
    
    }
     
    public static  boolean existeDni(String dni) throws SQLException{
        boolean existe = false;
        //conectamos a BBDD
        ConectaBBDD con = new ConectaBBDD();
        con.conecta();
        con.crearSentencia();
        con.ejecutaSQL("SELECT * FROM Clientes WHERE dni = '" + dni + "'");
        if(con.tamanyo()>0){
            //significa que  está alquilado
            existe = true;
        }
        con.cerrarConexion();
        return existe;
    }
     

}
