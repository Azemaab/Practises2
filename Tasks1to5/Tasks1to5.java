package Tasks1to5;

import java.util.*;

public class Tasks1to5 {
    public static void main(String[] args) {

        // Task 1: Unique integers
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> unique = new HashSet<>();
        for (int n : numbers) {
            unique.add(n);
        }
        System.out.println("Task 1 - Unique numbers: " + unique);

        // Task 2: Check membership
        HashSet<String> users = new HashSet<>();
        users.add("Alice");
        users.add("Bob");
        System.out.println("Task 2 - Is Bob allowed? " + users.contains("Bob"));

        // Task 3: Size & emptiness
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println("Task 3 - Size: " + set.size());
        set.clear();
        System.out.println("Task 3 - Is empty: " + set.isEmpty());

        // Task 4: Remove element
        HashSet<String> names = new HashSet<>();
        names.add("Anna");
        names.add("John");
        names.add("Mike");
        boolean removed = names.remove("Mike");
        System.out.println("Task 4 - Removed Mike: " + removed);
        System.out.println(names);

        // Task 5: addAll
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4));
        set1.addAll(set2);
        System.out.println("Task 5 - After addAll: " + set1);
    }
}

