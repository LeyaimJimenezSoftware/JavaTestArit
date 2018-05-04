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
public class Banco {
    
    public double Retirar(double valRetirar , double saldo){
        double newvalor = 0;
        
        newvalor = saldo - valRetirar;
        return  newvalor;
    }
    
}
