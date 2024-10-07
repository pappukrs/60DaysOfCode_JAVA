package Pappu.DAY4.HASHING;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        Map<Character, Integer> pCount = new HashMap<>();
        Map<Character, Integer> sCount = new HashMap<>();

        // Store frequency of characters in p
        for (char c : p.toCharArray()) {
            pCount.put(c, pCount.getOrDefault(c, 0) + 1);
        }

        int windowSize = p.length();

        for (int i = 0; i < s.length(); i++) {
            // Add current character to the window
            char ch = s.charAt(i);
            sCount.put(ch, sCount.getOrDefault(ch, 0) + 1);

            // Remove character that's out of the window (when window size exceeds p.length())
            if (i >= windowSize) {
                ch = s.charAt(i - windowSize);
                if (sCount.get(ch) == 1) sCount.remove(ch);  // Remove if its count becomes 0
                else sCount.put(ch, sCount.get(ch) - 1);     // Decrease count
            }

            // If the frequency maps match, add the starting index of the window
            if (pCount.equals(sCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FindAllAnagrams faa = new FindAllAnagrams();
        
        // Test cases
        System.out.println(faa.findAnagrams("cbaebabacd", "abc")); // Output: [0, 6]
        System.out.println(faa.findAnagrams("abab", "ab"));        // Output: [0, 1, 2]
        System.out.println(faa.findAnagrams("af", "be"));          // Output: []
    }
}