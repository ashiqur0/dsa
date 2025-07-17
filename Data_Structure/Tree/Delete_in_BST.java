/*
Binary Search Tree: Delete a node in BST
*/

package Data_Structure.Tree;

public class Delete_in_BST {
    
    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static TreeNode minimum(TreeNode root) {
        while (root != null && root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static TreeNode delete(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minimum(root).data;
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    public static void main(String[] args) {
        int[] BST = {13, 7, 15, 3, 8, 14, 19, 18};
        TreeNode root = null;
        for (int node : BST) {
            root = insert(root, node);
        }

        inorder(root);
        System.out.println();
        delete(root, 19);
        inorder(root);
    }
}