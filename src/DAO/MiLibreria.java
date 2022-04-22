/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author lidia
 */
public class MiLibreria {
    
     public static boolean  validaTexto(String texto,String tipo) throws ExcepcionPropia{
        int ind=0;
        boolean correcto=true;
            
        texto = texto.toUpperCase();
         correcto = true;
         while (ind < texto.length() && correcto) {
             if (Character.isDigit(texto.charAt(ind))) {
                 correcto = false;
                 throw new ExcepcionPropia( tipo + " no puede contener dígitos");
             }
             ind++;
         }//fin while

            return correcto;
    }

    //para validar DNI
        public static boolean controlarDNI(String dni) throws ExcepcionPropia {

        char[] letraDni={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};  
        boolean ok;
        String num, letra;
        int indice,resto;
            
        ok=true;
        indice=0;
        if(dni.length()==10){
                num=dni.substring(0,8);
                while(indice<num.length()&& ok){
                    if(Character.isLetter(num.charAt(indice))){
                        ok=false;
                    }
                    indice++;
                }
                if(ok){
                    if(Character.isLetter(dni.charAt(9))){
                        letra=dni.substring(9).toUpperCase();
                        resto=Integer.parseInt(num)%23;
                        if(letra.charAt(0)!=letraDni[resto]){
                            throw new ExcepcionPropia("\nLa letra del DNI no es válida");
                        }
                    }else{
                        throw new ExcepcionPropia("\nEl último caracter, tiene que ser una letra.");
                    }
                }else{
                    throw new ExcepcionPropia("\nLos primeros 8 caracteres, tienen que ser números");
                }
            }else{
                throw new ExcepcionPropia("\n El DNI debe tener es 8 números + letra"); 
        }
        return ok;
    }
        
    //validar cantidades
        public static void controlRangos(int cantidad,int menor,int mayor)throws ExcepcionPropia{
            if(cantidad<menor || cantidad>mayor){
                throw new ExcepcionPropia("La cantidad debe estar entre " + menor + " y " + mayor);
            
            }
        }
        
        //método control de formato de la matrícula
    public static boolean controlMatricula(String mat)throws ExcepcionPropia{
        boolean matOk= true;
        int i=0;
        char l1,l2,l3;
        while(matOk==true && i < (mat.length() - 3)){
           if (Character.isLetter(mat.charAt(i))) {
                matOk = false;//si los 4 primeros no son un número, no ok
                throw new ExcepcionPropia("Matrícula no válida. Los 4 primeros caracteres deben ser dígitos");
            }
           i++;        
        }
        if(matOk){
            i=4;
            while(matOk==true && i<mat.length()){
                if(Character.isDigit(mat.charAt(i))){
                    matOk=false;  
                    throw new ExcepcionPropia("Matrícula no válida. Los 3 últimos caracteres deben ser letras");
                }
                i++;
            }
        }
        if(matOk){
            if(mat.charAt(4)==mat.charAt(5) || mat.charAt(4)==mat.charAt(6)){
                matOk=false;
            }else if(mat.charAt(5)==mat.charAt(6)){
                matOk=false;
            }
            if(!matOk){
                throw new ExcepcionPropia("Matrícula no válida. Las letras no deben repetirse");
            }
        }
        return matOk;
    }
    
       //método para comprobar y pedir plazas
    //le pasamos como parámetro el núm máximo de plazas según el vehículo y las plazas introducidas
    public static void validaPlaza(int pl,int maxPl) throws ExcepcionPropia{
        if(pl<=0 || pl>maxPl){
            throw new ExcepcionPropia("Admite de 1 a " + maxPl + " plazas" );
        }
        
    }//fin pude plaza
    
    public static String dateAstring(Date fecha){
        String fechaSt;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        fechaSt = formato.format(fecha);
        return fechaSt;
    }
    
    public static Date stringAdate(String fechaSt) throws ParseException{
        Date fecha;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        fecha = formato.parse(fechaSt);
        return fecha;
    }
           
    public static String calendarEnString(Calendar cal){
        String month, day;
        int mes,dia;
        StringBuilder esc = new StringBuilder();
        esc.append(cal.get(Calendar.YEAR));//pone el año
        esc.append("-");
        mes = cal.get(Calendar.MONTH) + 1; //pq empiezan por 0
        if(mes < 10){
            month = "0" + mes;
        }else{
            month = "" + mes;
        }
        esc.append(month);
        esc.append("-");
        dia = cal.get(Calendar.DATE);//dia del mes
        if(dia<10){
            day = "0" + dia;
        }else{
            day = "" + dia;
        }
        esc.append(day);
        
        return esc.toString();
        
    }
    
    
    }//fin libreria
