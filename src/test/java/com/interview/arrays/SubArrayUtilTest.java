package com.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Subhrajit Sadhukhan
 */
class SubArrayUtilTest {

    @Test
    void testGetMaxSumNaive() {
        int[] arr1 = new int[]{1, -2, 3, -1, 2};
        int result1 = SubArrayUtil.getMaximumSubArraySumNaive(arr1);
        Assertions.assertEquals(4, result1);

        int[] arr2 = new int[]{1, 4, -2, 1, -1, 1};
        int result2 = SubArrayUtil.getMaximumSubArraySumNaive(arr2);
        Assertions.assertEquals(5, result2);
    }

    @Test
    void testGetMaximumSubArraySum() {
        int[] arr1 = new int[]{1, -2, 3, -1, 2};
        int result1 = SubArrayUtil.getMaximumSubArraySum(arr1);
        Assertions.assertEquals(4, result1);

        int[] arr2 = new int[]{1, 4, -2, 1, -1, 1};
        int result2 = SubArrayUtil.getMaximumSubArraySum(arr2);
        Assertions.assertEquals(5, result2);

        int[] arr3 = new int[]{-5, 1, -2, 3, -1, 2, -2};
        int result3 = SubArrayUtil.getMaximumSubArraySum(arr3);
        Assertions.assertEquals(4, result3);
    }

    @Test
    void testGetLengthOfLongestAlternatingEvenOddSubArrayEfficient() {
        int[] arr1 = new int[]{5, 10, 20, 6, 3, 8};
        int result1 = SubArrayUtil.getLengthOfLongestAlternatingEvenOddSubArrayEfficient(arr1);
        Assertions.assertEquals(3, result1);

        int[] arr2 = new int[]{10, 12, 14, 7, 8};
        int result2 = SubArrayUtil.getLengthOfLongestAlternatingEvenOddSubArrayEfficient(arr2);
        Assertions.assertEquals(3, result2);

        int[] arr3 = new int[]{7, 10, 13, 14};
        int result3 = SubArrayUtil.getLengthOfLongestAlternatingEvenOddSubArrayEfficient(arr3);
        Assertions.assertEquals(4, result3);

        int[] arr4 = new int[]{10, 12, 8, 4};
        int result4 = SubArrayUtil.getLengthOfLongestAlternatingEvenOddSubArrayEfficient(arr4);
        Assertions.assertEquals(1, result4);
    }

    @Test
    void testGetLengthOfLongestAlternatingEvenOddSubArrayNaive() {
        int[] arr1 = new int[]{5, 10, 20, 6, 3, 8};
        int result1 = SubArrayUtil.getLengthOfLongestAlternatingEvenOddSubArrayNaive(arr1);
        Assertions.assertEquals(3, result1);

        int[] arr2 = new int[]{10, 12, 14, 7, 8};
        int result2 = SubArrayUtil.getLengthOfLongestAlternatingEvenOddSubArrayNaive(arr2);
        Assertions.assertEquals(3, result2);

        int[] arr3 = new int[]{7, 10, 13, 14};
        int result3 = SubArrayUtil.getLengthOfLongestAlternatingEvenOddSubArrayNaive(arr3);
        Assertions.assertEquals(4, result3);

        int[] arr4 = new int[]{10, 12, 8, 4};
        int result4 = SubArrayUtil.getLengthOfLongestAlternatingEvenOddSubArrayNaive(arr4);
        Assertions.assertEquals(1, result4);

    }

    @Test
    void testGetMaxCircularSubArraySum_Naive() {
        int[] arr1 = new int[]{5, -2, 3, 4};
        int result1 = SubArrayUtil.getMaxCircularSubArraySum_Naive(arr1);
        Assertions.assertEquals(12, result1);

        int[] arr2 = new int[]{-3, 4, 6, -2};
        int result2 = SubArrayUtil.getMaxCircularSubArraySum_Naive(arr2);
        Assertions.assertEquals(10, result2);

        int[] arr3 = new int[]{8, -4, 3, -5, 4};
        int result3 = SubArrayUtil.getMaxCircularSubArraySum_Naive(arr3);
        Assertions.assertEquals(12, result3);

        int[] arr4 = new int[]{3, -4, 5, 6, -8, 7};
        int result4 = SubArrayUtil.getMaxCircularSubArraySum_Naive(arr4);
        Assertions.assertEquals(17, result4);

        int[] arr5 = new int[]{-5, -3};
        int result5 = SubArrayUtil.getMaxCircularSubArraySum_Naive(arr5);
        Assertions.assertEquals(-3, result5);
    }

    @Test
    void testGetMaxCircularSubArraySum_Efficient() {
        int[] arr1 = new int[]{5, -2, 3, 4};
        int result1 = SubArrayUtil.getMaxCircularSubArraySum_Efficient(arr1);
        Assertions.assertEquals(12, result1);

        int[] arr2 = new int[]{-3, 4, 6, -2};
        int result2 = SubArrayUtil.getMaxCircularSubArraySum_Efficient(arr2);
        Assertions.assertEquals(10, result2);

        int[] arr3 = new int[]{8, -4, 3, -5, 4};
        int result3 = SubArrayUtil.getMaxCircularSubArraySum_Efficient(arr3);
        Assertions.assertEquals(12, result3);

        int[] arr4 = new int[]{3, -4, 5, 6, -8, 7};
        int result4 = SubArrayUtil.getMaxCircularSubArraySum_Efficient(arr4);
        Assertions.assertEquals(17, result4);

        int[] arr5 = new int[]{-5, -3};
        int result5 = SubArrayUtil.getMaxCircularSubArraySum_Efficient(arr5);
        Assertions.assertEquals(-3, result5);
    }

    @Test
    public void testGetMajorityElement() {
        int[] arr1 = new int[]{8, 3, 4, 8, 8};
        int result1 = SubArrayUtil.getMajorityElementNaive(arr1);
        Assertions.assertEquals(0, result1);
        int[] arr2 = new int[]{3, 7, 4, 7, 7, 5};
        int result2 = SubArrayUtil.getMajorityElementNaive(arr2);
        Assertions.assertEquals(-1, result2);
        int[] arr3 = new int[]{20, 30, 40, 50, 50, 50, 50};
        int result3 = SubArrayUtil.getMajorityElementNaive(arr3);
        Assertions.assertEquals(3, result3);
    }

    @Test
    public void testGetMajorityElementEfficient() {
        int[] arr1 = new int[]{8, 3, 4, 8, 8};
        int result1 = SubArrayUtil.getMajorityElementEfficient(arr1);
        Assertions.assertEquals(3, result1);//0 or 3 or 4
        int[] arr2 = new int[]{3, 7, 4, 7, 7, 5};
        int result2 = SubArrayUtil.getMajorityElementEfficient(arr2);
        Assertions.assertEquals(-1, result2);
        int[] arr3 = new int[]{20, 30, 40, 50, 50, 50, 50};
        int result3 = SubArrayUtil.getMajorityElementEfficient(arr3);
        Assertions.assertEquals(3, result3);//3 or 4 or 5 or 6
    }

    @Test
    public void testPrintMinimumGroupFlips() {
        int arr[] = new int[]{1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1};
        SubArrayUtil.printMinimumGroupFlips(arr);
    }



}