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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 *
 * @author Leyaim
 */
public class iread {
     private static Pattern pattern;
      private static Matcher matcher;
      public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        
        String Chtml = "<!--";
        String Capli = "//";
       int contHTML = 0;
       int contA = 0;
       int contarb = 0;
       int contsql = 0;
       int cserv= 0;
       int conthiden = 0;
       int cIP=0;
       


        
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            
            if(cadena.contains("<!--")){
            contHTML++;
            }
            if(cadena.contains("//") || cadena.contains("/*"))  {
             contA++;
            }
            if(cadena.contains("@")){
             contarb++;
            }
            if(cadena.contains("SELECT") ||  cadena.contains("UPDATE") || cadena.contains("INSERT") || cadena.contains("DELETE")  ){
             contsql++;
            }
            if(cadena.contains("Servidor") ||  cadena.contains("Database")    ||  cadena.contains("Data")){
             cserv++;
            }
            
            if(cadena.contains("hidden") && cadena.contains("type")){
             conthiden++; 
            }
         
            
     //var ip = Regex.Match(linea, @"\b(\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3})\b");
     //\\d{1,3}.\\d{1,3}.\\d{1,3}
        String regexp = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b"; 
       
          
       
          
          
        if ( Pattern.matches(regexp,cadena) == true)
           cIP++;
           }
        
        
        
        
        b.close();
        
         
        System.out.println("Comentarios HTML:"+ contHTML);
        System.out.println("Comentarios de la aplicación: :"+ contA);
        System.out.println("Direcciones IP :" + cIP);
        System.out.println("Direcciones de correo electrónico :"+ contarb);
        System.out.println("Consultas SQL :" + contsql);
        System.out.println("Cadenas de conexión a la base de datos:"+ cserv);
        System.out.println("Campos ocultos de entrada:" + conthiden);
        
     
         
        
    }
      
   
 
   // public static boolean IPV(String ip){
        
    ///    String IPA = 
	//	"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
       //		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	//	"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	//	"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	  

        // Pattern.compile(IPA);
       //  matcher = pattern.matcher(ip);
	// return matcher.matches();	   
    
    
	  
    
	  

      

    public static void main(String[] args) throws IOException {
         System.out.println("----------P1");
        muestraContenido("C:\\Users\\Leyaim\\Desktop\\estadoarte\\panningforgold-master");
        
         
  
    }
   
    
    
    
}
