/*
    enumerado de color
 */
package DAO;

public enum Color {
     Blanco, Negro, Amarillo, Azul, Verde, Turquesa;   
     
     public static void muestraColores(){
         for(Color col: Color.values()){
             System.out.print(col + "\t");
         }
     }
     
    public static boolean validarColor(String color) {
        boolean x = false;
        Color[] colores = Color.values();
        int i = 0;
        String c;
        while (x == false && i < colores.length) {
            c = colores[i].name();
            if (c.equalsIgnoreCase(color)) {
                x = true;
            }

            i++;

        }
        return x;
    }//fin valida color
    
    public static Color asignarColor(String c) {
        Color cv = null;
        c = c.toUpperCase();
        switch (c) {
            case "BLANCO":
                cv = Color.Blanco;
                break;
            case "VERDE":
                cv = Color.Verde;
                break;
            case "NEGRO":
                cv = Color.Negro;
                break;
            case "AZUL":
                cv = Color.Azul;
                break;
            case "AMARILLO":
                cv = Color.Amarillo;
                break;
            case "TURQUESA":
                cv = Color.Turquesa;
                break;
        }
        return cv;
    }//fin asigna color

     
}


