package week15.dateFormatActivity;


import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class TotalCalories {
    public String startDate;
    public String endDate;

    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    public TotalCalories(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public double calculateTotalCalories(int caloriesPerDay) {
        int days = calculateNumberOfDays();
        double totalCalories = days * caloriesPerDay;

        JOptionPane.showMessageDialog(null, String.format("Your total calories consumed are %.2f%n", totalCalories));
        return totalCalories;
    }


    public int calculateNumberOfDays(){
        int day = 0;
        try{
            Date date1 = dateFormat.parse(startDate);
            Date date2 = dateFormat.parse(endDate);
            long difference = date2.getTime() - date1.getTime();
            day = (int)TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        }catch(ParseException e){
            e.printStackTrace();
        }
        return day;


    }

}