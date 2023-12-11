package weekFive;

import java.util.Scanner;

//Elijah
//Eli
//Andrew

public class budjet {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int expense;
        int totalexpense = 0;
        System.out.println("What is your budget for the month?");
        int bud = Integer.parseInt(console.nextLine());

        System.out.println("How many expenses do you have for this month?");
        expense = Integer.parseInt(console.nextLine());

        for(int i = 1 ; i <=expense ; i++){
            System.out.println("How much is this expense");
           int cost = Integer.parseInt(console.nextLine());
           totalexpense += cost;
        }
        int OU = totalexpense - bud;
        if(OU < 0){
            System.out.println("Your budget is under"+ OU +"\n");
        }else{
            System.out.println("Your budget is over"+ OU+"\n");
        }
        System.out.println("Your total expense was:"+totalexpense+ "\n");
        System.out.println("Your budget was:"+bud+ "\n");


    }
}
