/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap.object.reference;

/**
 *
 * @author vjrojasb
 */
public class ReferenceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            String one, two;
            one = new String("a");
            two = new String("b");
            one = two;
            String three = one;
            one = new String("ca");
            two = one;
            three = two;
            System.out.println("three="+three);
        } 
}
