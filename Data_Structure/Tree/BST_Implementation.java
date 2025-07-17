/*
Binary Search Tree: Implementation
*/

package Data_Structure.Tree;

public class BST_Implementation {
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

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root. data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(13);
        root.left = new TreeNode(7);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);

        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(19);

        root.right.right.left = new TreeNode(18);

        inorder(root);
    }
}
