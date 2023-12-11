package week13.genericsActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMain {
    public static void main(String[] args) {
        GenericMethods generic = new GenericMethods();
        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(11,2004,6,8,2));
        //Integer[] intArray = {11,2004,6,8,2};

        ArrayList<Double> doubleArray = new ArrayList<>(Arrays.asList(1.6,10.19,20.1,6.3));
        //Double[] doubleArray = {1.6,10.19,20.1,6.3};

        ArrayList<Character> charArray = new ArrayList<>(Arrays.asList('E','L','I','J','A','H'));
        //Character[] charArray = {'E','L','I','J','A','H'};

        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Hello","Goodbye","How're You"));
        //String[] stringArray = {"Hello", "Goodbye", "How're You"};

        System.out.print("Integer Array: ");
        generic.printArrayList(intArray);
        System.out.print("Double Array: ");
        generic.printArrayList(doubleArray);
        System.out.print("Character Array: ");
        generic.printArrayList(charArray);
        System.out.print("String Array: ");
        generic.printArrayList(stringArray);


    }
}
