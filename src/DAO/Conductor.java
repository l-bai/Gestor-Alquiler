package DAO;

/**
 *
 * @author lidia
 */
public class Conductor implements java.io.Serializable{
    //atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private int anyosCarnet;
    
    //constructores

    public Conductor(String dni, String nombre, String apellidos, int edad, int anyosCarnet) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.anyosCarnet = anyosCarnet;
    }

    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    //método mostrar info
    public String infoCond(){
        String info;
        info = "Nombre: " + getNombre()+ "\nDni: " + getDni();
        return info;
    }
    
    //get y set
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnyosCarnet() {
        return anyosCarnet;
    }

    public void setAnyosCarnet(int anyosCarnet) {
        this.anyosCarnet = anyosCarnet;
    }
    
    
}
