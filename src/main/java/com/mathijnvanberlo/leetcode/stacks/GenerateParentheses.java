package com.mathijnvanberlo.leetcode.stacks;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private ArrayList<String> result;
    public List<String> generateParenthesis(int n) {
        this.result = new ArrayList<>();
        generate(0, 0, n, new StringBuilder());
        return this.result;
    }

    void generate(int open, int close, int n, StringBuilder parentheses) {
        if (open == close && close == n) {
            this.result.add(parentheses.toString());
        }

        if (open < n) {
            parentheses.append("(");
            generate(open + 1, close, n, parentheses);
            parentheses.deleteCharAt(parentheses.length() - 1);
        }

        if (close < open) {
            parentheses.append(")");
            generate(open, close + 1, n, parentheses);
            parentheses.deleteCharAt(parentheses.length() - 1);
        }
    }
}