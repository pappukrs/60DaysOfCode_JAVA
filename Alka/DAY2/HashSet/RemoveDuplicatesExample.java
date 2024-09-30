import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Using HashSet to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("Original List: " + numbers);
        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }
}
