package Pappu.DAY4.HASHING;

import java.util.*;

public class SubarraySum {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  
        int count = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int k1 = 2; 
        System.out.println("Test Case 1: " + subarraySum(nums1, k1)); 
        
        int[] nums2 = {1, 2, 3};
        int k2 = 3; 
        System.out.println("Test Case 2: " + subarraySum(nums2, k2)); 
        
        int[] nums3 = {1, 2, 1, 2, 1};
        int k3 = 3; 
        System.out.println("Test Case 3: " + subarraySum(nums3, k3)); 
        
        int[] nums4 = {1, 2, 3, 4, 5};
        int k4 = 5; 
        System.out.println("Test Case 4: " + subarraySum(nums4, k4));
        
        int[] nums5 = {0, 0, 0, 0, 0};
        int k5 = 0; 
        System.out.println("Test Case 5: " + subarraySum(nums5, k5)); 
    }
    
    
}
