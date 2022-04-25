package com.company.queue;

public class main {
    public static void main(String[] args) {
        //playAroundQueue();
        QueueUsingArrayList queue=new QueueUsingArrayList();
        queue.enqueue(10);
        queue.enqueue(50);
        queue.enqueue(140);
        queue.enqueue(106);
        queue.enqueue(17);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.size());
    }
//    public static void playAroundQueue(){
//        QueueUsingArrayList queue=new QueueUsingArrayList();
//        queue.enqueue(10);
//        queue.enqueue(50);
//        queue.enqueue(140);
//        queue.enqueue(106);
//        queue.enqueue(17);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.size());
//    }
}
