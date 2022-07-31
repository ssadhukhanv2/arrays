# arrays
Implementation of All Major Algorithms Using Java


## **Arrays**

* [What are Arrays?](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)
    * **Arrays** are used to store multiple items in one place and these item are typically of the same datatype.
    * **Difference with Linked List, Self Balancing BST or Hash** Arrays store the items in contigous memory location. With Linked List, Self Balancing BST or Hash items are not stored in contigous memory location.

            int[] arr=new int[]{1,2,3,4,5,6,7,8};
      This creates an array of 8 elements. So the size of the array is 8. The array is indexed from 0 to 7. So arr[0]=1, arr[1]=2, arr[2]=3 and so on

  **Algorithms:**
    * **``Find index of Highest Element in an Array``**
    * **``How will you Reverse an Array``**
    * **``Check if an array is sorted``**
    * **``Find the Index of the Second Highest Element in an Array``**
    * **``How will you remove duplicate elements from  sorted Array``**
    * **``how will you move the zeros to the end of the array``**
    * **``How will you Left Rotate an Array by 1``**
    * **``How will you Left Rotate an Array by n``**
    * **``Find the Leaders in an Array``**
    * **``Find Maximum Difference between the elements in an Array from Left to Right``**
    * **``Find maximum profit from a sequence of stock prices where you are permitted to buy once and sell once``**
    * **``Find maximum profit from a sequence of stock prices where there is no restriction on the number of times you can buy or sell a stock``**
    * **`Given an array of Integers denoting the height of bars, find the maximum Rain Water that may be trapped within those bars(Rain Water Problem)`**
    * **`Given a Binary Array, find the count of maximum consecutive 1s in the array`**
    * **`Given an Integer array of integers, find the maxium sum of all subarrays`**
    * **``Given an array of Integers find the maximum length of subarray that has alternating even odd elements``**
    * **`Given an circular integer array of integers, find the maxium sum of all subarrays within the circular subarray`**
    * **`Given an Integer array, find the majority element in the array`**
    * **`Given a binary array, we need to find the minimum of number of group flips to make all array elements same.  In a group flip, we can flip any set of consecutive 1s or 0s.`**
    * **`[SLIDING WINDOW] Given an array of integers and number k, find the maximum sum of k consecutive elements`**
    * **`[SLIDING WINDOW] Given an array of non-negative integers and a sum, check if a subarray exists with the given sum`**
    * **`[SLIDING WINDOW] Print first M Nbonacci numbers`**
    * **`[PREFIX SUM] Given an array of Integers, and multiple pairs of indexes, how to peform the queries in θ(1) time.`**
    * **`[PREFIX SUM] Given an array of Integers, find if it has an equilibrium point.`**
    * **`[PREFIX SUM 2] Given n ranges find the maximum appearing elements in those ranges.`**
    * Check if an array can be divided into three parts with equal sum.
    * [PREFIX SUM & HASHING] Check if there is a subarray with 0 sum.
    * [PREFIX SUM & HASHING] Find Longest Subarray with equal number of 0s and 1s.
    * Find frequencies in a sorted array
    * SOLVE ALL PREFIX SUM QUESTIONS IN GFG



* [Find the Index of Second Highest Element in an Array using θ(n) complexity](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)
    * **Second Highest Element in an Array:** If you consider your array as a stream of data and if you traverse this stream from left to right then you can keep track of the highest and second highest element till this point.

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

          int[] arrUnSorted=new int[]{3, 8, 4, 5, 7, 1};
          int resultSorted = getIndexOfSecondHighestElement(arrUnSorted);
          Assertions.assertEquals(4, arrUnSorted);



* [Check if an array is sorted](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)

        public static boolean isArraySorted(int[] arr) {
            var n = arr.length;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i])
                    return false;
            }
            return true;
        }


* [How will you Reverse an Array](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)

        public static void reverse(int[] arr) {
            var left = 0;
            var right = arr.length - 1;
            while (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        
        int[] arrUnSorted=new int[]{3, 8, 4, 5, 7, 1};
        ArrayUtil.reverse(arrUnSorted);
        Assertions.assertThat(arrUnSorted)
                .containsExactly(1, 7, 5, 4, 8, 3);

* [How will you remove duplicate elements from  sorted Array using θ(n) complexity and θ(1) auxilary space](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2) We initialize the count as 1, incase the array is not empty. This indicates that there will be atleast one distinct element if the array is not empty. We then start at 1 and compare every element with the last element that we included in our result. If the elements are not same, we copy the element to the corresponding position of i & increment the count. The final count is the number of distict element in the array and the indexes 0 to count-1 having the distinct elements.
* INPUT: &nbsp;&nbsp;&nbsp;&nbsp;{1, 1, 1, 1, 3, 3, 4, 4, 4, 4, 4, 5, 7, 7, 7, 8}
* OUTPUT: &nbsp;{1, 3, 4, 5, 7, 8, 4, 4, 4, 4, 4, 5, 7, 7, 7, 8}, Elements: 6


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



* [In an array having zero and non zero element, how will you move the zeros to the end of the array, while preserving existing order of nonzero elements](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)
    * INPUT: &nbsp;&nbsp;&nbsp;&nbsp;{10, 5, 0, 0, 8, 0, 9, 0}
    * OUTPUT: &nbsp;{10, 5, 8, 9, 0, 0, 0, 0}

    * **``Efficient Solution:``**: Traverse the elements of the array and keep count of non-zero elements traversed till now. This count is always equal to the first index of zero.  So if non zero element is encountered, simply swap it with the element at count. Time Complexity: **``θ(n)``**

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
    * **``Naive Solution:``** Traverse the elements from left side and iif you find a zero element, swap it with the first non zero element to it's right. Time Complexity: **``θ(n^2)``**

          public static void moveZerosToTheEnd(int[] arr) {
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


* [How will you Left Rotate an Array by 1 place](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2) Left rotation by means rotating the array in counter clock wise direction. This may be achieved by using a temp variable to store the value at the n-1 th position. The we can shift each element in the array to it's left. Then replace the value of n-1 th position with the value in the temp variable. Complexity **``θ(n)``**
    * INPUT: &nbsp;&nbsp;&nbsp;&nbsp;{1, 3, 4, 5, 7, 8}
    * OUTPUT: &nbsp;{3, 4, 5, 7, 8, 1}


            var n = arr.length;
            var temp = arr[0];
            for (var i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = temp;


* [How will you Left Rotate an Array by D places](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2) Left rotation by means rotating the array in counter clock wise direction. ``arr={1, 3, 4, 5, 7, 8}, d=2``
    * **Using Auxilary Space θ(d)** Copy the first D elements into a temporary array. This is similar to rotating by one place, where we copy the last element into a temporary variable ``arr={1, 3, 4, 5, 7, 8}, d=2, temp = {1, 3}``
    * Shift each element D places to the left. This is similar to rotating by one place, where we shift the element one position to it's left ``arr={4, 5, 7, 8, 7, 8}, d=2, temp={1, 3}``
    * Now copy the elements from the temporary array to the remaining position in the actual array.``arr={4, 5, 7, 8, 1, 3}, d=2``

        * INPUT: &nbsp;&nbsp;&nbsp;&nbsp;{1, 3, 4, 5, 7, 8}, d=2
        * OUTPUT: &nbsp;{4, 5, 7, 8, 1, 3}
    * Complexity: **``θ(n)``** & Auxilary Space: **``θ(d)``**

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

    * **Without using Auxilary Space, REVERSAL ALGORITHM:** We can also left rotate an array by D using the reversal algorithm. This may be done using the following steps ``{1, 3, 4, 5, 7, 8}, d=2``
        * Reverse the elements from 0 to d-1, ``{3, 1, 4, 5, 7, 8}, d=2``
        * Reverse the elements from d to n-1, ``{3, 1, 8, 7, 5, 4}, d=2``
        * Reverse the full array 0 to n-1, ``{4, 5, 7, 8, 1, 3}, d=2``
            * INPUT: &nbsp;&nbsp;&nbsp;&nbsp;{1, 3, 4, 5, 7, 8}, d=2
            * OUTPUT: &nbsp;{4, 5, 7, 8, 1, 3}
        * Complexity: **``θ(n)``** No Auxilary Space is required

                public static void leftRotateByDElementsUsingReversalMethod(int[] arr, int d) {
                    int n = arr.length;
                    reverse(arr, 0, d - 1);
                    reverse(arr, d, n - 1);
                    reverse(arr, 0, n - 1);
                }

* [Find Leaders in an Array](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2) Leaders are elements that are greater than all elements on it's right.
    * We know the last element on the right is always leader. So assume the current leader is the rightmost element in the array.
    * We traverse from right to left n-2 to 0.
    * If we can find an element which is greater than the current leader we add the element to an ArrayList.
    * To Preserve the insertion order reverse the ArrayList and return it.
    * Time Complexity **``θ(n)``** Space Complexity **``θ(d)``** where d is the number of leaders in the array.
        * INPUT: &nbsp;&nbsp;&nbsp;&nbsp;{7, 10, 4, 10, 6, 5, 2}
        * OUTPUT: &nbsp;{10, 6, 5, 2}

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


* [Find Maximum Difference between the elements in an Array from Left to Right](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2) This means find maximum value of arr[j]-arr[i], such that j > i
    * We consider the minElement as the first element.
    * We consider the maxDifference as the difference of first two elements in the array.
    * We the iterate every element in the array. At each level we check:
        * Is the difference of currentElement & minElement is greater than the maxDifference, if so update the difference with the current difference.
        * Is the current element is less than the minElement, if so update the minElement with the current element.
    * This way we get the maximum difference.
    * *This algo may also be used to **find the maximum profit** that may be made given a stock data array , where we are **allowed to buy and sell only once.***

        * INPUT: &nbsp;&nbsp;&nbsp;&nbsp;{2, 3, 10, 6, 4, 1}
        * OUTPUT: &nbsp; 10-2= 8

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


* [Find **maximum profit** from a sequence of stock prices where there is **no restriction on the number of times you can buy or sell a stock**](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2) We can only make profits if the buy price is less than selling price.

    * **IP ``{1, 5, 3, 8, 12}`` OP : ``13``**<br/>
      *Explaination: Buy at 1 sell at 5, Buy at 3 sell at 12. So max profit 5-1+12-3=4+9=13*
    * **IP ``{30,20,10}`` OP : ``0``**<br/>
      *Explaination: Since the elements are in non-increasing order we will not be able to make any profits.*
    * **IP ``{10,20,30}`` OP : ``20``**<br/>
      *Explaination: Since the elements are in increasing order we can simply buy on the first day and sell on the last day to maximize profit. 30-10=20*
    * **IP ``{1,5,3,1,2}`` OP : ``5``**<br/>
      *Explaination: 5-1+2-1=4+1=5*

  ### **Naive Approach || `Time Complexity θ(n^2)`**
    * We write a recursive function where we pass the price array, the start & end.
    * If we have a single element in the array, which is when start>=end we return 0 as profit can't be made with a single day price.
    * For scenarios where there is more than one price in the range, i.e. start<=end we consider every such pair i & j, where i < j and price[j] is greater than price[i]. Only these type of combination will allow us to make profit.
        * Once you get such a pair you add this to the current_profit, then we use the same function  recursively for left of i & right of j to find out max profit within those ranges and add them to curr_profit
        * Now we check if curr_profit is greater than profit, if yes then we put curr_profit as profit.

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

  ### **Efficient Solution || `Time Complexity θ(n)`**
    * The idea of this solution is based on the fact that you know the prices of the stock in advance.
    * **BUY:** When the prices are going down you allow them to go down and only buy the stock when the price has reached absolute bottom, i.e from next element prices starts increasing.
    * **SELL:** So when the prices are going up, allow them to go up and sell at the peak, i.e from next element prices starts decreasing.
    * Follow the above two steps till end of stock price is reached.
    * So we traverse the array from 1 to n, and keep adding the profits made at each individual level, this essentially give us the total profit.

          public static int getMaxProfit(int[] price) {
              int profit = 0;
              for (int i = 1; i < price.length; i++) {
                  if (price[i] > price[i - 1]) {
                      profit += (price[i] - price[i - 1]);
                  }
              }
              return profit;
          }


* [Rain Water Trapping Problem, Give an array of heighs of bars, find the maximum rain water that may be trapped within the bars](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)

  ### **Naive Approach || `Complexity θ(n^2)`**
    * The left and the right most bars can't hold water. So we traverse each bar from 0 to n-2, at each bar we find out:
    * Maximum size of bar to the left of current element.
    * Maximum size of bar to the right of current element.
    * Take the minimum of of the above two values and substract the height of current bar from it. This value is equal to the amount of water the current bar can hold.
    * We can add the rainwater trapped at each current bar & get the total trapped rainwater.
    * **IP ``{3, 0, 1, 2, 5}`` OP : ``6``**<br/>
    * *Explaination: Since the bars at left & right don't store any water, we only consider the elements 0, 1, 2 to be storing water.  For 0 lMax=3 rMax=5, So max Water it can hold is 3-0=3. For 1 lMax=3 rMax=5, So max Water it can hold is 3-1=2. For 2 lMax=3 rMax=5, So max Water it can hold is 3-2=1. So total water trapped is 3-0+3-1+3-2=3+2+1=6*

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

  ### **Efficient Approach || `Complexity θ(n)`|| `Space Complexity θ(n)`**
    * Precompute the lMax & rMax for each element in 2 arrays. Then for each element find the amount of rain water it can hold, sum them up and return the result.
    * Initial Array: arr[]= {5, 0, 6, 2, 3}
    * Left Max Array = {5, 5, 6, 6, 3}
        * We take an empty array of the same size as input, populate the left most position with arr[0].
        * Now we traverse from 1 to n-1 and at each level we compare the current element arr[i] with the previous element in Left Max Array which is lMax[i-1].
        * We populate the current element of Left Max Array with the maxium of these values.
    * Right Max Array = {6, 6, 6, 3, 3}
        * We take an empty array of the same size as input, populate the right most position with arr[n-1]
        * Now we traverse from n-2 to 0 and at each level we compare the current element arr[i] with the next element in Right Max Array which is rMax[i+1]
        * We populate the current element of Right Max Array with the highest value between these two values.
    * Now we have prepopulated Left Max and Right Max values needed for computing the Rain Water trapped at each element.
    * This may be easily obtained by traversing from 1 to n-1 (because left and right most bars can't trap water)
        * At each level find the minimum between current element of Left Max & Right Max Array.
        * Then substract the current element arr[i] from the minimum value. This will give us the value of rainwater trapped at each bar/element.
        * At each level sum the value of rainwater trapped to get the total rain water trapped
    * **IP ``{5, 0, 6, 2, 3}`` OP : ``6``**<br/>
    * *Explaination arr={5, 0, 6, 2, 3} lMax={5, 5, 6, 6, 3} rMax={6, 6, 6, 3, 3}, So result = 5 - 0 + 6 - 6 + 3 -2 = 5 + 0 + 1 = 6*


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
                rMax[i] = Math.max(arr[i], rMax[i + 1]);
            }
            for (int i = 0; i < n; i++) {
                var rainWater = Math.min(lMax[i], rMax[i]) - arr[i];
                result += rainWater;
            }
            return result;
        }



* [Given a Binary Array, find the count of maximum consecutive 1s in the array](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2) Take two variables `count` & `result`
    * For each element in the array keep track of the highest maximum consecutive 1s until that point in `count`.
        * If current element is 1
            * Increment `count` & set the value of `result` to the maximum of result & count
        * If current relement is 0
            * Reset `count` to 0
    * This way the end of the iteration we will get the maximum consecutive 1s stored in `result
    * **IP ``{0, 1, 1, 0, 1, 1, 1, 0}`` OP : ``3``**<br/>

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


* [Given an Integer array of integers, find the maxium sum of all subarrays](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2) Subarray refers to a part of section of an array. This however means the elements should be contiguous and they should be in the same sequence as in the parent array.
  ### **Naive || `Complexity θ(n^2)`**
    * So we traverse the elements of an array from i=0 to n & we find the maximum sub of subarray starting with that element.
        * We use an inner loop from j=i to n to traverse the subarrays.
        * We use a sum variable to track the sum of each subarray.
        * So at each iteration of the inner loop we add the element to sum and compare value to sum to result.
        * If sum>result, then we assign sum to result. This way the maximum sum of subarrays is captured in result.
    * So the Subarray of {1, 4, -2, 1, -1, 1} would be:
        * {1} Sum: 1, Result: 1
        * {1, 4} Sum: 5  Result: 5
        * {1, 4, -2} Sum: 3  Result: 5
        * {1, 4, -2, 1} Sum: 4  Result: 5
        * {1, 4, -2, 1, -1} Sum: 3  Result: 5
        * {1, 4, -2, 1, -1, 1} Sum: 4  Result: 5
        * {4, -2, 1, -1, 1} Sum: 3  Result: 5
        * {-2, 1, -1, 1} Sum: -1  Result: 5
        * {1, -1, 1} Sum: 1  Result: 5
        * {-1, 1} Sum: 0  Result: 5
        * {1} Sum: 1  Result: 5
    * **IP ``{1, -2, 3, -1, 2}`` OP : ``4``**<br/>
    * **IP ``{1, 4, -2, 1, -1, 1}`` OP : ``5``**<br/>

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
      ### **Efficient || Kadane's Algorithm || `Complexity θ(n)`**
        * We traverse the elements from left to right
        * At each step we find the maximum sum of subarray that must end with this element.
        * The maximum sum of subarray that must end with this element is max of:
            * Addition of max-sum upto the previous element & Sum of current element.
            * Current Element. (This starts calculating sum of a new subarray)
        * If maximum sum of subarray for that must end with this element is greater than result, then we update the result.
        * Our overall result will be the maxium of these values.
        * **IP ``{-5, 1, -2, 3, -1, 2, -2}`` OP : ``4``**<br/>

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
        * *Explaination: Given array {-5, 1, -2, 3, -1, 2, -2}, the max sum of subarray ending with that element would be {-5, 1, -1, 3, 3, 4, 2} and max subarray sum would be max of {-5, 1, -1, 3, 3, 4, 2} which is 4<br/>
          Incase of -5 maximum sum of subarray that must end with this -5 is -5<br/>
          For 1, maximum sum of subarray that must end with this element is Max of -5+1=-4 or 1, so it would be 1<br/>
          For -2, maximum sum of subarray that must end with this element is Max of 1+(-2)=-1 or -2, so it would be -1<br/>
          For 3, maximum sum of subarray that must end with this element is Max of -1+3=2, or 3, so it would be 3<br/>
          For -1, max sum of subarray that must end with this element is Max of 3-1=2 or -1, so it would be 2<br/>
          For 2, max sum of subarray that must end with this element is Max of 2+2=4 or 2, so it would be 4<br/>
          For -2, max sum of subarray that must end with this element is
          Max of -2+4=2 or -2, so it would be 2<br/>
          So max subarray sum would be max of {-5, 1, -1, 3, 3, 4, 2}, which is 4*


* [Given an array of Integers find the maximum length of subarray that has alternating even odd elements](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2) Alternating means the array may begin with either and odd element or a even element. If the array begins with a odd element, the next number should be even, next would be odd. If the array begins with an even elemnt, the next number should be odd, next would be even and so on. Subarray means the elements should be contiguous and they should be in the same sequence as in the parent array.
    * **IP `{5, 10, 20, `6, 3, 8`}` OP : `3`**<br/>
    * **IP `{10, 12,` 14, 7, 8`}` OP : ``3``**<br/>
    * **IP `{`7, 10, 13, 14`}` OP : `4`**<br/>
    * **IP `{`10`, 12, 8, 4}` OP : `1`**<br/>
  ### **Naive Approach || `Complexity θ(n^2)`**
    * We traverse through all the elements from 0 to n-1, and for every element we find the longest alternating subarray beginning with that element and if the current subarray is the longest than the ones found so far we  update the result as well.

    * *Explaination: We initialize result as 1 there will be atleast element in the alternating subarray. Then for each element we traverse the subarray starting from that element. If the element in the subarray is alternating even-odd, we increment count. An element is alternating, if the current element is even and it's previous element odd or if the current element is odd and it's previous element even. If a non alternating even odd element is found, we break out of the loop. The we compare count with result and update it if count>result. This we the length of max alternating even odd sub array gets stored in result.*

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
  ### **Efficient || Kadane's Algorithm || `Complexity θ(n)`**
    * We initialize result & count as 1 as there would be atleast one element in the alternating subarray, which would comprise of arr[0]. Then we begin traversing from i=1 to n, and for every element the element there are two cases:
        * Extend the existing subarray: We extend the subarray if the element is alternating even odd with it's previous element. `count++`. And if the if count>result we update the result to count.
        * Begin a new subarray: We begin a new subarray if the element is not alternating.`count=1`
    * *`Please note, in the naive solution we were finding out subarrays that were beginning with the current element, however in the efficient approach using kadane's algo we find the longest alternating even odd subarray that's ending with the current element.`*


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



* [Given an circular integer array of integers, find the maxium sum of all subarrays within the circular subarray](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)
  ### **Naive Approach || `Complexity θ(n^2)`**
  We traverse through the elements of the array from 0 to n and for each element we find the maximum sum of subarray beginning with that element and then return the maximum all of them.
  So for each element we take two variables in the inner loop curr_max & curr_sum. In curr_sum we calculate the sum of elements until that point and in curr_max we have the maximum sum until that point. By the end in curr_max we have the maximum sum of subarrays starting with that element. In the end we update the result with the maximum sum available in current_max if the same iss greater than result.
    * **IP `{`5`, -2,` 3, 4`}`  OP : `12`**<br/>
    * **IP `{-3, `4, 6,` -2}` OP : `10`**<br/>
    * **IP `{`3, -4, 5, 6,` -8,` 7`}` OP : `17`**<br/>
    * **IP `{-5,` -3`}` OP : `-3`**<br/>

            public static int getMaxCircularSubArraySum_Naive(int[] arr) {
                int result = arr[0];
                int n = arr.length;
                for (int i = 0; i < n; i++) {
                    int current_max = arr[i];
                    int current_sum = arr[i];
                    for (int j = 1; j < n; j++) {
                        int index = (i + j) % n;
                        current_sum = current_sum + arr[index];
                        current_max = Math.max(current_max, current_sum);
                    }
                    result = Math.max(result, current_max);
                }
                return result;
            }


### **Efficient Approach || `Complexity θ(n)`**
The maximum subarray sum would be the maximum of the following:
* Maximum sum of all Normal Sub Array (Kadane's Algorithm)
* Maxium sum of all Circular SubArrays. We get the Maxium sum of all Circular SubArrays by deducting the minimum sum of all subarrays from the total sum of elements in the array. The reason why this works is *since we are dealing with circular subarrays, we can eleminate the middle elements of the array if they are causing the total sum to descrease.*


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

    *So we calulate the maxSumOfRegularSubArray using Kadane's Algo and if the sum if less than 0, return it. This can happen incase all elements in the array is negative. Then for every element we add it to sumOfArray to get the sum of the array and each step negate the element in the array. Since the values of the array are negated in the prvious step, we can call getMaximumSubArraySum() on the negated array and this gives us the negated minimumSubArraySum. Since the minimumSubArraySum is already negated we can directly add this to sumOfArray to get the maxSumOfCircularSubArray. Then we return the max of maxSumOfCircularSubArray & maxSumOfRegularSubArray.*


* [Given an Integer array, find one of the indexes of majority element in the array, if no such element exist, return -1](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2) The majority element is an element theat appears more than n/2 times in the array where n is the  size of the array.

  ### **Naive Approach || `Complexity θ(n^2)`**
  Traverse through every element in the array and count the number of occurrences of the element in the array. If the element is a majority, i.e. occurs more than n/2 return the index of the element.
    * **IP `{`8, `3, 4,` 8, 8`}`  OP : `0 or 3 or 4`**<br/>
    * **IP `{3, 7, 4, 7, 7, 5}` OP : `-1`**<br/>
    * **IP `{20, 30, 40,` 50, 50, 50, 50`}` OP : `3 or 4 or 5 or 6`**<br/>

            public static int getMajorityElement(int[] arr) {
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

  ### **Efficient Approach || [**Boyer-Moore Majority Voting Algorithm**](https://www.geeksforgeeks.org/boyer-moore-majority-voting-algorithm/) || `Complexity θ(n)`**
    * This algorithm works on the fact that if an element occurs more than n/2 times, this means the remaning elements will definitely occur less than n/2 times. *So we choose a candidate from a given set of elements and if it's same as the candidate element, we increase the vote, if not then we decrese the vote. If the number of votes become 0, we choose a new candidate*


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

    *So we use two loops, the first one uses Moore's algorithm to find a candidate which is the maximum occuring element, in the next loop we check if the candidate is is indeed a majority element*


* [Given a binary array, we need to find the minimum of number of group flips to make all array elements same.  In a group flip, we can flip any set of consecutive 1s or 0s.](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)
  So given a binary array we need to find the minimum number of group flips required to make the elements same. We can either flip 0s or flip 1s. For every group to flip we need to print the starting position and the ending position of the flip. So for the array {1,1,0,0,0,1}, we need to flip the 0s since it would require the minimum number of flips so we print from position 2 to 4.
  ### **Naive Approach**
  *In the Naive Approach we can traverse the elements of the array and find the number of groups of 0s and 1s. Then we decide to flip the group of elements which is minimum and then print the start and end of the corresponding flip positions*
  ### **Efficient Approach**
  In a Binary Array there can be only 0s & 1s. So for a given Binary Array there may be two scenarios:
    * Group Count Differs by 1: In this case the minimum group would be the group of element which is not at the starting index
        * {1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1}
        * {0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0}
        * {0, 0, 0, 0, 0}
        * {1, 1, 1, 1, 1}
    * Group Counts are equal: In this case since there is equal number of groups for both 0s & 1s, we can consider any one of them.
        * {0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1}
        * {0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1}
    * So in both cases we can flip the 1st differing element or the second group of element.
    * We  traverse the elements in the array from 1 to n, for every element which is not same as the previous element.
        * If the element is not same as the first element in the array it's the starting position of a flip
        * If the element is same as the first element, then previous element would be the ending position.
    * **IP `{1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1}`**
    * **OP :**<br/>
      **`Flip from index 2 to index 4`**<br/>
      **`Flip from index 8 to index 10`**

            public static void printMinimumGroupFlips(int[] arr) {
                int n = arr.length;
                for (int i = 1; i < n; i++) {
                    if (arr[i] != arr[i - 1]) {
                        if (arr[i] != arr[0]) {
                            System.out.print("Flip from index " + i + " ");
                        } else {
                            System.out.println("to index " + i);
                        }
                    }
                }
                if (arr[n - 1] != arr[0]) {
                    System.out.println(" to index " + (n - 1));
                }
            }


* [Given an array of integers and number k, find the maximum sum of k consecutive elements](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)

* **IP `{1, 8,` 30, -5, 20`, 7}, k=3`  OP : `45`**<br/>

  ### **Efficient** || [**Sliding Window**](https://www.geeksforgeeks.org/window-sliding-technique/) || **`Complexity θ(n)`**
  We calculate the sum of first k elements in the array and initilize it as the maxSum. Then we traverse the array from k to n, & at each level calculate the sum of next k elements in the array and if the sum of next k elements is greater than maxSum we update it. To calculate the sum of next k Element we slide the window, this means we substract the last element outside the window from the currSum & add the next element to the currSum.

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

  ### **Naive Approach**
  Self Explainotory, if you still don't understand refer to gfg tutorial

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

* [Given an array of non-negative integers and a sum, check if a subarray exists with the given sum](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=1)

* **IP `{1, 4, 20, `3, 10, 5`}, givenSum=`18`  OP : `true**<br/>
* **IP `{9, 1, 6, 21, 19, 2}, givenSum=`13`  OP : `false**<br/>
  ### **Efficient** || **Sliding Window** || **`Complexity θ(n)`**
  Refer to Sliding Window gfg tutorial  for more information.



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

    ### **Naive Approach**
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


* [Print first M Nbonacci numbers]((https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=1))
    * **IP `{n = 3, m = 8}, givenSum=`0 0 1 1 2 4 7 13 `  OP : `true**<br/>

  ### **Efficient** || **Sliding Window** || **`Complexity θ(n)`**
  Refer to Sliding Window gfg tutorial  for more information

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

* [Given an array of Integers, and multiple pairs of indexes, how to peform the queries in θ(1) time.](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)
  ### **Efficient** || **Prefix Sum** || **`Complexity of populating the prefixSum θ(n)`** || **`Complexity of query θ(1)`**
  We prepopulate an array of prefix sum, where every element is sum of the current element and the elements before it. Then we can query that array to get the result in O(1) time.
    * **IP `{2, 8, 3, 9, 6, 5, 4}, l=`2`, r=`4`  OP : `18**<br/>

  Refer to Prefix Sum gfg tutorial Part 1 for more information


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


* [Given an array of Integers, find if it has an equilibrium point.](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)
  Equilibrium Point refers to an element in the array such that the elements before it and after it has the same sum.
    * **IP `{3, 4, 8, -9, `20,`  6}  OP : `true**<br/> *20 is the equilibrium point as the 3+4+8-9=6 & the sum of elements after 20 is also 6*
    * **IP `{`4`,2,-2} OP : `true**<br/> *Here 4 is the equilibrium point as there are no elements before 4 so the sum of elements before 4 can be considered 0 and the sum of elements after it is 0*
    * **IP `{4,2,2} OP : `false**<br/> *For this case there are no equilibrium points*<br/>
      Refer to Prefix Sum gfg tutorial Part 1 for more information

  ### **Naive Approach** || **Prefix Sum** || **`Complexity θ(n^2)`**

  Here we traverse the array and for each element we calculate the sum of elements on the right and left of the element using addional loops and return true if the sums are equal.

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


    ### **Efficient Approach** || **Prefix Sum** || **`Complexity θ(n)`**
    Here we first calculate the sum of the all elements in the array in arrSum.
    The we initialize leftSum = 0.
    We traverse the elements in the array and for each element we check if the sum of elements in the left is equal to the sum of elements to the right.
    The sum of elements in the left is calculated inside leftSum by adding the current element at each level.
    The sum of elements in the right is calculated inside arrSum by substracting the current element at each level.*However in arrSum we have the sum including the current element, so during the comparison, we substract the current element from it*

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


* [Given n ranges find the maximum appearing elements in those ranges [Pref]](https://practice.geeksforgeeks.org/tracks/DSASP-Arrays/?batchId=154&tab=2)

  ### **Efficient Approach** || **Prefix Sum** || **`Complexity θ(n)`**
  See gfg video for more details


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