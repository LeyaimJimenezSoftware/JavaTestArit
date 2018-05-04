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

/**
 *
 * @author Leyaim
 */
public class examen {
     public static void main(String[] args){
    
        String direccion = "C:\\Users\\Leyaim\\Desktop\\estadoarte\\examen.txt";
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
              
                Banco pBanco = new Banco();
                //Hace la operacion correspondiente.
                switch(arrayRenglon[1]){
                    case "Retirar":
                        res = (pBanco.Retirar(arrayNum[1],arrayNum[2]));
                    break;
                    
//                    case "mediaArmonica":
//                        mArmonica =false;
//                      //res = pruebas.mediaArmonica(arrayNum);
//                    break;
                    default:
                        res = 0;
                      //  found = true;
                       // continua = false;
                    break;
                }
                
                //get fecha and hour
             
             
       
            //Abro stream, crea el fichero si no existe
            
            
            //Cierro el stream
            
                 
                System.out.print(arrayRenglon[0]);
              ;   
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
                       
                            
                       if(res == Double.parseDouble(arrayRenglon[3])){
                            
                            
                            System.out.print(((char)27+"[01;32m Exito."+(char)27+"[00;00m")+" Éxito " + res +   " Resultado esperado " + arrayRenglon[3]);
                        
                           
                        }else {
                            System.out.println((char)27+"[01;31m Fallo."+(char)27+"[00;00m" + res + " Resultado esperado " + arrayRenglon[3]);
                           
                        }
                    } catch (NumberFormatException nfe){
                        System.out.print(" Fallo " +res+ " Resultado esperado " + arrayRenglon[3]);
                        
                            
                    }
                }
                
                System.out.println("\n");
           
                 System.out.println("");
                 
     
                // fw.close();
               
            }
               
              
               
        } catch (IOException e) {
            System.out.println("Error");
        }
    
          
           
    }
}
