/*
Stack : Implementation using LinkedList
Operation: 
1. push
2. pop
3. peek
4. size
5. isEmpty

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
    
    private static class Stack {
        private Node head;
        private int size;
    
        public Stack() {
            this.head = null;
            this.size = 0;
        }
    
        public void push(char value) {
            Node newNode = new Node(value);
            if (head != null) {
                newNode.next = head;
            }
            head = newNode;
            size++;
        }
    
        public char pop() {
            if (isEmpty()) {
                return ' ';
            }
            char popped = head.value;
            head = head.next;
            size--;
            return popped;
        }
    
        public char peek() {
            if (isEmpty()) {
                return ' ';
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