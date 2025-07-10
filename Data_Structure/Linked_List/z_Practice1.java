/*
Linked List: Practice Day 1
Singly Linked List
*/

package Data_Structure.Linked_List;

public class z_Practice1 {

    // singly linked list, singly circular linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // doubly linked list, doubly circular linked list
    static class Node2 {
        int data;
        Node2 next;
        Node2 prev;

        Node2(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void singlyLinkedList() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node currNode = node1;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void doublyLinkedList() {
        Node2 node1 = new Node2(10);
        Node2 node2 = new Node2(20);
        Node2 node3 = new Node2(30);
        Node2 node4 = new Node2(40);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node2.prev = node1;
        node3.prev = node2;
        node4.prev = node3;

        // Forward Traversal
        Node2 currNode = node1;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

        // Backward Traversal
        currNode = node4;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.prev;
        }
        System.out.println("null");
    }
    
    private static void circular_singlyLinkedList() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1; // circular link

        Node startNode = node1;
        Node currentNode =  node1;
        System.out.print(startNode.data + " -> ");
        startNode = startNode.next;
        while (startNode != currentNode) {
            System.out.print(startNode.data + " -> ");
            startNode = startNode.next;
        }
        System.out.println("null");
    }

    protected static void circular_doublyLinkedList() {
        Node2 node1 = new Node2(10);
        Node2 node2 = new Node2(20);
        Node2 node3 = new Node2(30);
        Node2 node4 = new Node2(40);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1; // circular link

        node1.prev = node4; // circular link
        node2.prev = node1;
        node3.prev = node2;
        node4.prev = node3;

        Node2 startNode = node1;
        Node2 currentNode = node1;
        System.out.print(startNode.data + " -> ");
        startNode = startNode.next;
        while (startNode != currentNode) {
            System.out.print(startNode.data + " -> ");
            startNode = startNode.next;
        }
        System.out.println("null");

        startNode = node4;
        currentNode = node4;
        System.out.print(startNode.data + " -> ");
        startNode = startNode.prev;
        while (startNode != currentNode) {
            System.out.print(startNode.data + " -> ");
            startNode = startNode.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // singlyLinkedList();
        // doublyLinkedList();
        // circular_singlyLinkedList();
        circular_doublyLinkedList();
    }

}
