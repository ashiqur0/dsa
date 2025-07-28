/*
Stack : Implementation using LinkedList
Operation: 
1. push   : insert element to the top
2. pop    : return and remove element from top
3. peek   : return element from top
4. size   : return size
5. isEmpty: check if the stack is empty

*/

package Data_Structure.Stack;


public class Stack_by_LL {

    private static class Node {
        char value;
        Node next;
        Node(char value) {
            this.value = value;
            this.next = null;
        }
    }

    // stack implement
    private static class Stack {
        private Node head;
        private int size;
    
        public Stack() {
            this.head = null;
            this.size = 0;
        }
        
        // insert at top
        public void push(char value) {
            Node newNode = new Node(value);
            if (head != null) {
                newNode.next = head;
            }
            head = newNode;
            size++;
        }
        
        // remove and return top element
        public char pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return '\u0000';
            }
            char popped = head.value;
            head = head.next;
            size--;
            return popped;
        }
        
        // return top element
        public char peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return '\u0000';
            }
            return head.value;
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

        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
    }
}