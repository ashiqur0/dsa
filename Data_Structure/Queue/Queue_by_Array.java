/*
Queue : implement using Array

Enqueue : add a new elements to the queue
Dequeue : remove and return the first element from the queue
Peek    : returns the first elements from the queue
isEmpty : checks if the queue is empty.
Size    : find the number of elements in the queue

Where to use ?
Queues can be used to implement job scheduling for an office printer, order processing for e-tickets, or to create algorithms for breadth-first search in graphs.
*/

package Data_Structure.Queue;

class Queue_ {
    private char[] queue;
    private int front;
    private int size;
    private int capacity;

    Queue_(int capacity) {
        this.capacity = capacity;
        this.queue = new char[capacity];
        this.front = 0;
        this.size = 0;
    }

    public void enqueue(char element) {
        if (size == capacity) {
            System.out.println("Queue is full.");
            return;
        }
        queue[(front + size) % capacity] = element;
        size++;
    }

    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\u0000';
        }
        char item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\u0000';
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

public class Queue_by_Array {
    public static void main(String[] args) {
        Queue_ queue = new Queue_(10);
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
    }
}
