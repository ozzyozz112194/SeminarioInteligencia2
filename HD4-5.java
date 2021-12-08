package examples.behaviours;

import java.security.interfaces.EdECKey;
import java.util.Scanner;
import java.util.Vector;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class OneShotAgent extends Agent {

  protected void setup() {
    class RegresionLineal { 

     double [] w = {0,0,0};
    
     double [] x1 = {1,1,1};
     double [] x2 = {1,4,2};
     double [] x3 = {1,4,2};

     double y1 = 0;
     double y2 = 1;
     double y3 = 1;

     double wcurrent1 = 0;
     double wcurrent2 = 0;
     double wcurrent3 = 0;

     public double calcw0 () {

      for (int i=0; i<99; i++ ){
        w[0] = wcurrent1 - 0.1 * ((0 - .5) * x1[0] + (1 - .5) * x1[1] + (1-.5) * x1[2]) ;
        wcurrent1 = w[0];
        System.out.println(w[0]);

        if (w[0] == )
      }
        return w[0];
     }

     public double calcw1 () {
     
      for (int i=0; i<99; i++ ){
        w[1] = wcurrent1 - 0.1 * ((0 - .5) * x2[0] + (1 - .5) * x2[1] + (1-.5) * x2[2]) ;
        wcurrent1 = w[1]  ;
        System.out.println(w[1]);
      } 
     
      
        return w[1];
     }


    
    
    }

    RegresionLineal rl = new RegresionLineal();

    rl.calcw1();








   //System.out.println(vec.size());
    

    //addBehaviour(new MyOneShotBehaviour());
  } 

  private class MyOneShotBehaviour extends OneShotBehaviour {

    public void action() {
      
     
      
      

    } 
    
    public int onEnd() {
      myAgent.doDelete();   
      return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}
