package Tasks1to5.Practises6to10.Tasks11to15;

import java.util.*;

public class Tasks16to20 {
    public static void main(String[] args) {

        // Task 16: poll variants
        ArrayDeque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        System.out.println("poll: " + deque.poll());
        System.out.println("pollFirst: " + deque.pollFirst());
        System.out.println("pollLast: " + deque.pollLast());

        // Task 17: remove occurrences
        ArrayDeque<String> letters = new ArrayDeque<>(Arrays.asList("a","b","c","b","a"));
        letters.removeFirstOccurrence("b");
        System.out.println("After removeFirstOccurrence: " + letters);
        letters.removeLastOccurrence("a");
        System.out.println("After removeLastOccurrence: " + letters);

        // Task 18: size & isEmpty
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(1);
        System.out.println("Size: " + d.size() + " Empty: " + d.isEmpty());
        d.remove();
        System.out.println("Size: " + d.size() + " Empty: " + d.isEmpty());

        // Task 19: clear
        d.add(10);
        d.add(20);
        d.clear();
        System.out.println("After clear peek: " + d.peek());
        System.out.println("Is empty: " + d.isEmpty());

        // Task 20: palindrome check
        String word = "racecar";
        ArrayDeque<Character> chars = new ArrayDeque<>();
        for (char c : word.toCharArray()) {
            chars.add(c);
        }
        boolean palindrome = true;
        while (chars.size() > 1) {
            if (!chars.removeFirst().equals(chars.removeLast())) {
                palindrome = false;
                break;
            }
        }
        System.out.println("Task 20 - Palindrome: " + palindrome);
    }
}
