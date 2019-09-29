/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
public class isEven {
    private int[] evenOddTest;
    private int evenCount;
    private int oddCount;
    
   public void setNumber(int[] aArray) {
       this.evenOddTest = aArray;
   }
   
   public int returnEven() {
       return evenCount;
   }
   
   public int returnOdd() {
       return oddCount;
   }
    
   public void result() {
       for(int i = 0;i < evenOddTest.length; i++)
           if (evenOddTest[i]%2 == 0) {
               evenCount += 1;
           }
           else {
               oddCount += 1;
           }
   }
}
