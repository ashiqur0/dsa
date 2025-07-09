/*
Linked List: Doubly Linked List
*/

package Data_Structure.Linked_List;

public class Doubly_Linked_List {
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
        
        node2.prev = node1;
        node3.prev = node2;
        node4.prev = node3;

        Node currNode = node1;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

        currNode = node4;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.prev;
        }
        System.out.println("null");
    }
}
