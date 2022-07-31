package com.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Subhrajit Sadhukhan
 */
class RainWaterUtilTest {
    @Test
    void testGetTrappedRainWaterNaive() {
        int[] arr1 = {3, 0, 1, 2, 5};
        int result1 = RainWaterUtil.getTrappedRainWaterNaive(arr1);
        Assertions.assertEquals(3 + 2 + 1, result1);
        int[] arr2 = {5, 0, 6, 2, 3};
        int result2 = RainWaterUtil.getTrappedRainWaterNaive(arr2);
        Assertions.assertEquals(5 + 0 + 1, result2);
    }

    @Test
    void testGetTrappedRainWaterEfficient() {
        int[] arr1 = {3, 0, 1, 2, 5};
        int result1 = RainWaterUtil.getTrappedRainWaterEfficient(arr1);
        Assertions.assertEquals(3 + 2 + 1, result1);
        int[] arr3 = {5, 0, 6, 2, 3};
        int result = RainWaterUtil.getTrappedRainWaterEfficient(arr3);
        Assertions.assertEquals(5 + 0 + 1, result);
    }
}