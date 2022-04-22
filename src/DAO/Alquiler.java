package DAO;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lidia
 */
public class Alquiler implements java.io.Serializable{
    //atributos
    private Conductor cond;
    private Vehiculo veh;
    private int dias;
    private Date fechaAlq;
    

    //constructor
    public Alquiler(Conductor cond, Vehiculo veh, int dias, Date f) {    
        this.cond = cond;
        this.veh = veh;
        this.dias = dias;
        this.fechaAlq = f;
    }
    
    //métodos
    //método que muestra el precio del alquiler
    public String verInfo(){
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String infoP;
        infoP="               DATOS DEL ALQUILER\n"
                + "-------------------------------------------"
                + "\nFecha de alquiler: " + formato.format(fechaAlq)
                + "\nDNI conductor: " + cond.getDni()
                + "\n" + veh.infoAlquiler(dias);
        return infoP;
    }

    //get y set
    public Vehiculo getVeh() {
        return veh;
    }

    public void setVeh(Vehiculo veh) {
        this.veh = veh;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Conductor getCond() {
        return cond;
    }

    public void setCond(Conductor cond) {
        this.cond = cond;
    }

    public Date getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(Date fechaAlq) {
        this.fechaAlq = fechaAlq;
    }
    
    
    
}
