/*
Binary Tree: Post-order Traversal

*/

package Data_Structure.Tree;

public class PostOrder_Traversal {
    
    private static class Node {
        char data;
        Node left;
        Node right;

        public Node(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createNode(char data) {
        return new Node(data);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = createNode('R');
        Node nodeA = createNode('A');
        Node nodeB = createNode('B');
        Node nodeC = createNode('C');
        Node nodeD = createNode('D');
        Node nodeE = createNode('E');
        Node nodeF = createNode('F');
        Node nodeG = createNode('G');

        root.left = nodeA;
        root.right = nodeB;
        nodeA.left = nodeC;
        nodeA.right = nodeD;
        nodeB.left = nodeE;
        nodeB.right = nodeF;
        nodeF.left = nodeG;

        System.out.print("Post-Order Traversal: ");
        postorder(root);
    }
}
