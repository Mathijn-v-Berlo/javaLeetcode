package com.mathijnvanberlo.leetcode.arrays_and_hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] colums = new HashSet[9];
        HashSet<Character>[] subBoxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Character>();
            colums[i] = new HashSet<Character>();
            subBoxes[i] = new HashSet<Character>();
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char charOnBoard = board[row][col];
                if (charOnBoard == '.') continue;

                if (!rows[row].add(charOnBoard) ||
                !colums[col].add(charOnBoard) ||
                !subBoxes[calculateSubBoxIndex(row, col)].add(charOnBoard)) {
                    return false;
                }
            }
        }
        return true;
    }

    private int calculateSubBoxIndex(int row, int column) {
        return (row / 3) * 3 + column / 3;
    }
}
