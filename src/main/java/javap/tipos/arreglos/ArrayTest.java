/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap.tipos.arreglos;

import java.util.ArrayList;
import javap.arrays.ArrayTypes;

/**
 *
 * @author vjrojasb
 */
public class ArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayTypes arr1 = new ArrayTypes();
        ArrayList tmp = new ArrayList();
        tmp.add(1);
        tmp.add(2);
        arr1.setList1(tmp);
        
        for (int i = 0; i < arr1.getList1().size(); i++) {
            System.out.println("x " + arr1.getList1().get(i));
        }
    
    }
    
}
