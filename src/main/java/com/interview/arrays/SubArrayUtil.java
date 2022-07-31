package com.interview.arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class SubArrayUtil {
    public static int getMaximumSubArraySumNaive(int[] arr) {
        int n = arr.length;
        int result = arr[0];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                result = Math.max(result, sum);
            }
        }
        return result;
    }


    public static int getMaximumSubArraySum(int[] arr) {
        int n = arr.length;
        int maxSum = arr[0];
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            maxSum = Math.max(maxSum + arr[i], arr[i]);
            result = Math.max(result, maxSum);
        }
        return result;
    }

    public static int getLengthOfLongestAlternatingEvenOddSubArrayNaive(int[] arr) {
        int n = arr.length;
        int result = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 == 1)
                        || (arr[j] % 2 == 1 && arr[j - 1] % 2 == 0)) {
                    count++;
                } else {
                    break;
                }
            }
            result = Math.max(result, count);
        }
        return result;
    }


    public static int getLengthOfLongestAlternatingEvenOddSubArrayEfficient(int[] arr) {
        int n = arr.length;
        int result = 1;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 == 1) || (arr[i] % 2 == 1 && arr[i - 1] % 2 == 0)) {
                count++;
                result = Math.max(count, result);
            } else {
                count = 1;
            }
        }
        return result;
    }


    public static int getMaxCircularSubArraySum_Naive(int[] arr) {
        int n = arr.length;
        int result = arr[0];
        for (int i = 0; i < n; i++) {
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;
                curr_sum += arr[index];
                curr_max = Math.max(curr_max, curr_sum);
            }
            result = Math.max(result, curr_max);
        }
        return result;
    }

    public static int getMaxCircularSubArraySum_Efficient(int[] arr) {
        int result = 0;
        int n = arr.length;
        int maxSumOfRegularSubArray = getMaximumSubArraySum(arr);
        if (maxSumOfRegularSubArray < 0) {
            return maxSumOfRegularSubArray;
        }
        int sumOfArray = 0;
        for (int i = 0; i < n; i++) {
            sumOfArray += arr[i];
            arr[i] = arr[i] * -1;
        }
        int minSumOfArray = getMaximumSubArraySum(arr);
        int maxSumOfCircularSubArray = sumOfArray + minSumOfArray;
        return Math.max(maxSumOfRegularSubArray, maxSumOfCircularSubArray);
    }

    public static int getMajorityElementNaive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return i;
            }
        }
        return -1;
    }

    public static int getMajorityElementEfficient(int[] arr) {
        int n = arr.length;
        int candidateIndex = 0;
        int votes = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[candidateIndex]) {
                votes++;
            } else {
                votes--;
            }
            if (votes == 0) {
                candidateIndex = i;
                votes = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[candidateIndex]) {
                count++;
            }
        }
        if (count > n / 2) {
            return candidateIndex;
        } else {
            return -1;
        }

    }


    public static void printMinimumGroupFlips(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) {
                    System.out.print("Flip from index " + i + " ");
                } else {
                    System.out.println("to index " + (i - 1));
                }
            }
        }
        if (arr[n - 1] != arr[0]) {
            System.out.println(" to index " + (n - 1));
        }
    }

}