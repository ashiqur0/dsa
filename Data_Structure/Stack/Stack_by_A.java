/*
Stack : Implementation using Array
*/

package Data_Structure.Stack;

class Stack_ {
    private char[] stack;
    private int top;
    private int capacity;

    public Stack_(int capacity) {
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
            return ' ';
        }
        char popped = stack[top];
        top--;
        return popped;
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return ' ';
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

public class Stack_by_A {
    public static void main(String[] args) {
        Stack_ stack = new Stack_(10);
        stack.push('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
    }
}
