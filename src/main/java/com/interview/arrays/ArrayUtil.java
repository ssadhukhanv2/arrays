
package com.interview.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Subhrajit Sadhukhan
 */
public class ArrayUtil {
    public static int getIndexOfHighestElement(int[] arr) {
        var n = arr.length;
        int result = n - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[result]) {
                result = i;
            }

        }
        return result;
    }


    public static int getIndexOfSecondHighestElement(int[] arr) {
        var n = arr.length;
        int highest = n - 1;
        int secondHighest = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[highest]) {
                secondHighest = highest;
                highest = i;
            } else if (arr[i] != arr[highest]) {
                if (secondHighest == -1 || arr[i] > arr[secondHighest]) {
                    secondHighest = i;
                }
            }
        }
        return secondHighest;
    }

    public static boolean isArraySorted(int[] arr) {
        var n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }
        return true;
    }

    public static void reverse(int[] arr) {
        var left = 0;
        var right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static int removeDuplicatesFromSortedArray(int[] arr) {
        if (arr.length < 1) {
            return -1;
        }
        var n = arr.length;
        var count = 1;
        for (var i = 1; i < n; i++) {
            if (arr[i] != arr[count - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }


    public static void moveZerosToTheEnd(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, count);
                count++;
            }
        }
    }


    public static void moveZerosToTheEndNaive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0) {
                        swap(arr, i, j);
                        break;
                    }
                }
            }
        }
    }


    public static void leftRotateByOne(int[] arr) {
        var n = arr.length;
        var temp = arr[0];
        for (var i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void leftRotateByDElements(int[] arr, int d) {
        var n = arr.length;
        var temp = new int[d];
        for (var i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (var i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (var i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }

    }

    public static void leftRotateByDElementsUsingReversalMethod(int[] arr, int d) {
        int n = arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }


    public static List<Integer> printLeadersInAnArray(int[] arr) {
        var leaderList = new ArrayList<Integer>();
        int n = arr.length;
        int currLeader = arr[n - 1];
        leaderList.add(currLeader);
        for (int i = n - 2; i > 0; i--) {
            if (arr[i] > currLeader) {
                currLeader = arr[i];
                leaderList.add(currLeader);
            }
        }
        Collections.sort(leaderList, Collections.reverseOrder());
        return leaderList;
    }


    public static int getMaxDifference(int[] arr) {
        var n = arr.length;
        var maxDiff = arr[1] - arr[0];
        var min = arr[0];
        for (int i = 1; i < n; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - min);
            min = Math.min(arr[i], min);
        }
        return maxDiff;
    }

    public static int getIndexOfMajorityElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
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


    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
