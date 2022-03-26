package com.company.dataStructures.queue;

import java.util.ArrayList;
//Custom Queue

public class QueueUsingArrayList {
    private ArrayList<Integer> data;
    private int size;

    public QueueUsingArrayList() {
        this.data = new ArrayList<>();
        this.size = 0;
    }

    //Add Method -add element at front of queue
    public void enqueue(int val) {
        data.add(val);
        this.size++;
    }

    //Remove Method - remove element from front of queue
    public int remove() {
        if (this.size == 0) return -1;
        int ans = data.remove(0);
        this.size--;
        return ans;
    }

    //Peek Method - return the element at the front but doesn't remove the element
    public int peek() {
        if (this.size == 0) return -1;
        int ans = data.get(0);
        return ans;
    }

    //size
    public int size() {
        return this.size;




























    }
}
