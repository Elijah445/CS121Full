package weekFour;

import java.util.Scanner;

public class AverageRainFall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years;
        int months;
        double totalRainfall = 0;
        double averageRainfall;

        System.out.println("Enter the number of years:");
        years = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of months per year:");
        months = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= years; i++) {
            for (int month = 1; month <= months; month++) {
                System.out.printf("Enter rainfall for Year %d, Month %d: ", i, month);
                double rainfall = Double.parseDouble(scanner.nextLine());
                totalRainfall += rainfall;
                    }
                }

        int totalMonths = years * months;
        averageRainfall = totalRainfall / totalMonths;

        System.out.println("Total rainfall over " + totalMonths + " months: " + totalRainfall + " inches");
        System.out.println("Average rainfall per month: " + averageRainfall + " inches");




            }
        }



