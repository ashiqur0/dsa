/*
Linked List: Practice Day 2
Singly Linked List
*/

package Data_Structure.Linked_List;

public class z_Practice2 {

    private static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void singlyLinkedList() {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void doublyLinkedList() {
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

        while(tail != null) {
            System.out.print(tail.data + " -> ");
            tail = tail.prev;
        }
        System.out.println("null");
    }

    public static void circularSinglyLinkedList() {
         Node head = new Node(10);
         Node node1 = new Node(20);
         Node node2 = new Node(30);
         Node tail = new Node(40);

         head.next = node1;
         node1.next = node2;
         node2.next = tail;
         tail.next = head;  // circular link

        Node curNode = head;

        System.out.print(curNode.data + " -> ");
        curNode = curNode.next;
        while (curNode != head) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("...");
    }

    public static void circularDoublyLinkedList() {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node tail = new Node(40);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;
        tail.next = head;   // circular link

        head.prev = tail;
        node2.prev = node1;
        node1.prev = head;
        tail.prev = node2;  // circular link

        Node currNode = head;
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;
        while (currNode != head) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("...");

        currNode = tail;
        System.out.print(tail.data + " -> ");
        currNode = currNode.prev;
        while (currNode != tail) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.prev;
        }
        System.out.println("...");
    }

    public static void main(String[] args) {
        // singlyLinkedList();
        // doublyLinkedList();
        // circularSinglyLinkedList();
        circularDoublyLinkedList();
    }
}