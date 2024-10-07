package Pappu.DAY4.HASHING;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

   
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();  
        int maxLength = 0, start = 0; 
    
        for (int end = 0; end < s.length(); end++) {  
            while (set.contains(s.charAt(end))) {  
                set.remove(s.charAt(start));  
                start++;  
            }
            set.add(s.charAt(end)); 
            maxLength = Math.max(maxLength, end - start + 1); 
        }
        return maxLength;
    }

  
    public static void main(String[] args) {
        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();

      
        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";
        String test4 = "";
        String test5 = "dvdf";
        String test6 = "anviaj";
        
        System.out.println("Test 1: Input = 'abcabcbb', Output = " + solution.lengthOfLongestSubstring(test1));  // Expected output: 3
        System.out.println("Test 2: Input = 'bbbbb', Output = " + solution.lengthOfLongestSubstring(test2));    // Expected output: 1
        System.out.println("Test 3: Input = 'pwwkew', Output = " + solution.lengthOfLongestSubstring(test3));   // Expected output: 3
        System.out.println("Test 4: Input = '', Output = " + solution.lengthOfLongestSubstring(test4));         // Expected output: 0
        System.out.println("Test 5: Input = 'dvdf', Output = " + solution.lengthOfLongestSubstring(test5));     // Expected output: 3
        System.out.println("Test 6: Input = 'anviaj', Output = " + solution.lengthOfLongestSubstring(test6));   // Expected output: 5
    }
}
