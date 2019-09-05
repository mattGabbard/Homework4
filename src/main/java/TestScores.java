/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0749489
 */import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        final int numberOfGrades = 3; 
        //
        
        System.out.println("Please ensure all entries are positive numbers.");
        do {
          System.out.println("Please enter first grade: ");
          grade1 = scan.nextInt();  
        } while (grade1 <= 0);
        do {
          System.out.println("Please enter second grade: ");
          grade2 = scan.nextInt();
        } while (grade2 <= 0);
        do {
          System.out.println("Please enter third grade: ");
          grade3 = scan.nextInt();
        } while (grade3 <= 0);
       
        int averageGrade = (grade1 + grade2 + grade3)/numberOfGrades;
        
        char gradeLetter = gradeReturn(averageGrade);
        
        System.out.println("Average grade is " + averageGrade);
        System.out.println("Grade letter is " + gradeLetter);
    }
    public static char gradeReturn(int averageGrade) {
        
        char letterGrade = 'z';
        
        switch (letterGrade){
            case 1: if (90 >= averageGrade && averageGrade <= 100){
                letterGrade = 'A';}
                return letterGrade;
            case 2: if (80 >= averageGrade && averageGrade <= 89){
                letterGrade = 'B';}
                return letterGrade;
            case 3: if (70 >= averageGrade && averageGrade <= 79){
                letterGrade = 'C';}
                return letterGrade;
            case 4: if (60 >= averageGrade && averageGrade <= 69){
                letterGrade = 'D';}
                return letterGrade;
            case 5: if (averageGrade <= 59){
                letterGrade = 'F';}
                return letterGrade;
        }
    }
}
