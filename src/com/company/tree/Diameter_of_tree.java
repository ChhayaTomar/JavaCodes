package com.company.tree;

public class Diameter_of_tree {
    //number of nodes in the longest path between any 2 nodes

    //Approach 1 :- O(N^2)
    public static int heightOfTree(BinaryTree_implementation.TreeNode root){
        if(root==null) return 0;
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        return (Math.max(leftHeight,rightHeight)+1);
    }

    public static int diameterOfTheTree(BinaryTree_implementation.TreeNode root){
        if(root==null) return 0;
        int diam1=diameterOfTheTree(root.left);
        int diam2=diameterOfTheTree(root.right);
        int diam3=heightOfTree(root.left) + heightOfTree(root.right)+1;

        return Math.max(diam3, Math.max(diam1,diam2));
    }

    //Approach 2 :- O(N)
}
