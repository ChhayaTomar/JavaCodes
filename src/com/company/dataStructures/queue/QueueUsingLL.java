package com.company.dataStructures.queue;

import java.util.LinkedList;

public class QueueUsingLL {

    public static class Queue {
        //LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll;
        public Queue(){
            ll=new LinkedList<>();
        }

        public void add(int data) {
            ll.addLast(data);
        }

        public int remove() {
            return (ll.removeFirst());
        }

        public int peek() {
            return (ll.peekFirst());
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.ll.size());
        System.out.println(queue.remove());
        System.out.println(queue.ll.size());
        System.out.println(queue.peek());
        System.out.println(queue.ll.size());

    }

}
