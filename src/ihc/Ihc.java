/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
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
     
        
        pUnitarias mediaA = new pUnitarias();
        
        int array[] = {2, 4, 8};
          
        int array1[] = {1 ,5};
           
        int array2[] = {1, 2 ,4 ,8, 16};
        
      //  System.out.print( mediaA.mediaAritmetica(array));
        
        //  System.out.print("1:"+ mediaA.mediaArmonica(array));
     
         
     // Deprecated
      java.util.Date fecha = new Date();
      System.out.println (fecha);
     
      
      //Un texto cualquiera guardado en una variable
String fechaw = ""+fecha;

try
{
//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
File archivo=new File(fechaw);

//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
FileWriter escribir=new FileWriter(archivo,true);

//Escribimos en el archivo con el metodo write 
escribir.write(fechaw);

//Cerramos la conexion
escribir.close();
}

//Si existe un problema al escribir cae aqui
catch(Exception e)
{
System.out.println("Error al escribir");
}
}
}
      
      
      
      
    
    
    
    
    

