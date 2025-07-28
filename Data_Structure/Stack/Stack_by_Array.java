/*
Stack : Implementation using Array 
Operation: 
1. push   : insert element to the top
2. pop    : return and remove element from top
3. peek   : return element from top
4. size   : return size
5. isEmpty: check if the stack is empty

*/

package Data_Structure.Stack;

public class Stack_by_Array {
    // construct the stack
    private static class Stack {
        private char[] stack;
        private int top;
        private int capacity;
    
        // initialize stack properties
        public Stack(int capacity) {
            this.capacity = capacity;
            this.stack = new char[capacity];
            this.top = -1;
        }
    
        // insert at top position
        public void push(char element) {
            if (top == capacity - 1) {
                System.out.println("Stack is full");
                return;
            }
            stack[++top] = element;
        }
    
        // return and remove top element
        public char pop() {
            if (isEmpty()) {
                return '\u0000';
            }
            char popped = stack[top];
            top--;
            return popped;
        }
    
        // return top element
        public char peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return '\u0000';
            }
            return stack[top];
        }
    
        public boolean isEmpty() {
            return top == - 1;
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

        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        // stack.pop();
        // stack.peek();
    }
}
