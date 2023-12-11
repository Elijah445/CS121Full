package weekFive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Append {
    public static void main(String[] args) throws IOException {
        try{
            //Create an instance
            FileWriter filewrite = new FileWriter("Course",true);
            PrintWriter output = new PrintWriter(filewrite);

            String course = JOptionPane.showInputDialog("Enter your course name: ");
            String credits = JOptionPane.showInputDialog("Enter course credits: ");
            String score = JOptionPane.showInputDialog("Enter course score: ");
            output.printf("%s %s%s", course,credits,score);


            filewrite.close();
            output.close();
        }catch(FileNotFoundException e){
            System.err.println("Error fix something");
        }
    }
}
