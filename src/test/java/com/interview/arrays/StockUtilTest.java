package com.interview.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Subhrajit Sadhukhan
 */
class StockUtilTest {

    @Test
    void testGetMaxProfitNaive() {
        int[] arr = new int[]{1, 5, 3, 8, 12};
        int result = StockUtil.getMaxProfitNaive(arr, 0, arr.length - 1);
        Assertions.assertThat(result).isEqualTo(13);
    }

    @Test
    void testGetMaxProfit() {
        int[] arr = new int[]{1, 5, 3, 8, 12};
        int result = StockUtil.getMaxProfit(arr);
        Assertions.assertThat(result).isEqualTo(13);
    }

}