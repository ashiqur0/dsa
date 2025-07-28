
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
