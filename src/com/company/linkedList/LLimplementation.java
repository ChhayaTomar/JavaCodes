package com.company.linkedList;

public class LLimplementation {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    int size=0;

    //methods of linkedlist
    public void insertAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            size++;
        } else {
            //1 2 3
            Node i = head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = node;
            size++;
        }
    }

    public void insertAtFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            size++;
        }else{
            node.next=head;
            head=node;
            size++;
        }
    }

    public void removeFromLast(){
        if(head==null) System.out.println("Linked List is empty !!");
        else{
            Node i=head;
            while(i.next.next != null){
                i=i.next;
            }
            i.next=null;
            size--;
        }
    }

    public void removeFromFirst(){
        if(head==null) System.out.println("Linked List is empty !!");
        else{
            head=head.next;
            size--;
        }
    }

    public void insertAtGivenIndex(int data, int x){
        Node node=new Node(data);
        if(head==null && x!=0) System.out.println("not possible as linked list is empty");
        else if(head==null && x==0){
            head=node;
            size++;
        }else{
            int i=0;
            Node curr=head;
            Node prev=null;
            while(i<x){
                prev=curr;
                curr=curr.next;
                i++;
            }
            prev.next=node;
            node.next=curr;
            size++;
        }
    }

    public void removeFromGivenIndex(int x){
        if(head==null) System.out.println("not possible as linked list is empty");
        else if(x==0) {
            head=head.next;
            size--;
        }else{
            /*
              if (head == null) return;
        int i = 0;
        Node a = head;
        if (index == 0) {
            head = head.next;
        }
        while (i < index - 1) {
            a = a.next;
            i++;
        }
        if (a.next == null || a == null) return;
        else {
            a.next = a.next.next;
        }

             */
            int i=0;
            Node curr=head;
            Node prev=null;
            while(i<x){
                if(curr==null) break;
                prev=curr;
                curr=curr.next;
                i++;
            }
            if(curr==null) {
                prev.next=curr;
                return;
            }
            prev.next=curr.next;
            size--;
        }
    }

    public void display(){
        if(head==null) System.out.println("Linked List is Empty !!");
        else{
            Node i=head;
            while(i!=null){
                System.out.print(i.data + " -> ");
                i=i.next;
            }
            System.out.println("null");
        }
    }



    public static void main(String[] args) {
        LLimplementation ll=new LLimplementation();
//        ll.removeFromFirst();
//        System.out.println("Size = " + ll.size);
//        ll.removeFromLast();
//        System.out.println("Size = " + ll.size);
        ll.insertAtLast(2);
        ll.insertAtLast(3);
//        ll.display();
//        System.out.println("Size = " + ll.size);
        ll.insertAtFirst(1);
//        ll.display();
//        System.out.println("Size = " + ll.size);
        ll.insertAtLast(5);
        ll.insertAtLast(6);
        ll.insertAtLast(7);
        ll.display();
//        System.out.println("Size = " + ll.size);
//        ll.removeFromLast();
////        ll.display();
////        System.out.println("Size = " + ll.size);
//        ll.removeFromFirst();
//        ll.display();
//        System.out.println("Size = " + ll.size);
        ll.insertAtGivenIndex(4,3);
        ll.display();
//        System.out.println("Size = " + ll.size);
        ll.removeFromGivenIndex(0);
        ll.display();
//        System.out.println("Size = " + ll.size);
        ll.removeFromGivenIndex(3);
        ll.display();
//        System.out.println("Size = " + ll.size);

        ll.removeFromGivenIndex(5);
        ll.display();
    }

}
