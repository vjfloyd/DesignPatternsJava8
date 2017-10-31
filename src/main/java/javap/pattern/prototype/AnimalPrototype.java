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
public class AnimalPrototype implements Cloneable{
    
    private List<String> animalsList;

    public AnimalPrototype() {
      animalsList = new ArrayList<>();
    }
    
    public AnimalPrototype(List<String> lista){
        this.animalsList = lista;
    }
    
    
    public List<String> getAnimals() {
        return animalsList;
    }

    public void setAnimals(List<String> Animals) {
        this.animalsList = Animals;
    }
    
    public void loadData(){
       //carga objetos de la BD
       animalsList.add("dog");
       animalsList.add("cat");
       animalsList.add("bird");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String ge : this.getAnimals()) {
            temp.add(ge);
        }
        return new AnimalPrototype(temp);
    }
    
    
    
}
