package DAO;

/**
 *
 * @author lidia
 */
public class Furgo extends VehiCarga{
    private int plazas;
    
    //constructores

    public Furgo(int plazas, int pma, String matrícula) {
        super(pma, matrícula);
        this.plazas = plazas;
    }

    public Furgo(int plazas, int pma, String matrícula, Motor motor) {
        super(pma, matrícula, motor);
        this.plazas = plazas;
    }

    public Furgo(int plazas, int pma, String matrícula, Color color, String marca, Motor motor, int cilindrada, int anyos) {
        super(pma, matrícula, color, marca, motor, cilindrada, anyos);
        this.plazas = plazas;
    }

   
    
    
    //métodos
       @Override
    public String info() {
        String infor;
        infor = "Tipo de vehículo: furgoneta\n"
                + "Matrícula: " + getMatrícula() + "\n"
                + "Motor: " + getMotor() + "\n"
                + "Marca: " + getMarca()  + "\n"
                + "Color: " + getColor()  + "\n"
                + "Cilindrada: " + getCilindrada() + "\n"
                + "Años:" + getAnyos()  + "\n"
                + "PMA:" + getPma()  + " toneladas\n"
                + "Número plazas: " + getPlazas() + "\n";
        return infor;
    }

    @Override
    public float calculaPrecio(int dias) {
        float precioAlquiler;
        precioAlquiler= (float) getPrecioBase()*dias + 20*getPma();
        return precioAlquiler;
    }

    @Override
    public String infoAlquiler(int dias) {
        String infoAl;
        infoAl = "Tipo: Furgoneta. \nMatrícula:" +getMatrícula() + "\n"
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
