package week13;

import java.util.LinkedList;

public class LinkedListNotes {
    public static void main(String[] args) {
        //Is a linear data structure
        //Memory efficient
        //Insertion and deletion has good performance

        //Types of linked lists
        //1.Singly Linked
        //2.Doubly Linked
        //3.Circular Linked

        //How to declare
        LinkedList<String> names = new LinkedList<>();

        names.add("Robert");
        names.add("Brady");
        names.add("Mark");
        names.add("Jackson");
        names.add("Peter");
        System.out.println(names);
        names.add(1,"Raymond");
        System.out.println(names);
        names.get(3);


    }
}


