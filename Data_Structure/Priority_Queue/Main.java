/*
Priority Queue: The Priority Queue Data Structure
FIFO: First In First Out
Queue is an interface
*/

package Data_Structure.Priority_Queue;

import java.util.Collections;
// import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Queue<Double> queue = new LinkedList<>();                            // keep as it is
        // Queue<Double> queue = new PriorityQueue();                           // sort ascending order
        Queue<Double> queue = new PriorityQueue(Collections.reverseOrder());    // sort descending order

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // Queue<String> grade = new PriorityQueue();
        Queue<String> grade = new PriorityQueue(Collections.reverseOrder());

        grade.offer("B");
        grade.offer("C");
        grade.offer("A");
        grade.offer("F");
        grade.offer("D");

        while (!grade.isEmpty()) {
            System.out.println(grade.poll());
        }

        // Queue<Character> ch = new PriorityQueue<>();
        Queue<Character> ch = new PriorityQueue<>(Collections.reverseOrder());

        ch.offer('V');
        ch.offer('Z');
        ch.offer('W');
        ch.offer('Y');
        ch.offer('X');

        while (!ch.isEmpty()) {
            System.out.println(ch.poll());
        }
    }
}
