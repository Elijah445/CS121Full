package weekEleven.bigOActivity;


public class testBigO {
    public static void main(String[] args) {
        BigO num1 = new BigO();
        num1.printOnce(7);

        BigO phrase = new BigO();
        phrase.printNTimes(3,"Hello");

        BigO phrase2 = new BigO();
        phrase2.printNSquaredTimes(2,"Goodbye");
    }
}
