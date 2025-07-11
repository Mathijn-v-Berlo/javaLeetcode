package com.mathijnvanberlo.leetcode.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KokoEatingBananasTest {
    @Test
    void minEatingSpeedTest() {
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();

        int[]piles = {3, 6, 7, 11};
        int h = 8;
        int output = 4;
        assertEquals(output, kokoEatingBananas.minEatingSpeed(piles, h));

        piles = new int[]{30, 11, 23, 4, 20};
        h = 5;
        output = 30;
        assertEquals(output, kokoEatingBananas.minEatingSpeed(piles, h));

        piles = new int[]{30, 11, 23, 4, 20};
        h = 6;
        output = 23;
        assertEquals(output, kokoEatingBananas.minEatingSpeed(piles, h));

        piles = new int[]{1, 4, 3, 2};
        h = 9;
        output = 2;
        assertEquals(output, kokoEatingBananas.minEatingSpeed(piles, h));

        piles = new int[]{805306368, 805306368, 805306368};
        h = 1000000000;
        output = 3;
        assertEquals(output, kokoEatingBananas.minEatingSpeed(piles, h));
    }
}
