package weekNine;

public class ArrayMain {
    public static void main(String[] args){
            //Declare an array
            int[] seating; //Most common way to declare an array
            int SEATING[]; //Second way to declare

            //declare on same line
            int[] numOne, numTwo[], numThree[];

            //Declaring on one line
            String[] names = new String[3]; //size of 3
            seating = new int [5];
            final int MAXCAPACITY = 30;
            int[] maxClassCanHold = new int[MAXCAPACITY];
            String[] movie = {"Scream", "Spider-Man", "The Batman"};
            movie[0]="Avengers";
            movie[1]="The Batman";
            System.out.println("\nThis is the movie : "+ movie[0]);

            for(int i = 0; i <3 ; i++)
            {
                System.out.println("\n This is the movie "+ (i+1) + movie[i]);
            }
        //If you don't know the exact number of time you want to enter data
        for(int i = 0; i <movie.length ; i++)
        {
            System.out.println("\n This is the movie "+ (i+1) + movie[i]);
        }

        }
}
