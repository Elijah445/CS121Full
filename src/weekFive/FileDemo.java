package weekFive;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("Course");
        //DR
        //File file2 = new File("C:\\Users\\gamed\\Desktop\\CS121\\cs121\\src\\Course");

        //try Catch
        try {

            //Read file by using scanner
            Scanner console = new Scanner(file);
            String header = console.nextLine();
            //Throw exception
            while (console.hasNextLine()) {
                //Variables
                //String Line = console.nextLine();
                //System.out.println(Line);
                String course = console.next();
                int credits = Integer.parseInt(console.next());
                int score = Integer.parseInt(console.next());
                System.out.printf(" %-7s %3d %7d \n",course,credits,score);
            }
            console.close();
        }catch(FileNotFoundException e){
            //e.printStackTrace();
            System.err.println(" File not found, check your path");
        }


    }
}
