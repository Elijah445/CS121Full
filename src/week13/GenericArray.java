package week13;

public class GenericArray {
    public static void main(String[] args) {
        GenericNotes generic = new GenericNotes();
        Integer[] intArray = {11,2004,6,8,2};
        Double[] doubleArray = {1.6,10.19,20.1,6.3};
        Character[] charArray = {'E','L','I','J','A','H'};
        String[] stringArray = {"Hello", "Goodbye", "How're You"};

        System.out.print("Integer Array: ");
        generic.printArray(intArray);
        System.out.print("Double Array: ");
        generic.printArray(doubleArray);
        System.out.print("Character Array: ");
        generic.printArray(charArray);
        System.out.print("String Array: ");
        generic.printArray(stringArray);
    }
}
