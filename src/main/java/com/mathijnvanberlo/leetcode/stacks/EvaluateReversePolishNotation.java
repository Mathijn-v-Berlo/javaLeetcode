package com.mathijnvanberlo.leetcode.stacks;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> numStack.push(numStack.pop() + numStack.pop());
                case "-" ->  {
                    int last = numStack.pop();
                    numStack.push(numStack.pop() - last);
                }
                case "*" -> numStack.push(numStack.pop() * numStack.pop());
                case "/" -> {
                    int last = numStack.pop();
                    numStack.push(numStack.pop() / last);
                }
                default -> numStack.push(Integer.parseInt(token));
            }
        }
        return numStack.pop();
    }
}
