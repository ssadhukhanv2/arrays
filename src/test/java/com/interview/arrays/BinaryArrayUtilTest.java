package com.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Subhrajit Sadhukhan
 */
class BinaryArrayUtilTest {
    @Test
    void testGetMaxConsecutive1s() {
        int arr[] = {0, 1, 1, 0, 1, 1, 1, 0};
        int result = BinaryArrayUtil.getMaxConsecutive1s(arr);
        Assertions.assertEquals(3, result);
    }

}