package Data_Structure.Stack;
/* 
public class z_practice1 {
    private static class Stack {
        int capacity;
        char[] stack;
        int top;

        public Stack(int capacity) {
            this.capacity = capacity;
            this.stack = new char[capacity];
            this.top = -1;
        }

        public void push(char element) {
            if (top == capacity - 1) {
                System.out.println("Stack is full");
                return;
            }

            stack[++top] = element;
        }

        public char pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return '\u0000';
            }
            char pooped = stack[top];
            top--;
            return pooped;
        }

        public char peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty"); 
                return '\u0000';
            }

            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('E');
        stack.push('F');

        System.out.println("Pop: " + stack.pop());
        System.err.println("Peek: " + stack.peek());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
    }
}

public class z_practice1 {
    private static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private static class Stack {
        Node head;
        int size;

        Stack() {
            this.head = null;
            this.size = 0;
        }

        public void push(char data) {
            Node newNode = new Node(data);
            if (head != null) {
                newNode.next = head;
                // System.out.println("shddhhd");
            }
            head = newNode;
            size++;
        }

        public char pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return '\u0000';
            }
            char pooped = head.data;  
            head = head.next;
            size--;
            return pooped;
        }

        public char peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return '\u0000';
            }

            return head.data;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push('A');
        stack.push('B');
        // stack.push('C');
        // stack.push('D');
        // stack.push('E');
        // stack.push('F');

        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
    }
}
*/

public class z_practice1 {

    private static class  Node {
        char data;
        Node next;
        
        public Node (char data) {
            this.data = data;
            this.next = null;
        }
    }

    private static class Stack {
        Node head;
        int size;

        public Stack() {
            this.head = null;
            this.size = 0;
        }

        public void push(char data) {
            Node newNode = new Node(data);
            if (head != null) {
                newNode.next = head;
            }
            head = newNode;
            size++;
        }

        public char pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return '\u0000';
            }
            char popped = head.data;
            head = head.next;
            size--;
            return popped;
        }

        public char peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return '\u0000';
            }

            return head.data;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('E');
        stack.push('F');

        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
    }
}