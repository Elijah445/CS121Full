package weekNine;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        //Scanner Instance
        Scanner keyboard = new Scanner(System.in);
        //Array to hold Movie Info
        String[] movieName = new String[3];
        String[] movieGenre = new String[3];
        int[] movieTime = new int[3];

        for(int i = 0; i < 3; i++) {
            //Get movie info
            System.out.println("Enter the name of the movie" + (i + 1)+ ":");
            movieName[i] = keyboard.nextLine();
            //Get genre info
            System.out.println("Enter the genre of the movie" + (i + 1)+ ":");
            movieGenre[i] = keyboard.nextLine();
            //Movie time info
            System.out.println("Enter the run-time of the movie in minutes" + (i + 1)+ ":");
            movieTime[i] = Integer.parseInt(keyboard.nextLine());
        }
        for(int i = 0; i < 3; i++){
            System.out.println("\nMovie Info");
            System.out.println("-----------------------");
            System.out.println("Name\tGenre\tTime");
            System.out.println(movieName[i] + "\t" + movieGenre[i]+ "\t"+ movieTime[i]);
        }
    }
}
