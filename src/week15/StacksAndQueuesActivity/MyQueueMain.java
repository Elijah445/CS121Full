package week15.StacksAndQueuesActivity;

public class MyQueueMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(99);
        queue.enqueue(43);
        queue.enqueue(7);
        queue.enqueue(1);
        queue.enqueue(62);

        while(!queue.isEmpty()){
            int print = queue.dequeue();
            System.out.println(print);
        }

    }
}
