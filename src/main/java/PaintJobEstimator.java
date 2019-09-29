/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0749489
 */import java.util.Scanner;
public class PaintJobEstimator {
    private double sqFtOfWallSpace;
    private double gallonsOfPaint;
    private double hoursOfLabor;
    private double costOfPaint;
    private double costOfLabor;
    private double totalCost;
    
    public PaintJobEstimator() {
    }
    
    public void setSqFtOfWallSpace(double sqFtOfWallSpace) {
        this.sqFtOfWallSpace = sqFtOfWallSpace;
    }
    
    public void setGallonsOfPaint() {
        this.gallonsOfPaint = sqFtOfWallSpace / 115;
    }
    
    public void setHoursOfLabor() {
        this.hoursOfLabor = (sqFtOfWallSpace / 115) * 8;
    }
    
    public void setCostOfPaint() {
        this.costOfPaint = gallonsOfPaint * 5;
    }
    
    public void setCostOfLabor() {
        this.costOfLabor = hoursOfLabor * 18;
    }
    
    public void setTotalCost() {
        this.totalCost = costOfLabor + costOfPaint;
    }
    
    public double getGallonsOfPaint() {
        return this.gallonsOfPaint;
    }
    
    public double getHoursOfLabor() {
        return this.hoursOfLabor;
    }
    
    public double getCostOfPaint() {
        return this.costOfPaint;
    }
    
    public double getCostOfLabor() {
        return this.costOfLabor;
    }
    
    public double getTotalCost() {
        return this.totalCost;
    }
}
