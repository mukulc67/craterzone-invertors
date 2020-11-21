/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craterzone;

/**
 *
 * @author dell
 */
import craterzone.invertors.PCUInvertor;
import craterzone.invertors.GTI;
import craterzone.invertors.Regalia;
import craterzone.invertors.icruze;
public class Craterzone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PCUInvertor ob = new PCUInvertor(4,5,true,false);
        GTI ob1 = new GTI(4,5,false,true);
        Regalia ob2 = new Regalia(4,5);
        icruze ob3 = new icruze(2,5);
        System.out.println(ob.powerRating());
    }
    
}
