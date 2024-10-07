package Pappu.DAY4.HASHING;
import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            
            // If the sorted string is not a key in the map, create a new entry
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            // Add the original string to the list corresponding to the sorted key
            map.get(sorted).add(s);
        }
        
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        
        // Test cases
        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(ga.groupAnagrams(input1));
        
        String[] input2 = {""};
        System.out.println(ga.groupAnagrams(input2));

        String[] input3 = {"a"};
        System.out.println(ga.groupAnagrams(input3));
    }
}
