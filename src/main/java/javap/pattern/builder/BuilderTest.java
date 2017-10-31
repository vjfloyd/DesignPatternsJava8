/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap.pattern.builder;

/**
 *
 * @author vjrojasb
 */
public class BuilderTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal =  new Animal.AnimalBuilder("pedro","gato","3kg").setIsDagerous(true).setIsFriendly(true)
                .setIsLoyal(true).build();
        
    }
    
}
