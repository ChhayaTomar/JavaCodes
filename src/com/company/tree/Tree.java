package com.company.tree;

public class Tree {
    private Node root;

    public void insert(int value){
        if(root == null)
            root = new Node(value);
        else{
            root.insertVal(value);
        }
    }

    public void displayPreorderTraversal(){
        if(root != null)
            root.preOrderTraversal();
    }

    public void displayInorderTraversal(){
        if(root != null)
            root.inOrderTraversal();
    }
    public void displayPostorderTraversal(){
        if(root != null)
            root.postOrderTraversal();
    }
}
