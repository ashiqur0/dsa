package Data_Structure.Queue;
/*
public class z_practice3 {
    private static class Queue {
        int capacity;
        char[] queue;
        int front;
        int size;

        Queue(int capacity) {
            this.capacity = capacity;
            this.queue = new char[capacity];
            this.front = 0;
            this.size = 0;
        }

        public void enqueue(char element) {
            if (size == capacity) {
                System.out.println("Queue is full");
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

    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
    }
}*/
/*
public class z_practice3 {

    private static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = next;
        }
    }
    
    private static class Queue {
        Node front;
        Node rear;
        int size;

        Queue() {
            this.front = null;
            this.rear = null;
            this.size = 0;
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

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
    }
}*/
/* 
public class z_practice3 {
    private static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = next;
        }
    }

    private static class Queue {
        Node front;
        Node rear;
        int size;

        Queue() {
            this.front = null;
            this.rear = null;
            this.size = 0;
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

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
    }
}*/
public class z_practice3 {
    private static class Queue {
        int capacity;
        char[] queue;
        int front;
        int size;

        Queue(int capacity) {
            this.capacity = capacity;
            this.queue = new char[capacity];
            this.front = 0;
            this.size = 0;
        }

        public void enqueue(char element) {
            if (size == capacity) {
                System.out.println("Queue is full");
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

    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
    }
}