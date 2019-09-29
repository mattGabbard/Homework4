/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class evenOddCheck {
    public static void main(String[] args) {
        int[] aArray = new int[100];
    
        for(int i = 0;i <= aArray.length - 1; i++) {
            Random rand = new Random();
            aArray[i] = rand.nextInt(Integer.MAX_VALUE);
        }
    
        isEven evenOddCheck = new isEven();
        evenOddCheck.setNumber(aArray);
        evenOddCheck.result();
        
        JOptionPane.showMessageDialog(null, "Total of even numbers: " + evenOddCheck.returnEven() + "\n"
                                          + "Total of odd numbers: " + evenOddCheck.returnOdd());    
    }
}
