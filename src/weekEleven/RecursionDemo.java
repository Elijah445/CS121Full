package weekEleven;

public class RecursionDemo {
    public static void main(String[] args) {
        //1. Base Case
        //2. Recursive Case
        int num = 7;
        //Recursive call
        System.out.println("The factorial of 7 is "+ factorial(num));
    }
    public static int factorial(int num)
    {
        //1. Base Case
        if(num == 0){
            return 1;
        }else{
            //2. Recursive Case
            return num * factorial(num -1);
        }
    }

}
