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
import invertorinterface.solar;
public class solarinvertor implements solar {
   
    private float current, voltage;
    private boolean battery,grid;

    solarinvertor(int c, int v) {
        this.current = c;
        this.voltage = v;
        this.battery = false;
        this.grid = false;
      }

    solarinvertor(int c, int v,boolean b , boolean g ) {
      this.current = c;
      this.voltage = v;
      this.battery = b;
      this.grid = g;
    }
  
   public float getCurrent(){return current;}
  
   public float getVoltage(){return voltage;}
  
    public float powerRating() {
      return current * voltage;
    } 
}
