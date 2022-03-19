package com.company.dataStructures.stack;

public class StackUsingLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Stack{
        Node head;
        int size;

        Stack(){
            this.head=null;
            this.size=0;
        }

        public void push(int data){
            Node node=new Node(data);
            if(head==null) {
                head=node;
                size++;
            }
            else{
                node.next=head;
                head=node;
                size++;
            }
        }

        public int pop(){
            if(head==null) return -1;
            Node curr=head;
            head=head.next;
            size--;
            return curr.data;
        }

        public int peek(){
            if(head==null) return -1;
            return head.data;
        }

        public boolean isEmpty(){
            if(head==null) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack();

        System.out.println(stack.isEmpty());
        System.out.println("Size = " + stack.size);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Size = " + stack.size);
        System.out.println(stack.peek());
        System.out.println("Size = " + stack.size);
        System.out.println(stack.pop());
        System.out.println("Size = " + stack.size);
        System.out.println(stack.peek());
        System.out.println("Size = " + stack.size);
        System.out.println(stack.isEmpty());
        System.out.println("Size = " + stack.size);
    }
}
