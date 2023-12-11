package weekFour;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students;
        int numOfTestScores;
        int testScore;
        int avgtest;

        System.out.println("How many students are there");
        students = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of test per student");
        numOfTestScores = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= students; i++) {
            testScore = 0;
            System.out.printf("Student number %d\n", i);
            System.out.println("-".repeat(14));
            for (int j = 1; j <= numOfTestScores; j++) {
                System.out.printf("Enter Score %d: ", j);
                avgtest = Integer.parseInt(scanner.nextLine());
                testScore += avgtest;

            }
            System.out.printf("The average for student %d: %d\n\n", i, testScore / numOfTestScores);
        }
    }
}
