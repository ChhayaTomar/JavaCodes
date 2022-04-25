package com.practice;

import com.company.tree.Tree;

public class Driver {
    public static void main(String[] args) {
        Tree1 intTree = new Tree1();
        intTree.insert(25);
        intTree.insert(22);
        intTree.insert(29);
        intTree.insert(21);
        intTree.insert(37);
        intTree.insert(28);
        intTree.insert(31);

        intTree.displayInorderTraversal();
        System.out.println();
        intTree.displayPreorderTraversal();
        System.out.println();
        intTree.displayPostorderTraversal();
    }
}
