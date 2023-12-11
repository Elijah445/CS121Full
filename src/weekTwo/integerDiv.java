package weekTwo;

import java.util.Scanner;

public class integerDiv {
    public static void main(String[] args) {
        //Creating an instance of the Scanner class
        Scanner console = new Scanner(System.in);

//STRINGS
        //String color = "Blue";
        //color.concat("red");
        //color = color.concat("red");
        //System.out.print(color);

        String name = "Elijah";
        //.charAt() --> method of string class
        System.out.println(name.charAt(3));

        System.out.println(name.substring(0));
        System.out.println(" ");
        System.out.println(name.substring(0,1));
        //UPPERCASE
        System.out.println(name.toUpperCase());



        //Prompts User to enter name
        //System.out.print("Enter your name");
        //reads user input
        //String name = console.nextLine();
        //print out name
        //System.out.print(name);

        //System.out.print("Enter your age");
        //.nextInt
        //int age = console.nextInt();
        //System.out.print(age);

        //.nextDouble
        //System.out.print("Enter in gpa");
        //double gpa = console.nextDouble();
        //double gpa = Double.parseDouble(console.nextLine);
        //System.out.print(gpa);


        int numOne = 1;
        int numTwo = 4;
        double result = (double)numOne/(double)numTwo;

        //System.out.print(result);

        int numThree = 25;
        int numFour = 5;
        double result2 =(double)numThree/(double)numFour;
                //System.out.println(result2);
        //Close out your scanner
        console.close();
    }
}
