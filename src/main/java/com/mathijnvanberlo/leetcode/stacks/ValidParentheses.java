package com.mathijnvanberlo.leetcode.stacks;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
	    Stack<Character> openStack = new Stack<>();
	    char[] chars = s.toCharArray();
        HashMap<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('}', '{');
        parenthesesMap.put(')', '(');
        parenthesesMap.put(']', '[');

        for (char nextParenthesis: chars) {
            if (isOpenParenthesis(nextParenthesis)) openStack.add(nextParenthesis);
            else if (openStack.isEmpty() || parenthesesMap.get(nextParenthesis) != openStack.pop()) {
                return false;
            }
        }
        return openStack.isEmpty();
    }

    private boolean isOpenParenthesis(char parenthesis) {
        return parenthesis == '{' ||
	    parenthesis == '(' ||
	    parenthesis == '[';
    }
}
