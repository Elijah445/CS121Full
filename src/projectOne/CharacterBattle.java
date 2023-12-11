package projectOne;

import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random num = new Random();
        int player1wins = 0;
        int player2wins = 0;
        int roundnum;
        int rounds;




        System.out.print("Enter an odd number of rounds:");
        roundnum = Integer.parseInt(scanner.nextLine());
        
        for(rounds = 1; rounds <= roundnum; rounds++){
            System.out.println("Round" + rounds);
            System.out.println("-".repeat(14));
            //player1
            System.out.println("Enter Player 1s stats");
            System.out.println("Enter the name");
            String name1 = scanner.nextLine();
            System.out.println("Enter hp");
            int hp1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter move");
            String move1 = scanner.nextLine();
            System.out.println("Enter how much damage does the move do");
            int damage1 = Integer.parseInt(scanner.nextLine());
            System.out.println("What is the attack speed of the move");
            int attackSpeed1 = Integer.parseInt(scanner.nextLine());
            System.out.println();
            //player 2
            System.out.println("Enter Player 2s stats");
            System.out.println("Enter the name");
            String name2 = scanner.nextLine();
            System.out.println("Enter hp");
            int hp2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter move");
            String move2 = scanner.nextLine();
            System.out.println("Enter how much damage does the move do");
            int damage2 = Integer.parseInt(scanner.nextLine());
            System.out.println("What is the attack speed of the move");
            int attackSpeed2 = Integer.parseInt(scanner.nextLine());

            while(hp1 > 0 && hp2 > 0)
            {
                if(attackSpeed1 > attackSpeed2)
                {
                    hp2 -= damage1;
                    if(hp2 < 0){
                        System.out.printf("Player 1 %s wins the round", name1);
                        player1wins++;
                    }
                    hp1 -= damage2;
                    if(hp1 < 0){
                        System.out.printf("Player 2 %s wins the round", name2);
                        player2wins++;
                    }
                }
                else if(attackSpeed2 > attackSpeed1)
                {
                    hp1 -= damage2;
                    if(hp1 < 0){
                        System.out.printf("Player 2 %s wins the round", name2);
                        player2wins++;
                    }
                    hp2 -= damage1;
                    if(hp2 < 0){
                        System.out.printf("Player 1 %s wins the round", name1);
                        player1wins++;
                    }
                }else{
                    int number = num.nextInt(2);
                    if(number == 1){
                        hp2 -= damage1;
                        if(hp2 < 0){
                            System.out.printf("Player 1 %s wins the round", name1);
                            player1wins++;
                        }
                        hp1 -= damage2;
                        if(hp1 < 0){
                            System.out.printf("Player 2 %s wins the round", name2);
                            player2wins++;
                        }
                    }else{
                        hp1 -= damage2;
                        if(hp1 < 0){
                            System.out.printf("Player 2 %s wins the round", name2);
                            player2wins++;
                        }
                        hp2 -= damage1;
                        if(hp2 < 0) {
                            System.out.printf("Player 1 %s wins the round", name1);
                            player1wins++;
                        }
                    }
                }

            }
            System.out.println("\nwins");
            System.out.println("Player 1 Wins: " + player1wins);
            System.out.println("Player 2 Wins: " + player2wins);
            System.out.println();

        }

        System.out.println("\nFinal Score");
        System.out.println("Player 1 Wins: " + player1wins);
        System.out.println("Player 2 Wins: " + player2wins);

        if(player1wins > player2wins){
            System.out.println("Player 1 has won the game");
        }else if(player2wins >player1wins){
            System.out.println("Player 2 has won the game");
        }else{
            System.out.println("Its a tie");
        }

        scanner.close();






    }
}
