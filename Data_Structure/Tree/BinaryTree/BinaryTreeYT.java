/*
DSA : Binary Tree
*/
package Data_Structure.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeYT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right =  null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // Preorder Traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder Traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Level Order Traversal
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }

        return countNode(root.left) + countNode(root.right) + 1;
    }

    public static int sumOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        return sumOfTree(root.left) + sumOfTree(root.right) + root.data;
    }

    // height of the tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.left);
        int diameter3 = height(root.left) + height(root.right) + 1;

        return Math.max(diameter1, Math.max(diameter2, diameter3));
    }

    static class TreeInfo {
        int diameter;
        int height;
        TreeInfo(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diameter1 = left.diameter;
        int diameter2 = right.diameter;
        int diameter3 = left.height + right.height + 1;

        int myDiameter = Math.max(Math.max(diameter1, diameter2), diameter3);

        TreeInfo info = new TreeInfo(myDiameter, myHeight);
        return info;
    }
 
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.print("Preorder: ");
        // preorder(root);

        // System.out.print("\nPreorder: ");
        // inorder(root);

        // System.out.print("\nPostorder: ");
        // postorder(root);

        // System.out.println("\nLevelOrder: ");
        // levelOrder(root);

        // System.out.println(countNode(root));
        // System.out.println(sumOfTree(root));
        // System.out.println(height(root));
        // System.out.println(diameter(root));
        System.out.println(diameter2(root).diameter); // because it returns obj
    }
}
