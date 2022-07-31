package com.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Subhrajit Sadhukhan
 */
class PrefixSumUtilTest {
    @Test
    public void testGetSum() {
        int[] arr = new int[]{2, 8, 3, 9, 6, 5, 4};
        int result = PrefixSumUtil.getSum(arr, 2, 4);
        Assertions.assertEquals(18, result);
    }

    @Test
    public void testCheckIfEquilibriumPointExists_Naive() {
        int[] arr1 = new int[]{3, 4, 8, -9, 20, 6};
        boolean result1 = PrefixSumUtil.checkIfEquilibriumPointExists_Naive(arr1);
        Assertions.assertTrue(result1);
        int[] arr2 = new int[]{4, 2, -2};
        boolean result2 = PrefixSumUtil.checkIfEquilibriumPointExists_Naive(arr2);
        Assertions.assertTrue(result2);
        int[] arr3 = new int[]{4, 2, 2};
        boolean result3 = PrefixSumUtil.checkIfEquilibriumPointExists_Naive(arr3);
        Assertions.assertFalse(result3);
    }

    @Test
    public void testCheckIfEquilibriumPointExists() {
        int[] arr1 = new int[]{3, 4, 8, -9, 20, 6};
        boolean result1 = PrefixSumUtil.checkIfEquilibriumPointExists(arr1);
        Assertions.assertTrue(result1);
        int[] arr2 = new int[]{4, 2, -2};
        boolean result2 = PrefixSumUtil.checkIfEquilibriumPointExists(arr2);
        Assertions.assertTrue(result2);
        int[] arr3 = new int[]{4, 2, 2};
        boolean result3 = PrefixSumUtil.checkIfEquilibriumPointExists(arr3);
        Assertions.assertFalse(result3);
    }


    @Test
    public void testMaxOccurringElement() {
        int[] low = new int[]{1, 2, 3};
        int[] high = new int[]{3, 5, 7};
        int result = PrefixSumUtil.maxOccurringElement(low, high);
        Assertions.assertEquals(3, result);
    }
}