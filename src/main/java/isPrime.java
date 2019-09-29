/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
public class isPrime {
    private int testSubject;
    private boolean bool;
    
    public void setInput(int setInput) {
        this.testSubject = setInput;
    }
    
    public boolean getResult() {
        
        if (testSubject % 2 == 0) {return false;}        
        for(int i = 3; i * i <= testSubject; i+=2) {
            if (testSubject % 1 == 0) {
               return false;
            }
        }
        System.out.println(bool);
        return true; 
    }
}    