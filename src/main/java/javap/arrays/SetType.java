/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author vjrojasb
 */
public class SetType {
    
    Set<Integer> set1;
    Set<Integer> set2;

    public SetType() {
        this.set1 = new HashSet<>();
        this.set2 = new HashSet<>();
   
    }

  
    
    
    
    public Set<Integer> getSet1() {
        return set1;
    }

    public void setSet1(Set<Integer> set1) {
        this.set1 = set1;
    }

    public Set<Integer> getSet2() {
        return set2;
    }

    public void setSet2(Set<Integer> set2) {
        this.set2 = set2;
    }
    
    
}
