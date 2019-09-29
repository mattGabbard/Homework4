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
public class primeChecker {
    public static void main(String[] args) {
        
        String userInput_number = JOptionPane.showInputDialog(null, "Please enter a number to be tested");
        int setInput = Integer.parseInt(userInput_number);
        
        isPrime prime = new isPrime();
        prime.setInput(setInput);
        boolean bool = prime.getResult();
        
        if (bool == false) {
            JOptionPane.showMessageDialog(null, setInput + " is not a prime number");
        }
        else {
            JOptionPane.showMessageDialog(null, setInput + " is a prime number");
        }
    }
}