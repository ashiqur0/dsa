/*
Queue : implement using LinkedList

Enqueue : add a new elements to the queue
Dequeue : remove and return the first element from the queue
Peek    : returns the first elements from the queue
isEmpty : checks if the queue is empty.
Size    : find the number of elements in the queue

Where to use ?
Queues can be used to implement job scheduling for an office printer, order processing for e-tickets, or to create algorithms for breadth-first search in graphs.
*/

package Data_Structure.Queue;

class Node {
    protected char data;
    protected Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;
    private int size;

    Queue() {
        this.size = 0;
        this.front = null;
        this.rear = null;
    }

    public void enqueue(char element) {
        Node newNode = new Node(element);
        if (rear == null) {
            rear = front = newNode;
            size++;
            return;
        }

        rear.next = newNode;
        rear = newNode;
        size++;
    }

    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\u0000';
        }

        Node temp = front;
        front = temp.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return temp.data;
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\u0000';
        }
        return front.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

public class Queue_by_LL {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("isEmpty : " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
    }
}
