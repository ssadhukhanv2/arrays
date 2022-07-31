package com.interview.arrays;

import java.util.Arrays;

/**
 * @author Subhrajit Sadhukhan
 */
public class RainWaterUtil {

    public static int getTrappedRainWaterEfficient(int[] arr) {
        var n = arr.length;
        var result = 0;
        var lMax = new int[n];
        var rMax = new int[n];

        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i - 1], arr[i]);
        }
        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], lMax[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            var rainWater = Math.min(lMax[i], rMax[i]) - arr[i];
            result += rainWater;
        }
        return result;
    }

    public static int getTrappedRainWaterNaive(int[] arr) {
        var n = arr.length;
        var result = 0;
        for (var i = 1; i < n - 1; i++) {
            var lMax = arr[i];
            var rMax = arr[i];
            for (var j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            for (var j = i + 1; j < n; j++) {
                rMax = Math.max(rMax, arr[j]);
            }
            var rainWater = Math.min(lMax, rMax) - arr[i];
            result += rainWater;
        }
        return result;
    }


}
