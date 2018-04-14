/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Leyaim
 */
public class iread {
    
      public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        
        String palabra = "Barakamon";
       
       


        
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            
            if(cadena.contains(palabra)){
             System.out.println("palabra encontrada");
            }else{
            System.out.println("palabra no encontrada");
            }
            
            
            System.out.println(cadena);
        }
        b.close();
    }

    public static void main(String[] args) throws IOException {
        muestraContenido("C:/Users/Leyaim/Desktop/ver.txt");
    }
   
    
    
    
}
