/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leyaim
 */
public class Validado {
      public static void main(String[] args) {
       
         String direccion = "C:\\Users\\Leyaim\\Desktop\\estadoarte\\problema1.txt";
        String cadenaCompa = "";
        
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
        //En caso de si encontrar el archivo.
        try {
            while((cadenaCompa = file2.readLine()) != null) {
                
               // Boolean continua = true;
                String[] arrayRenglon = cadenaCompa.split(":");         //0001:mediaAritmetica:2 4 8:4.66
                String[] arrayParteArray = arrayRenglon[2].split(" ");  //                     2 4 8
                int[] arrayNum = new int[arrayParteArray.length];       //                     2 4 8
                
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
                    case "mediaArmonica":
                        res = pruebas.mediaArmonica(arrayNum);
                    break;
                    default:
                        res = 0;
                       // continua = false;
                    break;
                }
                
                System.out.print(arrayRenglon[0]);
                if( arrayRenglon.length == 4){
                    res = Math.floor(100 * res) / 100;
                    try{
                        if(res == Double.parseDouble(arrayRenglon[3])){
                            System.out.print("\033[32m: Éxito " + res + " Resultado esperado " + arrayRenglon[3]);
                        }else {
                            System.out.print("\033[31m: Fallo " + res + " Resultado esperado " + arrayRenglon[3]);
                        }
                    } catch (NumberFormatException nfe){
                       // continua = false;
                    }
                }
                System.out.println("\n");
                
                 System.out.println("");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }   
        
         
    }
}
