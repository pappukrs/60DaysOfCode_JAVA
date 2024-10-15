package Pappu.DAY12;

public class SlidingWindowProblems {

    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];  // Add the next element to the window

            // When we have a full window of size `k`
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);  // Update max sum
                windowSum -= arr[i - (k - 1)];  // Slide the window by subtracting the element going out
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(maxSumSubarray(new int[]{2, 1, 5, 1, 3, 2}, 3));  // Output: 9
        System.out.println(maxSumSubarray(new int[]{2, 3, 4, 1, 5}, 2));    // Output: 7
    }
}
