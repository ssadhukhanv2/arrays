package com.interview.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class SlidingWindowUtil {
    public static int getMaxSumOfSubArraysWithKElements_Naive(int[] arr, int k) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }


    public static int getMaxSumOfSubArraysWithKElements(int[] arr, int k) {
        int n = arr.length;
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        int maxSum = currSum;
        for (int i = k; i < n; i++) {
            currSum -= arr[i - k];
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static boolean checkSubArrayWithGivenSum_Naive(int[] arr, int givenSum) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == givenSum) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean checkSubArrayWithGivenSum_Efficient(int[] arr, int givenSum) {
        int n = arr.length;
        int currSum = arr[0];
        int start = 0;
        for (int end = 1; end < n; end++) {
            while (currSum > givenSum && start < end - 1) {
                currSum -= arr[start];
                start++;
            }
            if (end < n) {
                currSum += arr[end];
            }
            if (currSum == givenSum) {
                return true;
            }
        }
        return false;
    }


    public static void printFirstMNbonacciNumber(int n, int m) {
        int[] arr = new int[m];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = 0;
        }
        arr[n] = 1;
        arr[n - 1] = 1;
        for (int i = n + 1; i < m; i++) {
            arr[i] = 2 * arr[i - 1] - arr[i - n - 1];
        }
        for (int i = 0; i < m; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
