package com.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Subhrajit Sadhukhan
 */
public class ArrayUtilTest {

    int[] arrSorted;
    int[] arrUnSorted;

    @BeforeEach
    void setUp() {
        arrSorted = new int[]{1, 3, 4, 5, 7, 8};
        arrUnSorted = new int[]{3, 8, 4, 5, 7, 1};

    }

    @Test
    void testGetIndexOfHighestElement() {
        int resultSorted = ArrayUtil.getIndexOfHighestElement(arrSorted);
        Assertions.assertEquals(5, resultSorted);

        int resultUnSorted = ArrayUtil.getIndexOfHighestElement(arrUnSorted);
        Assertions.assertEquals(1, resultUnSorted);

    }

    @Test
    void testGetIndexOfSecondHighestElement() {
        int resultSorted = ArrayUtil.getIndexOfSecondHighestElement(arrSorted);
        Assertions.assertEquals(4, resultSorted);

        int resultUnSorted = ArrayUtil.getIndexOfSecondHighestElement(arrUnSorted);
        Assertions.assertEquals(4, resultUnSorted);

    }

    @Test
    void testIsArraySorted() {
        var resultSorted = ArrayUtil.isArraySorted(arrSorted);
        Assertions.assertTrue(resultSorted);

        var resultUnSorted = ArrayUtil.isArraySorted(arrUnSorted);
        Assertions.assertFalse(resultUnSorted);

    }


    @Test
    void testReverse() {
        ArrayUtil.reverse(arrSorted);
        org.assertj.core.api.Assertions.assertThat(arrSorted)
                .containsExactly(8, 7, 5, 4, 3, 1);

        ArrayUtil.reverse(arrUnSorted);
        org.assertj.core.api.Assertions.assertThat(arrUnSorted)
                .containsExactly(1, 7, 5, 4, 8, 3);
    }


    @Test
    void removeDuplicatesFromSortedArray() {
        var arr = new int[]{1, 1, 1, 1, 3, 3, 4, 4, 4, 4, 4, 5, 7, 7, 7, 8};
        int result = ArrayUtil.removeDuplicatesFromSortedArray(arr);
        Assertions.assertEquals(6, result);
        org.assertj.core.api.Assertions.assertThat(arr)
                .containsExactly(1, 3, 4, 5, 7, 8, 4, 4, 4, 4, 4, 5, 7, 7, 7, 8);
    }


    @Test
    void testMoveZerosToTheEndNaive() {
        var arr = new int[]{10, 5, 0, 0, 8, 0, 9, 0};
        ArrayUtil.moveZerosToTheEndNaive(arr);
        org.assertj.core.api.Assertions.assertThat(arr)
                .containsExactly(10, 5, 8, 9, 0, 0, 0, 0);
    }

    @Test
    void testMoveZerosToTheEnd() {
        var arr = new int[]{10, 5, 0, 0, 8, 0, 9, 0};
        ArrayUtil.moveZerosToTheEnd(arr);
        org.assertj.core.api.Assertions.assertThat(arr)
                .containsExactly(10, 5, 8, 9, 0, 0, 0, 0);
    }


    @Test
    void testLeftRotateByOne() {
        var arr = new int[]{1, 3, 4, 5, 7, 8};
        ArrayUtil.leftRotateByOne(arr);
        org.assertj.core.api.Assertions.assertThat(arr)
                .containsExactly(3, 4, 5, 7, 8, 1);
    }

    @Test
    void testLeftRotateByDElements() {
        var arr = new int[]{1, 3, 4, 5, 7, 8};
        ArrayUtil.leftRotateByDElements(arr, 2);
        org.assertj.core.api.Assertions.assertThat(arr)
                .containsExactly(4, 5, 7, 8, 1, 3);
    }

    @Test
    void testLeftRotateByDElementsUsingReversalMethod() {
        var arr = new int[]{1, 3, 4, 5, 7, 8};
        ArrayUtil.leftRotateByDElementsUsingReversalMethod(arr, 2);
        org.assertj.core.api.Assertions.assertThat(arr)
                .containsExactly(4, 5, 7, 8, 1, 3);
    }


    @Test
    void testPrintLeadersInAnArray() {
        var arr = new int[]{7, 10, 4, 10, 6, 5, 2};
        List<Integer> leaderList = ArrayUtil.printLeadersInAnArray(arr);
        org.assertj.core.api.Assertions.assertThat(leaderList)
                .containsExactly(10, 6, 5, 2);
    }


    @Test
    void testGetMaxDifference() {
        var arr = new int[]{2, 3, 10, 6, 4, 1};
        var result = ArrayUtil.getMaxDifference(arr);
        Assertions.assertEquals(8, result);
    }

    @Test
    void testGetIndexOfMajorityElement() {
        var arr1 = new int[]{8, 7, 6, 8, 8, 8, 8, 8, 8};
        var result1 = ArrayUtil.getIndexOfMajorityElement(arr1);
        Assertions.assertEquals(0, result1);

        var arr2 = new int[]{8, 7, 6, 5, 5, 2, 8, 8, 8, 8};
        var result2 = ArrayUtil.getIndexOfMajorityElement(arr2);
        Assertions.assertEquals(-1, result2);
    }


}