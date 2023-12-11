package weekSix.classActivity;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {

        Nba Lakers =  new Nba("Lakers","Los Angeles","Lebron James");
        System.out.printf("Name: %s%n", Lakers.name);
        System.out.printf("Location: %s%n", Lakers.location);
        System.out.printf("StarPlayer: %s%n", Lakers.starplayer);
        System.out.println();

        Nfl Bengals = new Nfl("Bengals","Cininnati","Joe Burrow");
        Bengals.getNflInfo();





    }
}
