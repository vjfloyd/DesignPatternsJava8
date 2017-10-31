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
public  abstract class Animal {
    
    public abstract String getOwner();
    public abstract String getRace();
    public abstract String getWeight();

    @Override
    public String toString() {
        return "Animal{" + "Owner="+ this.getOwner() + "Race="+ this.getRace() + "Weight= "+ this.getWeight() + '}';
    }
    
    
    
    
    
}
