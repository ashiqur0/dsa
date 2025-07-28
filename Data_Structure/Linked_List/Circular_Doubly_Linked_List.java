/*
Linked List: Circular Doubly Linked List
*/

public class Circular_Doubly_Linked_List {

    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node tail = new Node(40);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;
        tail.next = head; // circular link

        head.prev = tail; // circular link
        node1.prev = head;
        node2.prev = node1;
        tail.prev = node2;

        Node currNode = head;
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;
        
        while (currNode != head) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("...");

        currNode = tail;
        System.out.print(currNode.data + " -> ");
        currNode = currNode.prev;
        
        while (currNode != tail) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.prev;
        }
        System.out.println("...");
    }
}
