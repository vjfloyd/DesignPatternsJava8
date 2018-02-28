/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap.tipos.arreglos;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author vjrojasb
 */
public class VectorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(12);
        vector.add(1);
        vector.add(3);
        System.out.println("capacity=>"+vector.size());
        for (int i = 0; i < vector.size(); i++) {
            System.err.println(vector.get(i));
        }
        
    }
    
}
