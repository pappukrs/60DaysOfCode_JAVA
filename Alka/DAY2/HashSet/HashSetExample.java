
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> hash = new HashSet<>();

        // Adding elements
        hash.add("apple");
        hash.add("banana");
        hash.add("orange");

        // Checking if an element exists
        if (hash.contains("apple")) {
            System.out.println("HashSet contains apple");
        }

        // Removing an element
        hash.remove("banana");

        // Size of HashSet
        System.out.println("Size of HashSet: " + hash.size());

        // Iterating over the elements
        for (String item : hash) {
            System.out.println("Element: " + item);
        }
    }
}
