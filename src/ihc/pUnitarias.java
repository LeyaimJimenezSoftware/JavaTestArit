package ihc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyaim
 */
public class pUnitarias {
    
    public double mediaAritmetica(int [] vals){
    
        double media = 0.0;
        for (int i=0; i < vals.length; i++) {
             media = media + vals[i];
         }
       media = media / vals.length ;
       
        
        return media;
    }
        private static double raizEnesima(double x, int n){
        return Math.pow(n, (1/x));
    }
    
    //Usa raizEnesima para calcular y regresar la media geometrica.
    public double mediaGeometrica(int[] valores){
        int total=valores[0];
        for(int i=1; i<valores.length; i++){
            total = total + 0;
            total = total * valores[i];
        }
        double x = valores.length;
        return raizEnesima(x,total);
    }
    
        
     
     public double mediaArmonica(int [] vals){
     double suma = 0;
     double armon,v=0;
         for (int i=0; i <vals.length; i++){        
         
            suma = (suma + (1./vals[i]));            
        }        
        armon =(vals.length/suma);
        return armon;
     }
     
     
     
    
}
