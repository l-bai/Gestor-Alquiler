/*
clase abstracta 
 */
package DAO;

public abstract class Vehiculo implements java.io.Serializable {
    //atributos
    private  String matrícula;
    private Color color;
    private String marca;
    private  Motor motor;
    private int cilindrada;
    private int anyos;
    private static float precioBase= 50; 
    
    //constructores

    public Vehiculo(String matrícula) {
        this.matrícula = matrícula;
    }

    public Vehiculo(String matrícula, Motor motor) {
        this.matrícula = matrícula;
        this.motor = motor;
    }
    

    public Vehiculo(String matrícula, Color color, String marca, Motor motor, int cilindrada, int anyos) {
        this.matrícula = matrícula;
        this.color = color;
        this.marca = marca;
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.anyos = anyos;
    }
    
 
    
    
    //metodos abstractos
    public abstract String info();
    public abstract float calculaPrecio(int dias);
    public abstract String infoAlquiler(int dias);

    
    //get y set
    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getAnyos() {
        return anyos;
    }

    public void setAnyos(int anyos) {
        this.anyos = anyos;
    }

    public static float getPrecioBase() {
        return precioBase;
    }

    public static void setPrecioBase(float aPrecioBase) {
        precioBase = aPrecioBase;
    }
    
}
