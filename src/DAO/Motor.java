/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

public enum Motor {
    Diesel, Gasolina, Híbrido, Eléctrico;
    
     public static Motor asignarMotor(String c) {
        Motor cv = null;
        c = c.toUpperCase();
        switch (c) {
            case "DIESEL":
                cv = Motor.Diesel;
                break;
            case "GASOLINA":
                cv = Motor.Gasolina;
                break;
            case "HÍBRIDO":
                cv = Motor.Híbrido;
                break;
            case "ELÉCTRICO":
                cv = Motor.Eléctrico;
                break;
            
        }
        return cv;
    }//fin asigna color
}
