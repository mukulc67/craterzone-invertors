/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craterzone.invertors;

/**
 *
 * @author dell
 */
import invertorinterface.invertor;
public class icruze implements invertor {
    private float current, voltage;
    private boolean battery =true;

    public icruze(int c, int v) {
        this.current = c;
        this.voltage = v;
      
       
      }

    
  
   public float getCurrent(){return current;}
  
   public float getVoltage(){return voltage;}
  
    public float powerRating() {
      return current * voltage;
    } 
}
