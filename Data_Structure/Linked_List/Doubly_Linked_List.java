/*
Linked List: Doubly Linked List
Forward and backward direction 
*/

public class Doubly_Linked_List {

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
        
        tail.prev = node2;
        node2.prev = node1;
        node1.prev = head;

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");

        while (tail != null) {
            System.out.print(tail.data + " -> ");
            tail = tail.prev;
        }
        System.out.println("null");
    }
}
