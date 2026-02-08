import java.util.*;

public class Tasks11to15 {
    public static void main(String[] args) {

        // Task 11: Offer, peek, poll
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Task 11 - Peek: " + queue.peek());
        while (!queue.isEmpty()) {
            System.out.println("Poll: " + queue.poll());
        }

        // Task 12: Stack behavior
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        while (!stack.isEmpty()) {
            System.out.println("Task 12 - Pop: " + stack.pop());
        }

        // Task 13: addFirst / addLast
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println("Task 13 - " + deque);

        // Task 14: offerFirst / offerLast
        System.out.println("Task 14 - offerFirst: " + deque.offerFirst(0));
        System.out.println("Task 14 - offerLast: " + deque.offerLast(3));
        System.out.println(deque);

        // Task 15: peek variants
        System.out.println("Task 15 - peek: " + deque.peek());
        System.out.println("peekFirst: " + deque.peekFirst());
        System.out.println("peekLast: " + deque.peekLast());
    }
}

