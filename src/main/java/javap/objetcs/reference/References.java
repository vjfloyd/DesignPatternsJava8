/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap.objetcs.reference;

/**
 *
 * @author vjrojasb
 */
public class References {
     public static void main(String[] args) {
         
         String a;
         String b;
         
         a = new String("Hola");
         
         b = a;
         a = "nulo";
         b = a;
         System.out.println(" b =>" + b);
        
        
    }
    
}
