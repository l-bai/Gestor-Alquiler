/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author lidia
 */
public abstract class VehiCarga extends Vehiculo{
    //atributos
    private int pma;

    public VehiCarga(int pma, String matrícula) {
        super(matrícula);
        this.pma = pma;
    }

    public VehiCarga(int pma, String matrícula, Motor motor) {
        super(matrícula, motor);
        this.pma = pma;
    }

    public VehiCarga(int pma, String matrícula, Color color, String marca, Motor motor, int cilindrada, int anyos) {
        super(matrícula, color, marca, motor, cilindrada, anyos);
        this.pma = pma;
    }
    
    //get y set

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }
    
}
