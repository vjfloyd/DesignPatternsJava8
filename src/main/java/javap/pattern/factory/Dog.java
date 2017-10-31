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
public class Dog extends Animal{

    public String owner;
    public String race;
    public String weight;
 
    public Dog(String owner, String race, String weight) {
        this.owner = owner;
        this.race = race;
        this.weight = weight;
    }
    
    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public String getRace() {
        return this.race;
    }

    @Override
    public String getWeight() {
        return this.weight;
    }
    
    
}
