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
public class Animal {
    
    private String owner;
    private String race;
    private String weight;

    private boolean isDangerous;
    private boolean isFriendly;
    private boolean isLoyal; 
    
    public String getOwner() {
        return owner;
    }

    public String getRace() {
        return race;
    }

    public String getWeight() {
        return weight;
    }

    public boolean isIsDangerous() {
        return isDangerous;
    }

    public boolean isIsFriendly() {
        return isFriendly;
    }

    public boolean isIsLoyal() {
        return isLoyal;
    }
    
    public Animal (AnimalBuilder builder){
        this.isDangerous = builder.isDangerous;
        this.isFriendly = builder.isFriendly;
        this.isLoyal = builder.isLoyal;
        this.owner = builder.owner;
        this.race = builder.race;
        this.weight = builder.weight;
    }
   
    public static class  AnimalBuilder{
        
         //required parameter
    private String owner;
    private String race;
    private String weight;
    
    //optional parameter
    private boolean isLoyal;
    private boolean isDangerous;
    private boolean isFriendly;
    
    
    public AnimalBuilder(String owner, String race, String weight){
        owner = this.owner;
        race = this.race;
        weight = this.weight;
    }
    
    public AnimalBuilder setIsLoyal(boolean  isLoyal){
       this.isLoyal = isLoyal;
       return this;
    }
    public AnimalBuilder setIsDagerous(boolean  isDangerous){
       this.isDangerous = isDangerous;
       return this;
    }
    public AnimalBuilder setIsFriendly(boolean  isFriendly){
       this.isFriendly = isFriendly;
       return this;
    }
    
    public Animal build(){
      return new Animal(this);
    }
 
    }
    
    //Okhttp usa Builder
    
    
}
