/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leyaim
 */
public class Validado {
      public static void main(String[] args) {
        
          
          boolean found = false;
          boolean mArmonica = false;
           long TInicio, TFin, tiempo;
           TInicio = System.currentTimeMillis(); //de ejecución
           java.util.Date fecha = new Date();
              String fechaw = ""+fecha;
              DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
              DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
             DateFormat hourdateFormat = new SimpleDateFormat("HH-mm-ss--dd-MM-yyyy");
             System.out.println("Hora y fecha: "+hourdateFormat.format(fecha));
             String time = "";
             time =""+hourdateFormat.format(fecha);
             
          
          
         String direccion = "C:\\Users\\Leyaim\\Desktop\\estadoarte\\problema2.txt";
        String cadena = "";
        
        //Leer un archivo .txt
        File file = new File(direccion);
        FileReader fileReader = null;
        BufferedReader file2 = null;
        
        //En caso de no encontrar el archivo.
        try {
            fileReader = new FileReader(file);
            file2 = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo "+file.getName());
        }
        
        
        
           
           try{
                     
        
            FileWriter fw=new FileWriter(time+".txt");
            
            BufferedWriter bw = new BufferedWriter(fw); 
            PrintWriter wr = new PrintWriter(bw); 
            
             wr.println(); 
        
        //En caso de si encontrar el archivo.
        
        
        try {
            while((cadena = file2.readLine()) != null) {
                
               // Boolean continua = true;
                String[] arrayRenglon = cadena.split(":");         
                String[] arrayParteArray = arrayRenglon[2].split(" ");                    
                int[] arrayNum = new int[arrayParteArray.length];       
                
                //Llena el array numerico.
                for(int i=0; i<arrayParteArray.length; i++){
                    try{
                        arrayNum[i] = Integer.parseInt(arrayParteArray[i]);
                    }catch(NumberFormatException nfe){
                       // continua = false;
                    }
                }
                
                double res = 0;
                pUnitarias pruebas = new pUnitarias();
                
                //Hace la operacion correspondiente.
                switch(arrayRenglon[1]){
                    case "mediaAritmetica":
                        res = (pruebas.mediaAritmetica(arrayNum));
                    break;
                    case "mediaGeometrica":
                        res = pruebas.mediaGeometrica(arrayNum);
                    break;
//                    case "mediaArmonica":
//                        mArmonica =false;
//                      //res = pruebas.mediaArmonica(arrayNum);
//                    break;
                    default:
                        res = 0;
                        found = true;
                       // continua = false;
                    break;
                }
                
                //get fecha and hour
             
             
       
            //Abro stream, crea el fichero si no existe
            
            
            //Cierro el stream
            
                wr.println(); 
                System.out.print(arrayRenglon[0]);
                fw.write(""+arrayRenglon[0]);   
                if( arrayRenglon.length == 4){
                    res = Math.floor(100 * res) / 100;
                    try{
                        
//                        if(mArmonica = false){
//                        
//                                 System.out.print(" Metodo no encontrado");
//                        
//                                  wr.write(" Metodo no encontrado");
//                            
//                        }
                        if(found == true){
                        
                            System.out.print(" Metodo no encontrado");
                        
                            wr.write(" Metodo no encontrado");
                            
                            found = false;
                        }
                       
                        else if(res == Double.parseDouble(arrayRenglon[3])){
                            
                            
                            System.out.print(((char)27+"[01;32m Exito."+(char)27+"[00;00m")+" Éxito " + res +   " Resultado esperado " + arrayRenglon[3]);
                        
                            wr.write(" Éxito " + res + " Resultado esperado " + arrayRenglon[3]);
                        }else {
                            System.out.println((char)27+"[01;31m Fallo."+(char)27+"[00;00m" + res + " Resultado esperado " + arrayRenglon[3]);
                            wr.write((char)27+"[01;31m Fallo."+(char)27+"[00;00m"  + res + " Resultado esperado " + arrayRenglon[3]);
                        }
                    } catch (NumberFormatException nfe){
                        System.out.print(" Fallo " +res+ " Resultado esperado " + arrayRenglon[3]);
                        
                            wr.write(" Exception "  + " Resultado esperado " + arrayRenglon[3]);
                    }
                }
                
                System.out.println("\n");
                wr.write("\n");
                 System.out.println("");
                 
                  wr.println(); 
                // fw.close();
               
            }
               
                TFin = System.currentTimeMillis();
                tiempo = TFin - TInicio;
                System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
                  wr.write("Tiempo de ejecución en milisegundos: " + tiempo);
                  wr.println();
                  wr.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
         }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
          
           
    }
}