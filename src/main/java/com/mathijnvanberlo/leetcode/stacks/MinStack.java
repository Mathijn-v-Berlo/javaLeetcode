package com.mathijnvanberlo.leetcode.stacks;

import java.util.ArrayList;
import java.util.SortedSet;

public class MinStack {
    ArrayList<Node> innerList;

    public MinStack() {
        this.innerList = new ArrayList<Node>();
    }

    public void push(int val) {
        int min;
        if (this.innerList.isEmpty()) min = val;
        else min = Math.min(val, topNode().min);

        this.innerList.add(new Node(min, val));
    }

    public void pop() {
        this.innerList.remove(this.innerList.size() - 1);
    }

    public int top() {
        return topNode().num;
    }

    public int getMin() {
        return topNode().min;
    }

    private Node topNode() {
        return this.innerList.get(this.innerList.size() - 1);
    }


    private class Node {
        int min;
        int num;
        private Node(int min, int num) {
            this.min = min;
            this.num = num;
        }
    }
}
