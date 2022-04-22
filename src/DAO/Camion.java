package DAO;

/**
 *
 * @author lidia
 */
public class Camion extends VehiCarga{
    //atributos    
    private int ruedas;
    
    //constructores

    public Camion(int ruedas, int pma, String matrícula) {
        super(pma, matrícula);
        this.ruedas = ruedas;
    }

    public Camion(int ruedas, int pma, String matrícula, Color color, String marca, Motor motor, int cilindrada, int anyos) {
        super(pma, matrícula, color, marca, motor, cilindrada, anyos);
        this.ruedas = ruedas;
    }
    
   
    
    //métodos
       @Override
    public String info() {
        String infor;
        infor = "Tipo de vehículo: camión\n"
                + "Matrícula: " + getMatrícula() + "\n"
                + "Motor: " + getMotor() + "\n"
                + "Marca: " + getMarca()  + "\n"
                + "Color: " + getColor()  + "\n"
                + "Cilindrada: " + getCilindrada() + "\n"
                + "Años:" + getAnyos()  + "\n"
                + "PMA:" + getPma()  + " toneladas\n"
                + "Número de ruedas: " + getRuedas() + "\n";
        return infor;
    }

    @Override
    public float calculaPrecio(int dias) {
        float precioAlquiler;
        precioAlquiler= (float) getPrecioBase()*dias + 20*getPma() +40;
        return precioAlquiler;
    }

    @Override
    public String infoAlquiler(int dias) {
        String infoAl;
        infoAl = "Tipo: Camión.\nMatrícula:" +getMatrícula() + "\n"
                + "-------------------------- " +  "\n"
                + "Número de días: "+ dias + "\n"
                + "Precio total: "+ calculaPrecio(dias) + " €\n";           
        return infoAl;
    }
    
    //get y set

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    
    
    
    
    
}
