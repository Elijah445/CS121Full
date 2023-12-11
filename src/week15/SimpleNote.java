package week15;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SimpleNote {
    public static void main(String[] args) {
        //Create and object of DateFormat class and initialize using SimpleDateFormat
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        //Prompt user to enter birthday
        String DOB = JOptionPane.showInputDialog("Enter your Birthday: In this format MM/dd/yyyy");
        //Prompt user to enter current day
        String CurrentDate = JOptionPane.showInputDialog("Enter the current date: In this format MM/dd/yyyy");

        //parsing
        //Handles parse exception
        //try()catch(ParseException e){ e.printStackTrace();}
        int day = 0;
        try{
            Date date1 = dateFormat.parse(DOB);
            Date date2 = dateFormat.parse(CurrentDate);
            //Unix epoch January 1 1978
            String DOBFormatted = date1.toString();
            String CurrentDateFormatted = date2.toString();

            // Millisecond Day, Years
            long difference = date2.getTime() - date1.getTime();
            day = (int)TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
            double years = day/365.25;

            JOptionPane.showMessageDialog(null,String.format("Your Birthday is: %s%nThe Current Day: %s%nYou are %d MILLISECONDS old%nYou are %.3f years old%nYou are %d Days old%n",DOBFormatted,CurrentDateFormatted,difference,years,day));

        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
