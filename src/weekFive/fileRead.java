package weekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) {
        File inputFile1 = new File("C:/Users/gamed/Desktop/CS121/cs121/Activity10");
        File inputFile2 = new File("Activity10");

        try{
            Scanner input = new Scanner(inputFile1);
            while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
