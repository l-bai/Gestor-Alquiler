package DAO;

public class MicroBus extends Vehiculo{
    private int plazas;
    private boolean tv;
    private int metros;
    
    //constructores

    public MicroBus(int plazas, String matrícula) {
        super(matrícula);
        this.plazas = plazas;
    }

    public MicroBus(int plazas, String matrícula, Motor motor) {
        super(matrícula, motor);
        this.plazas = plazas;
    }

    public MicroBus(int plazas, String matrícula, Color color, String marca, Motor motor, int cilindrada, int anyos) {
        super(matrícula, color, marca, motor, cilindrada, anyos);
        this.plazas = plazas;
    }

    public MicroBus(int plazas, int metros, String matrícula, Color color, String marca, Motor motor, int cilindrada, int anyos) {
        super(matrícula, color, marca, motor, cilindrada, anyos);
        this.plazas = plazas;
        this.metros = metros;
    }

   
    
    //métodos
     @Override
    public String info() {
        String infor;
        String tele = "No";
        if(isTv()){
            tele="Sí";
        }
        infor = "Tipo de vehículo: microbus\n"
                + "Matrícula: " + getMatrícula() + "\n"
                + "Motor: " + getMotor() + "\n"
                + "Marca: " + getMarca()  + "\n"
                + "Color: " + getColor()  + "\n"
                + "Cilindrada: " + getCilindrada() + "\n"
                + "Años:" + getAnyos()  + "\n"
                + "Con TV: " + tele + "\n"
                + "Número de plazas: " + plazas + "\n";
        return infor;
    }

    @Override
    public float calculaPrecio(int dias) {
        float precioAlquiler;
        precioAlquiler= (float)((getPrecioBase() + 1.5*plazas)*dias) + 2*plazas;
        return precioAlquiler;
    }

    @Override
    public String infoAlquiler(int dias) {
        String infoAl;
        infoAl = "Tipo: Microbus. \nMatrícula:" +getMatrícula() + "\n"
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

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    
    
}//fin clase micro
