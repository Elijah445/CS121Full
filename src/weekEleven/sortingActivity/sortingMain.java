package weekEleven.sortingActivity;

public class sortingMain {
    public static void main(String[] args) {
        Sorting bubble = new Sorting();
        int[] unsortedArray = bubble.getArray();
        System.out.println("Unsorted Array: ");
        for(int s: unsortedArray){
            System.out.println(s);
        }


        int[] sortedArray = bubble.sortArray(unsortedArray.clone());
        System.out.println("\nSorted Array: ");
        for(int s: sortedArray){
            System.out.println(s);
        }
    }
}
