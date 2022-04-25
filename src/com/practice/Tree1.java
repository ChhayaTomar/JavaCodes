package com.practice;

public class Tree1 {
    private Node1 root;

    public void insert(int x){
        if(root==null){
            root=new Node1(x);
        }else{
            root.insert(x);
        }
    }
    public void displayInorderTraversal(){
        if(root!=null){
            root.inorderTraversal();
        }
    }
    public void displayPreorderTraversal(){
        if(root!=null){
            root.preorderTraversal();
        }
    }
    public void displayPostorderTraversal(){
        if(root!=null){
            root.postorderTraversal();
        }
    }
}
