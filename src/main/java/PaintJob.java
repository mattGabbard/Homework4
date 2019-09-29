/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0749489
 */import java.util.Scanner;
public class PaintJob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the square footage of the room.");
        double sqFtOfWallSpace = scan.nextDouble();
        PaintJobEstimator myPaintJob = new PaintJobEstimator();
        myPaintJob.setSqFtOfWallSpace(sqFtOfWallSpace);
        myPaintJob.setGallonsOfPaint();
        myPaintJob.setCostOfPaint();
        System.out.println(myPaintJob.getCostOfPaint());
     System.out.println(myPaintJob.getGallonsOfPaint());
    }
}
