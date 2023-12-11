package week13;

public class GenericNotes {
    public <E> void printArray(E[] inputArray){
        for(E element: inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
