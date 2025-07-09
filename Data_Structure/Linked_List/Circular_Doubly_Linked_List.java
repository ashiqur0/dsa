/*
Linked List: Circular Doubly Linked List
*/

package Data_Structure.Linked_List;

public class Circular_Doubly_Linked_List {
    static class Node {
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
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1; // circular link

        node1.prev = node4; // circular link
        node2.prev = node1;
        node3.prev = node2;
        node4.prev = node3;

        Node currNode = node1;
        Node startNode = node1;
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;
        while (currNode != startNode) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("...");

        currNode = node4;
        startNode = node4;
        System.out.print(currNode.data + " -> ");
        currNode = currNode.prev;
        while (currNode != startNode) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.prev;
        }
        System.out.println("...");
    }
}
