package week15;

import java.util.Stack;

public class StackNotes {
    public static void main(String[] args) {
        //Creating a Stack
        Stack<String> CDs = new Stack<>();
        //Adding Item to stack
        CDs.push("Whole Lotta Red");
        CDs.push("Utopia");
        CDs.push("AstroWorld");
        CDs.push("Channel Orange");
        CDs.push("Blonded");

        System.out.println(CDs);

        System.out.println("See the last item added");
        //See the last item added
        System.out.println(CDs.peek());

        System.out.println("Is the stack empty?");
        //Check if the Stack is empty
        System.out.println(CDs.isEmpty());

        //Remove From Stack
        System.out.println("Remove Three Items from Stack");
        CDs.pop();
        CDs.pop();
        CDs.pop();
        System.out.println("After the removal of three items, what is on top?");
        System.out.println(CDs.peek());

    }
}
