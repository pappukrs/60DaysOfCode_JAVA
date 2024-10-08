package Pappu.DAY6.TreeSet;

import java.util.HashSet;

// Custom class Person
class Person {
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

    // Override hashCode and equals to prevent duplicates
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CustomHashset{
    public static void main(String[] args) {

        // 1. HashSet with Integer
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(10);
        intSet.add(5);
        intSet.add(20);
        intSet.add(15);
        intSet.add(10); // Duplicate, won't be added
        System.out.println("Integer HashSet: " + intSet); // Example Output: [20, 5, 10, 15]

        // 2. HashSet with String
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Grapes");
        stringSet.add("Orange");
        stringSet.add("Apple"); // Duplicate, won't be added
        System.out.println("String HashSet: " + stringSet); // Example Output: [Grapes, Orange, Apple, Banana]

        // 3. HashSet with Custom Objects (Person)
        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("John", 25));
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 20));
        personSet.add(new Person("David", 35));
        personSet.add(new Person("John", 25)); // Duplicate, won't be added
        System.out.println("Person HashSet: " + personSet);
        // Example Output: [Alice (30), Bob (20), John (25), David (35)]
    }
}
