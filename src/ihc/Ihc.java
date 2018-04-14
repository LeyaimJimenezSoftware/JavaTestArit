/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

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
        
        int array[] = {2, 3, 4};
        mediaA.mediaAritmetica(array);
        
      //  System.out.print( mediaA.mediaAritmetica(array));
        
          System.out.print( mediaA.mediaArmonica(array));
          
          InputStream inputStream       = new FileInputStream("C:/Users/Leyaim/Desktop/ver.txt");
          Reader      inputStreamReader = new InputStreamReader(inputStream);

         int data = inputStreamReader.read();
         while(data != -1){
         char theChar = (char) data;
         data = inputStreamReader.read();
}

         inputStreamReader.close();
          System.out.println(""+data );
          
          
          
    }
    
    
}
