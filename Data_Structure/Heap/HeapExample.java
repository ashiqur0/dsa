package Data_Structure.Heap;

import java.util.PriorityQueue;

public class HeapExample {
    public static void main(String[] args) {
        // Min-heap (default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);
        
        System.out.println("Min-Heap:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
        
        // Max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        
        System.out.println("\nMax-Heap:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
