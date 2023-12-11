package week15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueNotes {
    public static void main(String[] args) {
        //Create Queue
        Queue<Integer> queue = new LinkedList<>();
        //Add to Queue
        queue.add(7);
        queue.add(9);
        queue.add(19);
        queue.add(63);
        queue.add(32);
        queue.add(4);

        System.out.println(queue);
        //Check Size
        System.out.println(queue.size());

        System.out.println(queue.peek());
        //Remove
        queue.remove();
        queue.remove();
        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());

        System.out.println(queue.offer(8));
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue);




    }
}
