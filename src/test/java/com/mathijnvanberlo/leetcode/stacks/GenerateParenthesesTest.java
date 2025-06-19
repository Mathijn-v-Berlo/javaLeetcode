package com.mathijnvanberlo.leetcode.stacks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @Test
    void generateParenthesesTest() {
        GenerateParentheses generateParentheses = new GenerateParentheses();

        String[] expectedOutput = {"((()))", "(()())", "(())()", "()(())", "()()()"};
        runGenerateParenthesesTest(3, expectedOutput);

        expectedOutput = new String[]{"()"};
        runGenerateParenthesesTest(1, expectedOutput);
    }

    void runGenerateParenthesesTest(int pairOfIntegers, String[] expectedOutput) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> output = generateParentheses.generateParenthesis(pairOfIntegers);

        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], output.get(i));
        }
    }
}