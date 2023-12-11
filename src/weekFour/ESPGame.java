package weekFour;

import java.util.Scanner;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int correct = 0;
        int number;
        String color;
        String guess;


        for(int i = 1 ; i <= 10; i++){
            number = random.nextInt(5);

            if(number == 0){
                color = "red";
            }else if(number == 1){
                color = "green";
            }else if(number == 2){
                color = "blue";
            }else if(number ==3){
                color = "orange";
            }else{
                color = "yellow";
            }

            System.out.printf("What color has the computer chosen?", i);
            guess = keyboard.nextLine();
            System.out.printf("The computer chose %s%n", color);

            if(guess.equals(color)){
                correct++;
            }

        }
        System.out.printf("%nYou got %d out of 10 correct", correct);




    }
}


