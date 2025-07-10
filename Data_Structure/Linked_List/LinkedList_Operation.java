/*
Linked List Operation: Traversal, Search, Sort, delete, insert 

*/

package Data_Structure.Linked_List;

public class LinkedList_Operation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node listImplementation() {
        Node node1 = new Node(40);
        Node node2 = new Node(10);
        Node node3 = new Node(30);
        Node node4 = new Node(20);
    
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return node1;
    }

    public static void traversal(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static boolean search(Node head, int target) {
        while (head != null) {
            if (head.data == target) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static Node delete(Node head, Node nodeTodelete) {
        if (head == nodeTodelete) {
            return head.next;
        }

        Node currNode = head;
        while (currNode.next != null && currNode.next != nodeTodelete) {
            currNode = currNode.next;
        }

        if (currNode.next == null) {
            return head;
        }

        currNode.next = currNode.next.next;

        return head;
    }

    public static Node insert(Node head, Node newNode, int position) {
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node currNode = head;
        for (int i = 1; i < position - 1 && currNode != null; i++) {
            currNode = currNode.next;
        }

        if (currNode != null) {
            newNode.next = currNode.next;
            currNode.next = newNode;
        }

        return head;
    }

     // Function to find the middle of the list
    static Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    static Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data) {
            a.next = sortedMerge(a.next, b);
            return a;
        } else {
            b.next = sortedMerge(a, b.next);
            return b;
        }
    }

    // Merge sort for linked list
    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null; // Split the list

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    public static void main(String[] args) {
        Node head = listImplementation();
        // traversal(head);
        // System.out.println(search(head, 30));   // true

        // head = delete(head, head.next.next);
        // System.out.println("After Deletion: ");

        // Node newNode = new Node(50);
        // head = insert(head, newNode, 5);

        head = mergeSort(head);
        traversal(head);
    }
}
