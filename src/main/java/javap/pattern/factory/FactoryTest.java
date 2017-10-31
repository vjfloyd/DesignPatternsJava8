/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap.pattern.factory;

/**
 *
 * @author vjrojasb
 */
public class FactoryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       // System.err.println("animal"+ Cat.class.getSimpleName());
       Animal cat =  AnimalFactory.getSpecificAnimal("Cat", "vj", "20kg","angora");
       Animal dog =  AnimalFactory.getSpecificAnimal("Dog", "vj", "10kg", "dog");
       cat.getOwner();
        System.err.println("Factory CAT" + cat);
        System.out.println("Factory Dog" + dog);
        
    }
    
}
