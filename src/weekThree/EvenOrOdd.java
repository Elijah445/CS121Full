package weekThree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number:\n");
        int number = Integer.parseInt(console.nextLine());

        if (number % 2 ==0)
        {
            System.out.println("This is an even number");
        }
        else
        {
            System.out.println("This is an odd number");
        }
        console.close();


    }
}
