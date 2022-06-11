package com.company.tree;

public class Sum_of_nodes {
    public static int sum_of_nodes(BinaryTree_implementation.TreeNode root){
        if(root==null) return 0;
        int leftSum=sum_of_nodes(root.left);
        int rightSum=sum_of_nodes(root.right);
        return (leftSum+rightSum+root.data);
    }
}
