package com.mathijnvanberlo.leetcode.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFleetTest {
    @Test
    void testCarFleet() {
        CarFleet carFleet = new CarFleet();
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        int fleetAmount = carFleet.carFleet(target, position, speed);
        assertEquals(3, fleetAmount);

        target = 10;
        position = new int[]{3};
        speed = new int[]{3};
        fleetAmount = carFleet.carFleet(target, position, speed);
        assertEquals(1, fleetAmount);

        target = 100;
        position = new int[]{0, 2, 4};
        speed = new int[]{4, 2, 1};
        fleetAmount = carFleet.carFleet(target, position, speed);
        assertEquals(1, fleetAmount);

        target = 10;
        position = new int[]{6, 8};
        speed = new int[]{3, 2};
        fleetAmount = carFleet.carFleet(target, position, speed);
        assertEquals(2, fleetAmount);

        target = 10;
        position = new int[]{0, 4, 2};
        speed = new int[]{2, 1, 3};
        fleetAmount = carFleet.carFleet(target, position, speed);
        assertEquals(1, fleetAmount);
    }
}