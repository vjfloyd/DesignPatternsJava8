/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap.exam.chapters;

/**
 *
 * @author vjrojasb
 */
public class Chapter_1 {

    private String var_a;
    private boolean var_b;
    private Boolean var_c;
    
    
    
    public static void main(String[] args) {
        
        short ___a = 1;
        int b = (int) 2.5;
        String name = "name";
        name.length();
        
        Chapter_1 chap = new Chapter_1();
        
        System.out.println(" var_a => " + chap.var_a);
        System.out.println(" var_b => " + chap.var_b);
        System.err.println(" var_c => " + chap.var_c);
        
    }
    
}
