package weekFour;

import javax.swing.*;

public class GuessingGame2 {
    public static void main(String[] args) {
        int x = 54;
        int numOfGuesses = 0;
        while(true){
            String values = JOptionPane.showInputDialog("Guess a number between 1 and 100 or enter 'q' to quit");
            numOfGuesses +=1;
            if(values.equals("q")){
                JOptionPane.showMessageDialog(null,"You Quitter! The number was 54.");
                break;
            }else{
                int num = Integer.parseInt(values);
                if(num > x){
                    JOptionPane.showMessageDialog(null,"Too High, Guess again!");
                }else if(num < x){
                    JOptionPane.showMessageDialog(null,"Too Low, Guess again!");
                }else{
                    JOptionPane.showMessageDialog(null, String.format("Correct! You guessed %d times.", numOfGuesses));
                    break;
                }

            }

        }

    }
}
