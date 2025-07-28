/*
Linked List: Practice Day 3
Practice: Insert and Delete operation
*/

public class z_Practice3 {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void traverse(Node head) {
        while(head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    static Node insert(Node head, Node newNode, int position) {
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node curNode = head;
        for (int i = 1; i < position - 1 && curNode.next != null; i++) {
            curNode = curNode.next;
        }
 
        if (curNode.next == null) {
            newNode.next = curNode.next;
            curNode.next = newNode;
        }

        return head;
    }

    static Node delete(Node head, Node nodeToDelete) {
        if (head == nodeToDelete) {
            return head.next;
        }

        Node curNode = head;
        while (curNode != null && curNode.next != nodeToDelete) {
            curNode = curNode.next;
        }

        if (curNode == null) {
            return head;
        }

        curNode.next = curNode.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node tail = new Node(40);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;

        traverse(head);
        // head = delete(head, head.next); // delete 20
        // traverse(head);
        
        Node newNode = new Node(50);
        head = insert(head, newNode, 5);
        traverse(head);
    }
}