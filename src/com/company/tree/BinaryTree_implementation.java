package com.company.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_implementation {
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode root = null;

    //TreeNode root=null;

    public TreeNode insert(TreeNode root, int dataToBeInserted) {
        if (root == null) {
            root = new TreeNode(dataToBeInserted);
            return root;
        }
        if (dataToBeInserted < root.data) {
            root.left = insert(root.left, dataToBeInserted);
        }
        if (dataToBeInserted > root.data) {
            root.right = insert(root.right, dataToBeInserted);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int dataToBeSearched) {
        if (root == null || root.data == dataToBeSearched) return root;
        if (dataToBeSearched < root.data) {
            return search(root.left, dataToBeSearched);
        }
//        if(dataToBeSearched>root.data){
//            return search(root.right,dataToBeSearched);
//        }

        return search(root.right, dataToBeSearched);
    }

    public void preOrderTraversal(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public void postOrderTraversal(TreeNode root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrderTraversal(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();
            if (current == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(current.data + " ");
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
    }

    public void insertIntoTree(int dataToBeInserted) {
        root = insert(root, dataToBeInserted);
    }

    public TreeNode searchInTree(int dataToBeSearched) {
        return search(root, dataToBeSearched);
    }

    public void displayPreOrderTraversal() {
        preOrderTraversal(root);
    }

    public void displayInOrderTraversal() {
        inOrderTraversal(root);
    }

    public void displayPostOrderTraversal() {
        postOrderTraversal(root);
    }

    public void displayLevelOrderTraversal() {
        levelOrderTraversal(root);
    }

    public static void main(String[] args) {
        BinaryTree_implementation bst = new BinaryTree_implementation();

        bst.insertIntoTree(10);
        bst.insertIntoTree(4);
        bst.insertIntoTree(16);
        bst.insertIntoTree(2);
        bst.insertIntoTree(7);
        bst.insertIntoTree(1);
        bst.insertIntoTree(5);
        bst.insertIntoTree(8);
        bst.insertIntoTree(14);
        bst.insertIntoTree(18);
        bst.insertIntoTree(25);
        bst.insertIntoTree(20);

//        if(bst.search(bst.root,30)!=null){
//            System.out.println("Element Found");
//        }else{
//            System.out.println("Element not found");
//        }
//        if(bst.search(bst.root,10)!=null){
//            System.out.println("Element Found");
//        }else{
//            System.out.println("Element not found");
//        }
        System.out.print("Pre Order Traversal :- ");
        bst.preOrderTraversal(bst.root);
        System.out.println();
        System.out.print("In Order Traversal :- ");
        bst.inOrderTraversal(bst.root);
        System.out.println();
        System.out.print("Post Order Traversal :- ");
        bst.postOrderTraversal(bst.root);
        System.out.println();
        System.out.println("Level Order Traversal :- ");
        bst.levelOrderTraversal(bst.root);
        System.out.println("Count of nodes :- " + Count_of_nodes.countOfNodes(bst.root));
        System.out.println("Sum of Nodes :- " + Sum_of_nodes.sum_of_nodes(bst.root));
        System.out.println("Height of the tree :- " + Height_of_tree.heightOfTree(bst.root));
        System.out.println("Diamter of the tree :- " + Diameter_of_tree.diameterOfTheTree(bst.root));

    }
}
