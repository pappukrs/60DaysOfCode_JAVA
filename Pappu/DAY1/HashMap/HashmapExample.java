import java.util.HashMap;
import java.util.Map;

class HashmapExample {
    public static void main(String[] args) {
        // 1. Creating a HashMap that maps String keys to Integer values
        HashMap<String, Integer> hash = new HashMap<>();

        // 2. Adding key-value pairs to the HashMap using put() method
        hash.put("Alka", 1);
        hash.put("Sharma", 43);
        hash.put("Kumar", 27);
        hash.put("Verma", 56);

        // 3. Printing the entire HashMap
        System.out.println("Initial HashMap: " + hash);

        // 4. Accessing a value using the get() method
        System.out.println("Value for key 'Alka': " + hash.get("Alka"));

        // 5. Replacing the value of an existing key using replace() method
        System.out.println("Replacing 'Alka' with value 11: " + hash.replace("Alka", 11));

        // 6. Printing the updated HashMap
        System.out.println("Updated HashMap: " + hash);

        // 7. Checking if a key exists using containsKey()
        System.out.println("Does key 'Sharma' exist? " + hash.containsKey("Sharma"));

        // 8. Checking if a value exists using containsValue()
        System.out.println("Does value 43 exist? " + hash.containsValue(43));

        // 9. Removing a key-value pair using remove()
        hash.remove("Kumar");
        System.out.println("HashMap after removing 'Kumar': " + hash);

        // 10. Getting the size of the HashMap
        System.out.println("Size of HashMap: " + hash.size());

        // 11. Iterating over HashMap using forEach() method
        System.out.println("\nIterating using forEach:");
        hash.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // 12. Iterating using entrySet() and for-each loop
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 13. Adding a null key and null values (allowed in HashMap)
        hash.put(null, 99);  // null key
        hash.put("NullValue", null);  // null value
        System.out.println("HashMap after adding null key and value: " + hash);

        // 14. Demonstrating HashMap does not maintain order
        System.out.println("\nHashMap does not maintain any order:");
        hash.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}
