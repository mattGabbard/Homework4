import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PaintJob {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sqFtOfWallSpace = 0;
        int numberOfRooms = 0;

        while (numberOfRooms <= 0) {
           String userInput_Rooms = JOptionPane.showInputDialog(null, "Please enter how many rooms will be painted.");
           numberOfRooms = Integer.parseInt(userInput_Rooms);
            //numberOfRooms = scan.nextInt();

            if (numberOfRooms < 0) {
                JOptionPane.showMessageDialog(null, "Please enter a positive number.");
            }
        }

        for (int i = 1; i <= numberOfRooms; i++) {
            String userInput_Area = JOptionPane.showInputDialog(null, "Please enter the square footage of room " + i + ".");
            double sqFtCounter = Double.parseDouble(userInput_Area);
            sqFtOfWallSpace += sqFtCounter;
        }

        PaintJobEstimator myPaintJob = new PaintJobEstimator();
        myPaintJob.setSqFtOfWallSpace(sqFtOfWallSpace);
        myPaintJob.setGallonsOfPaint();
        myPaintJob.setHoursOfLabor();
        myPaintJob.setCostOfPaint();
        myPaintJob.setCostOfLabor();
        myPaintJob.setTotalCost();

        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.CEILING);

        JOptionPane.showMessageDialog(null,
                "Total gallons of paint: " + df.format(myPaintJob.getGallonsOfPaint()) + "\n"
                + "Total hours of labor: " + df.format(myPaintJob.getHoursOfLabor()) + "\n"
                + "Total cost of paint: $" + df.format(myPaintJob.getCostOfPaint()) + "\n"
                + "Total cost of labor: $" + df.format(myPaintJob.getCostOfLabor()) + "\n"
                + "Total cost: $" + df.format(myPaintJob.getTotalCost()));
    }
}
