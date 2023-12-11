package weekFour;

import java.util.Random;

public class RandomNumPractice {
    public static void main(String[] args) {
        double value = Math.random();
        System.out.println("\nUsing Math.random():\ndouble value= Math.random() returns ---> "+value);

        Random rand = new Random();
        System.out.println("Using objects of rand");
        int randomInt = rand.nextInt(10);
        double randomDoub = rand.nextDouble(10);
        System.out.println("\nRandom ran= = new Random:\ndouble randomDoub = rand.nextDouble(10) :" +value);

    }
}
