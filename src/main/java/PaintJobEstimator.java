/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0749489
 */
public class PaintJobEstimator {
    private double gallonsOfPaint;
    private double hoursOfLabor;
    private double costOfPaint;
    private double costOfLabor;
    private double totalCost;
    
    public PaintJobEstimator() {
    }
    
    public double setGallonsOfPaint() {
        return gallonsOfPaint = sqFtOfWallSpace / 115;
    }
    
    public double setHoursOfLabor() {
        return hoursOfLabor = ((sqFtOfWallSpace / 115) * 8);
    }
    
    public double setCostOfPaint() {
        return costOfPaint = gallonsOfPaint * 5;
    }
    
    public double setCostOfLabor() {
        return costOfLabor = hoursOfLabor * 18;
    }
    
    public double setTotalCost() {
        return totalCost = costOfLabor + costOfPaint;
    }
}
