package week15.StacksAndQueuesActivity;

public class MyStackMain {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(30);
        stack.push(77);
        stack.push(100);
        stack.push(10);
        stack.push(45);

        while(!stack.isEmpty()){
            int pop = stack.pop();
            System.out.println(pop);
        }

    }
}
