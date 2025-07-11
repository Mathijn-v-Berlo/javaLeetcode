package com.mathijnvanberlo.leetcode.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchA2DMatrixTest {
    @Test
    void testSearchA2DMatrix() {
        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();

        int[][] input = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        assertTrue(searchA2DMatrix.searchMatrix(input, target));
        assertTrue(searchA2DMatrix.searchMatrixNoFlattening(input, target));

        target = 13;
        assertFalse(searchA2DMatrix.searchMatrix(input, target));
        assertFalse(searchA2DMatrix.searchMatrixNoFlattening(input, target));

        target = 1;
        assertTrue(searchA2DMatrix.searchMatrix(input, target));
        assertTrue(searchA2DMatrix.searchMatrixNoFlattening(input, target));

        target = 60;
        assertTrue(searchA2DMatrix.searchMatrix(input, target));
        assertTrue(searchA2DMatrix.searchMatrixNoFlattening(input, target));
    }
}