package com.company.stack;

//import com.company.queue.QueueImplementationUsingStack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingQueue {
    static Queue<Integer> queue1;
    static Queue<Integer> queue2;

    StackImplementationUsingQueue(){
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    public static void add(int data){
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        queue1.add(data);
        while(!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
    }
    public  static int remove(){
        return queue1.remove();
    }
    public  static int top(){
        return queue1.peek();
    }
    public static boolean empty(){
        if(queue1.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        StackImplementationUsingQueue stack=new StackImplementationUsingQueue();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.remove());
        System.out.println(stack.top());
    }
}
