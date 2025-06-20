package com.mathijnvanberlo.leetcode.stacks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int length = position.length;
        double[][] cars = new double[length][2];
        for (int i = 0; i < length; i++) {
            int curPosition = position[i];
            cars[i] = new double[] {curPosition, (target - curPosition) *1f / speed[i]};
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        double currentTime = cars[0][1];
        int fleetAmount = 1;
        for (int i = 1; i < length; i++) {
            double nextTime = cars[i][1];
            if (nextTime > currentTime) {
                currentTime = nextTime;
                fleetAmount++;
            }
        }
        return fleetAmount;
    }
}
