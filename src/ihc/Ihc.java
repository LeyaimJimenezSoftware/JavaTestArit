/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Leyaim
 */
public class Ihc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
//        java.util.Date fecha = new Date();
//        String fechaw = ""+fecha;
//        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        
//        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss-dd/MM/yyyy");
//        System.out.println("Hora y fecha: "+hourdateFormat.format(fecha));
//        
//   
        
//         try{
//            //Abro stream, crea el fichero si no existe
//            FileWriter fw=new FileWriter("ficheroprueba.txt");
//            //Escribimos en el fichero un String y un caracter 97 (a)
//            fw.write("Esto es una prueb");
//            fw.write(fechaw);
//            fw.write("popo");
//            //Cierro el stream
//            fw.close(); 
//                //Abro el stream, el fichero debe existir
////            FileReader fr=new FileReader("fichero1.txt");
////            //Leemos el fichero y lo mostramos por pantalla
////            int valor=fr.read();
////            while(valor!=-1){
////                System.out.print((char)valor);
////                valor=fr.read();
////            }
////            //Cerramos el stream
////            fr.close();
//        }catch(IOException e){
//            System.out.println("Error E/S: "+e);
//        }
//        
//        
        
        
        
        pUnitarias mediaA = new pUnitarias();
        
        int array[] = {2, 4, 8};
          
        int array1[] = {0 ,0};
           
        int array2[] = {2,4,8};
        
        System.out.println(""+ mediaA.mediaGeometrica(array1));


//try
//{
////Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
//File archivo=new File(fechaw);
//
////Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
//FileWriter escribir=new FileWriter(archivo,true);
//
////Escribimos en el archivo con el metodo write 
//escribir.write(fechaw);
//
////Cerramos la conexion
//escribir.close();
//}
//
////Si existe un problema al escribir cae aqui
//catch(Exception e)
//{
//System.out.println("Error al escribir");
//}
}
}
      
      
      
      
    
    
    
    
    

