package weekEleven.sortingActivity;

import java.util.Scanner;

public class Sorting {
    //Scanner scanner = new Scanner(System.in);
    public int[] getArray(){
        Scanner scanner = new Scanner(System.in);
        int[] unsorted = new int[5];
        System.out.println("Enter 5 unsorted integers");

        for(int i = 0; i < unsorted.length; i++){
            System.out.print("Enter integer " + (i+1) + ": ");
            unsorted[i] = scanner.nextInt();
        }
        scanner.close();
        return unsorted;
    }

    public int[] sortArray(int[] unsorted){
        int temp;
        int n = unsorted.length;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                if(unsorted[j-1] > unsorted[j]){
                    temp = unsorted[j-1];
                    unsorted[j-1] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        return unsorted;
    }

}
