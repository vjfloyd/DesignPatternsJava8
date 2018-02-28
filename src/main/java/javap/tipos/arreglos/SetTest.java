package javap.tipos.arreglos;


import java.util.HashSet;
import java.util.Set;
import javap.arrays.SetType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vjrojasb
 */
public class SetTest {

    /**
     * @param args the command line arguments
     */
    {
        System.out.println("I ceo bitch");
    }
    public static void main(String[] args) {
        
        SetType s1 = new SetType();
        Set<Integer> tmp = new HashSet<Integer>();
        tmp.add(11);
        tmp.add(22);
        tmp.add(33);
        tmp.add(33);
        
        s1.setSet1(tmp);
        tmp.remove(55);
        
        for (Integer tmp1 : tmp) {
            System.out.print(" " + tmp1);
        }
        //System.out.println(" "+tmp.toArray()[1]);
        //System.out.println(s1.getSet1());
    }
    
}
