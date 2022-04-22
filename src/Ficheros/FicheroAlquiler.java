/*
para guardar los alquileres

 */
package Ficheros;

import DAO.Alquiler;
import gestoralquiler.ListaAlquiler;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author lidia
 */
public class FicheroAlquiler {
    private static FileOutputStream fos;        
    private static ObjectOutputStream oos;
    private static FileInputStream fis;
    private static ObjectInputStream ois=null;
    private static File f;
    
    public static boolean guardarAlquiler(ListaAlquiler listaA){
        boolean guardadoOk = false;
        Alquiler alq;
        try{
            // instanciamos un ObjectOutputStream asociado a un FileOutputStream para escribir
            // objetos en un flujo de salida y al conectarlos al fichero se escriben en el.
            fos = new FileOutputStream("./src/Archivos/alquileres.txt");
            oos = new ObjectOutputStream(fos);
            // construimos un objeto con los datos deseados y lo escribimos
            // en el flujo de salida ObjectOutputStream con el método writeObject
            for (int i = 0; i < listaA.numAlquileres(); i++) {
                alq = listaA.aPosicion(i);                                              
                oos.writeObject(alq);               
            }

            // Cerramos los flujos abiertos una vez utilizados
            oos.close();
            fos.close();
            guardadoOk=true;
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error" + ex.getStackTrace());
            guardadoOk = false;
        }
        return guardadoOk;   
    } 
    
    public static boolean cargarAlquiler(ListaAlquiler listaA){
        boolean cargaOk=false;
        int i = 0;
        Alquiler alq;
        listaA.vaciar();
        try{
            fis = null;
            try{
                f = new File("./src/Archivos/alquileres.txt");
                if (f.exists()) {
                    // Asociamos el FileInputStream con el ObjectInputStream
                    fis = new FileInputStream(f);
                    ois = new ObjectInputStream(fis);
                    while(fis.available()>0){
                        alq = (Alquiler)ois.readObject();
                        cargaOk=listaA.inserta(alq);
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El fichero 'Alquileres' no existe", "Error al cargar", JOptionPane.ERROR_MESSAGE);
                }           
            }//2º try
             catch (EOFException eof) {
                
                System.out.println(".....................FIN DE FICHERO");
            } catch (FileNotFoundException fnf) {
                                
                System.err.println("Fichero no encontrado " + fnf);
                cargaOk = false;
            } catch (IOException e) {
                
                System.err.println("Se ha producido una IOException");
                e.printStackTrace();
                cargaOk = false;
            } catch (ClassNotFoundException e) {
                System.err.println("Error de programa" + e);
                cargaOk = false;
            } finally {
                    ois.close( );
                    fis.close( );
            }
        } catch(IOException e) {
            e.printStackTrace();
             
            cargaOk = false;
        }
        return cargaOk;
    }
}
