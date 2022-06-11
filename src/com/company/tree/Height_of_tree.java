package com.company.tree;

public class Height_of_tree {
    public static int heightOfTree(BinaryTree_implementation.TreeNode root){
        if(root==null) return 0;
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        return (Math.max(leftHeight,rightHeight)+1);
    }
}
