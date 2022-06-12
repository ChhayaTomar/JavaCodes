package com.company.tree;

public class Count_of_nodes {
    public static int countOfNodes(BinaryTree_implementation.TreeNode root){
        if(root==null) return 0;
        int leftCount= countOfNodes(root.left);
        int rightCount=countOfNodes(root.right);
        return (leftCount + rightCount + 1);
    }
}
