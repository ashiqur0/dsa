/*
Binary Search Tree: Find Lowest value in BST
*/

package Data_Structure.Tree.BinarySearchTree;

public class Lowest_in_BST_subTree {
    
    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static Node minimum(Node root) {
        while (root != null && root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] BST = {13, 3, 8, 7, 15, 14, 19, 18};
        Node root =  null;
        for (int node : BST) {
            root = insert(root, node);
        }

        inorder(root);
        System.out.println();
        System.out.println("Minimum: " + minimum(root).data);
    }
}