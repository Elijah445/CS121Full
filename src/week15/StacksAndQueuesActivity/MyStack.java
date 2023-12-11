package week15.StacksAndQueuesActivity;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;


public class MyStack {
   private ArrayList<Integer>stack;
   public MyStack(){
      this.stack = new ArrayList<>();
   }

   void push(int element){
      stack.add(element);
   }

    int pop(){
      if(stack.isEmpty()){
         throw new EmptyStackException();
      }else{
         int topElement = stack.remove(stack.size() -1);
         return topElement;
      }
   }

   int peek(){
      if(stack.isEmpty()){
         throw new EmptyStackException();
      }else{
         return stack.get(stack.size() -1);
      }
   }

   boolean isEmpty(){
      return stack.isEmpty();
   }

}
