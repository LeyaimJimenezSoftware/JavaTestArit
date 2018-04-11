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
     public double mediaGeometrica(int [] vals){
    double mg;
     int d=0;
    for(int i=0;i<vals.length;i++){
                     d*=vals[i];
                     }
    mg = Math.pow(d,(1/vals.length));
     
     return mg;
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
     
     
     public double raizEnesima(double radicando,double indice){
     double resultado;
     
     if(indice == 2){
      resultado = Math.pow(radicando,0.5);
     }
     else{
     resultado = Math.pow(radicando,1/indice);
     }
     return resultado;
     }
    
}
