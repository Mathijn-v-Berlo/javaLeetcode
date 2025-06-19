package com.mathijnvanberlo.leetcode.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void evaluateReversePolishNotationTest() {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();

        String[] testTokens = {"2", "1", "+", "3", "*"};
        assertEquals(9, evaluateReversePolishNotation.evalRPN(testTokens));

        testTokens = new String[]{"2", "1", "-", "3", "*"};
        assertEquals(3, evaluateReversePolishNotation.evalRPN(testTokens));

        testTokens = new String[]{"4", "13", "5", "/", "+"};
        assertEquals(6, evaluateReversePolishNotation.evalRPN(testTokens));

        testTokens = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(22, evaluateReversePolishNotation.evalRPN(testTokens));
    }
}