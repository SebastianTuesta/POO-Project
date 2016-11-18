package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author ALONSO RAÚL MELGAREJO GALVÁN
 * @author-email alonsoraulmg@gmail.com
 * @author-web http://www.linkedin.com/in/alonsoraulmg
 * @author-web https://www.facebook.com/alonsoraulmg
 * 
 * @company Global Intelligence Systems
 * @company-email contacto@globalintelsys.net84.net
 * @company-web http://globalintelsys.net84.net
 * @company-web http://www.globalintelsys.net84.net/academia
 * 
 * @version 1.0
 * @date-creation 29/05/2014
 * @copyright Global Intelligence Systems
 * 
 */

public class UtilArchivo{
    
    public static boolean guardarArchivo(String ruta, Serializable objetoSerializable){
        boolean estado = false;
        
        FileOutputStream archivo = null;
        try {
            /*Creamos el archivo (si ya existe lo sobreescribe)*/
            File fichero = new File(ruta);
            fichero.getParentFile().mkdirs();
                    
            /*Abrimos el archivo*/
            archivo = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(archivo);
            
            /*Escribimos en el archivo*/
            oos.writeObject(objetoSerializable);
            
            /*Cerramos el archivo*/
            oos.close();
            estado = true;
        } catch (FileNotFoundException ex) {
            /*null*/
            System.out.println(ex);
        } catch (IOException ex) {
            /*null*/
            System.out.println(ex);
        } finally {
            try {
                if(archivo != null){
                    archivo.close();
                }
            } catch (IOException ex) {
                /*null*/
                System.out.println(ex);
            }
        }
        
        return estado;
    }
    
    public static Serializable leerArchivo(String ruta){
        Serializable objetoSerializable = null;
        
        FileInputStream archivo = null;
        try {
            /*Abrimos el archivo*/
            archivo = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(archivo);
            
            /*Leemos el archivo*/
            objetoSerializable = (Serializable) ois.readObject();
            
            /*Cerramos el archivo*/
            ois.close();
        } catch (FileNotFoundException ex) {
            /*null*/
        } catch (IOException ex) {
            /*null*/
        } catch (ClassNotFoundException ex) {
            /*null*/
        } finally {
            try {
                if(archivo != null){
                    archivo.close();
                }
            } catch (IOException ex) {
                /*null*/
            }
        }
        
        return objetoSerializable;
    }
    
}