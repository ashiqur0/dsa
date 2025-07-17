/*
Binary Search Tree: A type of Binary Tree
A Binary Search Tree is a Binary Tree where every node's left child has a lower value, and every node's right child has a higher value.

A clear advantage with Binary Search Trees is that operations like search, delete, and insert are fast and done without having to shift values in memory.
*/

package Data_Structure.Tree.BinarySearchTree;

import java.util.ArrayList;

public class BST {

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
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

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        } else if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int value) {
        if (root.data > value) {
            root.left = delete(root.left, value);
        } else if (root.data < value) {
            root.right = delete(root.right, value);
        } else {

            // case 1
            if (root.left == null && root.left == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }

        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if (root.data >= y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    public static void root2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        // leaf
        if (root.left == null && root.right == null) {
            path.forEach(p -> System.out.print(p + " -> "));
            System.out.println("null");
        }

        root2Leaf(root.left, path);
        root2Leaf(root.right, path);
        path.remove(path.size() -1);
    }

    public static void main(String[] args) {
        int[] node = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < node.length; i++) {
            root = insert(root, node[i]);
        }

        inorder(root);
        System.out.println();

        // System.out.println("\nSearch 6: " + search(root, 6));   // false
        // System.out.println("Search 5: " + search(root, 5));     // true

        // // delete(root, 5);
        // inorder(root);

        // System.out.print("\nPrint Range 6 to 10: ");
        // printInRange(root, 3, 12);

        root2Leaf(root, new ArrayList<>());
    }
}