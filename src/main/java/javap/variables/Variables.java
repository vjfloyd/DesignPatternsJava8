/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap.variables;

/**
 *
 * @author vjrojasb
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Varibles
        String $_var_girl = "Maria";
        String _var_dinero_ = "Beto";
        String __var_edad = "cinco";
        String A$B = "seis";
        System.out.println($_var_girl + " " + _var_dinero_ + " " + __var_edad + " " + A$B);


        int a = 2;
        int b = a * 10;
        b = a*10;

        System.out.println(b);
        a = 3;
        b = a*10;
        System.out.println(b);

    }
    
}
