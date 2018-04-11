/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihc;

/**
 *
 * @author Leyaim
 */
public class Ihc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        pUnitarias mediaA = new pUnitarias();
        
        int array[] = {2, 3, 4};
        mediaA.mediaAritmetica(array);
        
      //  System.out.print( mediaA.mediaAritmetica(array));
        
          System.out.print( mediaA.mediaArmonica(array));
    }
    
    
}
