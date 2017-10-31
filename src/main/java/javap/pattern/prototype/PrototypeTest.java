/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vjrojasb
 */
public class PrototypeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
    
        AnimalPrototype animal = new AnimalPrototype();
        animal.loadData();
        
        List<String> lista1 = new ArrayList<String>();
        lista1 = animal.getAnimals();
        
        AnimalPrototype animal1 = (AnimalPrototype) animal.clone();
        AnimalPrototype animal2 = (AnimalPrototype) animal.clone();
        
        List<String> list_1 = animal1.getAnimals();
        List<String> list_2 = animal2.getAnimals();
        
        list_1.add("im ceo");
        list_2.add("bitch");
        
        System.out.println("1" + list_1);
        System.out.println("2" + list_2);
                
        
        for (String x : lista1) {
            System.out.println(" "+x);
        }
        
    }
    
}
