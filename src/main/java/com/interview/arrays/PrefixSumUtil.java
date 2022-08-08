package com.interview.arrays;

import java.util.Collections;

/**
 * @author Subhrajit Sadhukhan
 */
public class PrefixSumUtil {

    public static int getSum(int[] arr, int l, int r) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        if (l == 0) {
            return prefixSum[r];
        } else {
            return prefixSum[r] - prefixSum[l - 1];
        }
    }


    public static boolean checkIfEquilibriumPointExists_Naive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int l_sum = 0, r_sum = 0;
            for (int j = 0; j < i; j++) {
                l_sum += arr[j];
            }
            for (int j = i + 1; j < n; j++) {
                r_sum += arr[j];
            }
            if (l_sum == r_sum) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIfEquilibriumPointExists(int[] arr) {
        int n = arr.length;
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            if (leftSum == arrSum - arr[i]) {
                return true;
            }
            leftSum += arr[i];
            arrSum -= arr[i];
        }
        return false;
    }


    public static int maxOccurringElement(int[] low, int[] high) {
        int[] arr = new int[1000];
        int n = low.length;
        for (int i = 0; i < n; i++) {
            arr[low[i]]++;
            arr[high[i] + 1]--;
        }
        int maxSum = arr[0], result = 0;
        for (int i = 1; i < 1000; i++) {
            arr[i] = arr[i] + arr[i - 1];
            if (maxSum < arr[i]) {
                maxSum = arr[i];
                result = i;
            }
        }
        return result;
    }

}
