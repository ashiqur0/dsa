package Data_Structure.Tree;

public class z_practice {
    
    private static class Node {
        char data;
        Node left;
        Node right;
        
        Node(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // Pre order Tree Traversal
    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // In order Tree Traversal
    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Post order Tree Traversal
    static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node('R');
        Node nodeA = new Node('A');
        Node nodeB = new Node('B');
        Node nodeC = new Node('C');
        Node nodeD = new Node('D');
        Node nodeE = new Node('E');
        Node nodeF = new Node('F');
        Node nodeG = new Node('G');
        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;
        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        System.out.print("\nPreorder:\t");
        preorder(root);
        System.out.print("\nInorder:\t");
        inorder(root);
        System.out.print("\nPostorder:\t");
        postorder(root);
    }
}

/* Practice Tree

*/
/* Practice Tree

*/
/* Practice Tree

*/
/* Practice Tree

*/
/* Practice Tree

*/
/* Practice Tree

*/
/* Practice Tree

*/
/* Practice Tree

*/