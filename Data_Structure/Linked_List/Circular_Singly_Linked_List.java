/*
Linked List: Circular Singly Linked List
*/

package Data_Structure.Linked_List;

public class Circular_Singly_Linked_List {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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

        Node currNode = node1;
        Node startNode = node1;

        System.out.print(currNode.data  + " -> ");
        currNode = currNode.next;
        while (currNode != startNode) {
            System.out.print(currNode.data  + " -> ");
            currNode = currNode.next;
        }
        System.out.println("...");
    }
}
