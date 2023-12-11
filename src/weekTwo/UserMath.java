package weekTwo;

import java.util.Scanner;

public class UserMath {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a number");
        int numOne = Integer.parseInt(console.nextLine());
        System.out.print("Please enter another number");
        int numTwo = Integer.parseInt(console.nextLine());

        int add = (numOne + numTwo);
        int sub = (numOne - numTwo);
        int multi = (numOne * numTwo);
        int div = (numOne / numTwo);
        double sqrt1 = Math.sqrt(numOne);
        double sqrt2 = Math.sqrt(numTwo);
        double power1 = Math.pow(numOne,numTwo);
        double log1 = Math.log(numOne);
        double log2 = Math.log(numTwo);

        System.out.printf("The numbers %d + %d = %d%n", numOne, numTwo, add);
        System.out.printf("The numbers %d - %d = %d%n", numOne, numTwo, sub);
        System.out.printf("The numbers %d * %d = %d%n", numOne, numTwo, multi);
        System.out.printf("The numbers %d / %d = %d%n", numOne, numTwo, div);
        System.out.printf("The square root of %d is %.2f" , numOne, sqrt1);
        System.out.printf(" The square root of %d is %.2f" , numTwo, sqrt2);
        System.out.printf(" The power of %d and %d is:%.2f ", numOne,numTwo,power1);
        System.out.printf(" The log of %d is:%.2f" , numOne, log1);
        System.out.printf(" The log of %d is:%.2f" , numTwo, log2);








    }
}
