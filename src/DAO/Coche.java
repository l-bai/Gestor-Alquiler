package DAO;

public class Coche extends Vehiculo{
    private int plazas;
    
    public Coche(int plazas, String matrícula) {
        super(matrícula);
        this.plazas = plazas;
    }

    public Coche(int plazas, String matrícula, Motor motor) {
        super(matrícula, motor);
        this.plazas = plazas;
    }

    //constructores
    public Coche(int plazas, String matrícula, Color color, String marca, Motor motor, int cilindrada, int anyos) {    
        super(matrícula, color, marca, motor, cilindrada, anyos);
        this.plazas = plazas;
    }

    @Override
    public String info() {
        String infor;
        infor = "Tipo de vehículo: coche\n"
                + "Matrícula: " + getMatrícula() + "\n"
                + "Motor: " + getMotor() + "\n"
                + "Marca: " + getMarca()  + "\n"
                + "Color: " + getColor()  + "\n"
                + "Cilindrada: " + getCilindrada() + "\n"
                + "Años: " + getAnyos()  + "\n"
                + "Número de plazas: " + getPlazas() + "\n";
        return infor;
    }

    @Override
    public float calculaPrecio(int dias) {
        float precioAlquiler;
        precioAlquiler= (float)((getPrecioBase() + 1.5*getPlazas())*dias);
        return precioAlquiler;
    }

    @Override
    public String infoAlquiler(int dias) {
        String infoAl;
        infoAl = "Tipo: Coche. \nMatrícula: " + getMatrícula() + "\n"
                + "-------------------------- " +  "\n"
                + "Número de días: "+ dias + "\n"
                + "Precio total: "+ calculaPrecio(dias) + " €\n";              
        return infoAl;
    }
    
    //get y set

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    
    
    
}
