package week15.StacksAndQueuesActivity;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyQueue {
    Queue<Integer> queue = new LinkedList<>();

    void enqueue(int element){
        queue.add(element);
    }

    int dequeue(){
        if(queue.isEmpty()){
            throw new NoSuchElementException();
        }else{
            return queue.poll();
        }
    }

    int peek(){
        if(queue.isEmpty()){
            throw new NoSuchElementException();
        }else{
            return queue.element();
        }
    }

    boolean isEmpty(){
        return queue.isEmpty();
    }


}
