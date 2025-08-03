/* Practice LinkedList
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
    
    public static void circular_singlyLinkedList() {
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

    public static void circular_doublyLinkedList() {
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
}*/
/* Practice LinkedList


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

    public static void traverse(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node singlyLinkedList() {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        return head;
    }

    public static  Node doublyLinkedList() {
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

        return head;
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

    public static boolean search(Node head, int target) {
        while (head != null) {
            if (head.data == target) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = singlyLinkedList();
        // Node head = doublyLinkedList();
        // circularSinglyLinkedList();
        // circularDoublyLinkedList();

        traverse(head);
        System.out.println(search(head, 22));
    }
}
*/
/* Practice LinkedList
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
*/
/* Practice LinkedList
public class z_Practice4 {
    
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void traverse(Node head) {
        while (head != null) {
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
            newNode.next =  curNode.next;
            curNode.next = newNode;
        }

        return head;
    }

    static Node delete(Node head, Node nodeToDelete) {
        if (head == nodeToDelete) {
            return head.next;
        }

        Node cuNode = head;
        while (cuNode != null && cuNode.next != nodeToDelete) {
            cuNode = cuNode.next;
        }

        if (cuNode == null) {
            return head;
        }

        cuNode.next = cuNode.next.next;

        return head;
    }

    public static void main(String[] args) {
        // Node head = new Node(10);
        // Node node1 = new Node(20);
        // Node node2 = new Node(30);
        // Node tail = new Node(40);

        // head.next = node1;
        // node1.next = node2;
        // node2.next = tail;
        Node head = new Node(10);
        for (int i = 1; i <= 5; i++) {
            // Node newNode  = new Node(i * 10);
            insert(head, new Node(i * 10), i);
        }

        traverse(head);

        // Node newNode = new Node(50);
        // insert(head, newNode, 5);
        
        delete(head, head.next);    // 20 delete
        traverse(head);        
    }
}
*/
/* Practice LinkedList

public class z_Practice5 {

    private static class  Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void traverse(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    static boolean search(Node head, int target) {
        while (head != null) {
            if (head.data == target) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    static Node insert(Node head, Node newNode, int position) {
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node curNode = head;
        for (int i = 1; i < position - 1 && curNode != null; i++) {
            curNode = curNode.next;
        }

        if (curNode != null) {
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
        while (curNode.next != null && curNode.next != nodeToDelete) {
            curNode = curNode.next;
        }

        if (curNode.next == null) {
            return head;
        }

        curNode.next = curNode.next.next;

        return head;
    }

    static Node mid(Node head) {
        if (head == null) return head;

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }

    static Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = mid(head);
        Node nextOfmid = mid.next;
        mid.next = null;

        Node left = sort(head);
        Node right = sort(nextOfmid);

        return merge(left, right);
    }

    public static void main(String[] args) {
        Node head = new Node(150);
        Node node1 = new Node(20);
        Node node2 = new Node(70);
        Node tail = new Node(40);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;

        traverse(head);

        // System.out.println(search(head, 40));

        // Node newNode = new Node(50);
        // insert(head, newNode, 5);//insert 50 at position 5
        // traverse(head);

        // delete(head, head.next); // delete 20
        // traverse(head);

        head = sort(head);
        traverse(head);
    }
}
*/
/* Practice LinkedList
public class z_Practice6 {
    
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node listImplement() {
        Node head = new Node(40);
        Node node1 = new Node(30);
        Node node2 = new Node(20);
        Node tail = new Node(10);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;

        return head;
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
        for (int i = 1; i < position - 1 && curNode != null; i++) {
            curNode = curNode.next;
        }

        if (curNode != null) {
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
        while (curNode.next != null && curNode.next != nodeToDelete) {
            curNode = curNode.next;
        }

        if (curNode.next == null) {
            return head;
        }

        curNode.next = curNode.next.next;

        return head;
    }

    static boolean search(Node head, int target) {
        while (head != null) {
            if (head.data == target) {
                return true;
            }

            head = head.next;
        }

        return false;
    }

    static Node midNode(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }

    // Merge sort
    static Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = midNode(head);
        Node nextOfMid = mid.next;
        mid.next = null;            // split the list

        Node left = sort(head);
        Node right = sort(nextOfMid);

        return merge(left, right);
    }
 
    public static void main(String[] args) {
        Node head = listImplement();
        traverse(head);

        Node newNode = new Node(100);
        head = insert(head, newNode, 2);
        traverse(head);

        head = delete(head, head.next);
        traverse(head);

        System.out.println(search(head, 50));

        head = sort(head);
        traverse(head);
    }
}
*/
/* Practice LinkedList

*/
/* Practice LinkedList

*/