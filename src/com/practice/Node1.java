package com.practice;

public class Node1 {
    private int data;
    private Node1 leftChild;
    private Node1 rightChild;

    Node1(int data)
    {
        this.data=data;
    }

    public void insert(int x){
        if(x==data) return;
        if(x<data){
            if(leftChild==null){
                leftChild=new Node1(x);
            }else{
                leftChild.insert(x);
            }
        }else if(x>data){
            if(rightChild==null){
                rightChild=new Node1(x);
            }else{
                rightChild.insert(x);
            }
        }
    }

    public void inorderTraversal(){
        if(leftChild!=null){
            leftChild.inorderTraversal();
        }
        System.out.print(data+ " ");
        if(rightChild!=null){
            rightChild.inorderTraversal();
        }
    }
    public void preorderTraversal(){
        System.out.print(data + " ");
        if(leftChild!=null){
            leftChild.preorderTraversal();
        }
        if(rightChild!=null){
            rightChild.preorderTraversal();
        }
    }

    public  void postorderTraversal(){
        if(leftChild!=null){
            leftChild.postorderTraversal();
        }
        if(rightChild!=null){
            rightChild.postorderTraversal();
        }
        System.out.print(data+ " ");
    }
}
