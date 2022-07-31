package com.interview.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class BinaryArrayUtil {
    public static int getMaxConsecutive1s(int[] arr) {
        int n = arr.length;
        int result = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 0;
            }
        }
        return result;
    }

}
