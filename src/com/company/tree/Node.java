package com.company.tree;

public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int data) {
        this.data = data;
    }

    public void insertVal(int value) {
        // root node exists

        // to handle duplicate value
        if (value == data)
            return;

        if (value < data) {
            // check the left child of this node
            if (leftChild == null) {
                leftChild = new Node(value);
            } else {
                leftChild.insertVal(value);
            }
        } else if (value > data) {
            // check the right child of this node
            if (rightChild == null) {
                rightChild = new Node(value);
            } else {
                rightChild.insertVal(value);
            }
        }

    }

    public void inOrderTraversal() {

        if (leftChild != null)
            leftChild.inOrderTraversal();

        System.out.print(data + " ");

        if (rightChild == null)
            return;
        else {
            rightChild.inOrderTraversal();
        }
    }

    public void preOrderTraversal() {
        System.out.print(data + " ");

        if (leftChild != null)
            leftChild.preOrderTraversal();


        if (rightChild == null)
            return;
        else {
            rightChild.preOrderTraversal();
        }
    }

    public void postOrderTraversal() {

        if (leftChild != null)
            leftChild.postOrderTraversal();


        if (rightChild != null){
            rightChild.postOrderTraversal();
        }
        System.out.print(data + " ");

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
