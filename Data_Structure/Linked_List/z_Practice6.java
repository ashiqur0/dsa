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