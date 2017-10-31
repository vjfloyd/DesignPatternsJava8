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
public class AnimalFactory {
    
    public static Animal getSpecificAnimal(String animal, String owner, String weight, String race){
        if("Dog".equalsIgnoreCase(animal)){
            return new Dog(owner,weight, race);
        }else if("Cat".equalsIgnoreCase(animal)){
            return new Cat(owner, race, weight);
        }
        return null;
    }
}
