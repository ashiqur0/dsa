/*
Linked List: Circular Singly Linked List
*/

package Data_Structure.Linked_List;

public class Circular_Singly_Linked_List {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node  head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node tail = new Node(40);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;
        tail.next =  head; // circular link

        Node currNode =  head;

        System.out.print(currNode.data  + " -> ");
        currNode = currNode.next;
        while (currNode != head) {
            System.out.print(currNode.data  + " -> ");
            currNode = currNode.next;
        }
        System.out.println("...");
    }
}
