import java.util.*;

public class Tasks6to10 {
    public static void main(String[] args) {

        // Task 6: removeAll
        HashSet<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> B = new HashSet<>(Arrays.asList(3, 4));
        A.removeAll(B);
        System.out.println("Task 6 - After removeAll: " + A);

        // Task 7: retainAll
        HashSet<Integer> X = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> Y = new HashSet<>(Arrays.asList(2, 3, 4));
        X.retainAll(Y);
        System.out.println("Task 7 - Common elements: " + X);

        // Task 8: containsAll
        HashSet<Integer> C = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> D = new HashSet<>(Arrays.asList(2, 3));
        System.out.println("Task 8 - Contains all: " + C.containsAll(D));

        // Task 9: Deduplicate words
        String sentence = "this is a test test example";
        String[] words = sentence.split(" ");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Task 9 - Unique words: " + uniqueWords);

        // Task 10: Case-insensitive words
        String[] mix = {"Apple", "apple", "APPLE"};
        HashSet<String> result = new HashSet<>();
        for (String w : mix) {
            result.add(w.toLowerCase());
        }
        System.out.println("Task 10 - Case-insensitive: " + result);
    }
}
