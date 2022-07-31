package com.interview.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class StockUtil {
    public static int getMaxProfit(int[] price) {
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i - 1]) {
                profit += (price[i] - price[i - 1]);
            }
        }
        return profit;
    }

    public static int getMaxProfitNaive(int[] price, int start, int end) {
        if (start >= end) {
            return 0;
        }
        var profit = 0;
        for (var i = start; i < end; i++) {
            for (var j = i + 1; j <= end; j++) {
                if (price[j] > price[i]) {
                    var currProfit = price[j] - price[i]
                            + getMaxProfitNaive(price, start, i - 1)
                            + getMaxProfitNaive(price, j + 1, end);
                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;
    }
}
