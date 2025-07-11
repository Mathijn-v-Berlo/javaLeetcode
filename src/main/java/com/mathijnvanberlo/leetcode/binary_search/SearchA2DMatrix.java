package com.mathijnvanberlo.leetcode.binary_search;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix[0].length;
        int length = rowLength * matrix.length;
        int[] flatMatrix = new int[length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, flatMatrix, i * rowLength, rowLength);
        }

        int bottom = 0;
        int top = length;
        while (top >= bottom && top >= 0 && bottom < length) {
            int middle = (top + bottom) / 2;
            if (flatMatrix[middle] == target) return true;

            if (flatMatrix[middle] > target) top = middle - 1;
            if (flatMatrix[middle] < target) bottom = middle + 1;
        }
        return false;
    }

    public boolean searchMatrixNoFlattening(int[][] matrix, int target) {
        int bottom = 0;
        int rowLength = matrix[0].length;
        int length = matrix.length * rowLength;
        int top = length - 1;

        while (top >= bottom) {
            int middle = bottom + (top - bottom) / 2;
            int found = matrix[middle / rowLength][middle % rowLength];

            if (found == target) return true;

            if (found > target) top = middle - 1;
            if (found < target) bottom = middle + 1;
        }
        return false;
    }
}
