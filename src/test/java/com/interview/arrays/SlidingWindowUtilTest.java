package com.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Subhrajit Sadhukhan
 */
class SlidingWindowUtilTest {

    @Test
    public void testGetMaxSumOfSubArraysWithKElements_Naive() {
        int[] arr = new int[]{1, 8, 30, -5, 20, 7};
        int result = SlidingWindowUtil.getMaxSumOfSubArraysWithKElements_Naive(arr, 3);
        Assertions.assertEquals(45, result);
    }

    @Test
    public void testGetMaxSumOfSubArraysWithKElements() {
        int[] arr = new int[]{1, 8, 30, -5, 20, 7};
        int result = SlidingWindowUtil.getMaxSumOfSubArraysWithKElements(arr, 3);
        Assertions.assertEquals(45, result);
    }

    @Test
    public void testCheckSubArrayWithGivenSum_Naive() {
        int[] arr = new int[]{1, 4, 20, 3, 10, 5};
        boolean result = SlidingWindowUtil.checkSubArrayWithGivenSum_Naive(arr, 18);
        Assertions.assertTrue(result);
    }

    @Test
    public void testCheckSubArrayWithGivenSum_Efficient() {
        int[] arr = new int[]{1, 4, 20, 3, 10, 5};
        boolean result = SlidingWindowUtil.checkSubArrayWithGivenSum_Efficient(arr, 18);
        Assertions.assertTrue(result);
    }

    @Test
    public void testFirstMNbonacciNumber() {
        int n = 3, m = 8;
        SlidingWindowUtil.printFirstMNbonacciNumber(3, 8);
    }
}