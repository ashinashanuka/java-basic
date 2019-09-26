/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedif;

/**
 *
 * @author ashin
 */
public class Nestedif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age = 25;
if(age > 0) 
{
   if(age > 16) 
   {
      System.out.println("Welcome!");
   } 
   else 
   {
      System.out.println("Too Young");
   }
} else 
{
   System.out.println("Error");
}
    }
    
}
