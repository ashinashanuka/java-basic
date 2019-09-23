/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author ashin
 */
public class Student {

    private String indexnum;
   private String name;
   private float cosework;
   private float exammarks;
   
  
   public float calculateFinalresult(float cosework, float exammarks)
   {
       return (float) (cosework*0.4 + exammarks*0.6);
   } 
   
 
   
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
