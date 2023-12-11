package weekThree;

public class TermaryOperator {
    public static void main(String[] args) {
        boolean isSunny, isWarm;
        isSunny = true;
        isWarm = false;
        //Logic Operators
        // &&
        // ||
        if (isSunny && isWarm);{
            System.out.println("Lets go for ice cream");
        }//else

            System.out.println("Lets not get ice cream");
        if (isSunny || isWarm)
            System.out.println("It is either sunny or warm, Lets go for a walk");


    //Termany Operators
    //3 operands used
    // ? :
    // condition ? expression : expression2
    int num = 2;
    String result = (num % 2 == 0)? "Even" : "Odd";
    System.out.print("The number is " + result);

    }
}
