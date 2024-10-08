package Pappu.DAY6.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

// Custom class Person
class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementing compareTo to sort by age (natural ordering)
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CustomTreeSet {
    public static void main(String[] args) {

        // 1. TreeSet with Integer
        TreeSet<Integer> intSet = new TreeSet<>();
        intSet.add(10);
        intSet.add(5);
        intSet.add(20);
        intSet.add(15);
        System.out.println("Integer TreeSet: " + intSet); // Output: [5, 10, 15, 20]

        // 2. TreeSet with String
        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Grapes");
        stringSet.add("Orange");
        System.out.println("String TreeSet: " + stringSet); // Output: [Apple, Banana, Grapes, Orange]

        // 3. TreeSet with Custom Objects (Person) - Sorted by age (natural ordering)
        TreeSet<Person> personSetByAge = new TreeSet<>();
        personSetByAge.add(new Person("John", 25));
        personSetByAge.add(new Person("Alice", 30));
        personSetByAge.add(new Person("Bob", 20));
        personSetByAge.add(new Person("David", 35));
        System.out.println("Person TreeSet (sorted by age): " + personSetByAge);
        // Output: [Bob (20), John (25), Alice (30), David (35)]

        // 4. TreeSet with Custom Comparator (Sorted by name)
        Comparator<Person> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        TreeSet<Person> personSetByName = new TreeSet<>(nameComparator);
        personSetByName.add(new Person("John", 25));
        personSetByName.add(new Person("Alice", 30));
        personSetByName.add(new Person("Bob", 20));
        personSetByName.add(new Person("David", 35));
        System.out.println("Person TreeSet (sorted by name): " + personSetByName);
        // Output: [Alice (30), Bob (20), David (35), John (25)]
    }
}
