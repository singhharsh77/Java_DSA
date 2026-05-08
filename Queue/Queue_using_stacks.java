package Queue;

import java.util.*;

public class Queue_using_stacks {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            // move all elements to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // push new element
            s1.push(data);

            // move back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);

        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}