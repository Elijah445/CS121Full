package week15.dateFormatActivity;

import javax.swing.*;

public class TotalCaloriesMain {
    public static void main(String[] args) {
        String CalorieAllowed = JOptionPane.showInputDialog("Enter the amount of calories allowed per day for your diet");
        String startDate = JOptionPane.showInputDialog("Enter the day you plan on starting your diet in mm/dd/yyyy format");
        String endDate = JOptionPane.showInputDialog("Enter the day the diet will end in mm/dd/yyyy format");

        TotalCalories calculate = new TotalCalories(startDate,endDate);
        int caloriesPerDay = Integer.parseInt(CalorieAllowed);
        calculate.calculateTotalCalories(caloriesPerDay);
    }
}
