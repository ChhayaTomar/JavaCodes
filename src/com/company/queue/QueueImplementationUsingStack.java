package com.company.queue;

import java.util.Stack;

public class QueueImplementationUsingStack {
    static Stack<Integer> stack1;
    static Stack<Integer> stack2;

    QueueImplementationUsingStack(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    public static void add(int data){
       stack1.push(data);
    }
    public static int remove(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res=stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return res;
    }
    public static int peek(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res=stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return res;
    }
    public static boolean isEmpty(){
        if(stack1.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        QueueImplementationUsingStack queue=new QueueImplementationUsingStack();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
