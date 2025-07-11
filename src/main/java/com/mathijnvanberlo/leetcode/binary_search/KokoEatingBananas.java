package com.mathijnvanberlo.leetcode.binary_search;

import java.util.Arrays;

public class KokoEatingBananas {
//    Koko loves to eat bananas. There are n piles of bananas,
//    the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
//    Koko can decide her bananas-per-hour eating speed of k.
//    Each hour, she chooses some pile of bananas and eats k bananas from that pile.
//    If the pile has less than k bananas,
//    she eats all of them instead and will not eat any more bananas during this hour.
//    Koko likes to eat slowly but still wants to finish eating
//    all the bananas before the guards return.
//    Return the minimum integer k such that she can eat all the bananas within h hours.
    public int minEatingSpeed(int[] piles, int h) {
        int minK = 1;
        int maxK = getMax(piles);
        int minSpeed = minK;

        while (minK <= maxK) {
            int bananasPerHour = middle(minK, maxK);
            long timeToEat = getTimeToEat(piles, bananasPerHour);

            if (timeToEat <= h) { // Finished the bananas
                minSpeed = bananasPerHour;
                maxK = bananasPerHour - 1;
            } else { // Doesn't finish the bananas
                minK = bananasPerHour + 1;
            }
        }

        return minSpeed;
    }
    private long getTimeToEat(int[] piles, int bananasPerHour) {
        long res = 0;
        for (int pile: piles) res += Math.ceilDiv(pile, bananasPerHour);
        return res;
    }

    private int middle(int minK, int maxK) {
        return minK + (maxK - minK) / 2;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile: piles) max = Math.max(max, pile);
        return max;
    }
}
