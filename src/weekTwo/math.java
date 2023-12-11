package weekTwo;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        //Scanner
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your first number:");
        int numOne = Integer.parseInt(console.nextLine());

        System.out.print("Enter the 2nd number: ");
        int numTwo = Integer.parseInt(console.nextLine());
        int add = (numOne + numTwo);
        int sub = (numOne - numTwo);
        //Multiplication
        //division
        //Square root
        double sqrt1 = Math.sqrt(numOne);
        //Square root of 2nd number

        System.out.printf("The number %d + %d = %d%n", numOne,numTwo,add);
        System.out.printf("The number %d - %d = %d%n", numOne,numTwo,sub);
        //print multiplication
        //print division
        System.out.printf("The square root of %d is = %.2f",numOne,sqrt1);
        //print square root of 2nd number

        double power1 = Math.pow(numOne,numTwo);
        System.out.printf("The power of %d and %d is: %d", numOne,numTwo,power1);
        //2nd number print


        double log1 = Math.log(numOne);
        System.out.printf("The log of %d is : %.2f", numOne,log1);

        //Math.max()
        System.out.println(Math.max(3,5));
        //Math.min()
        System.out.println(Math.min(3,7));
        System.out.println(Math.abs(-29));
    }
}
