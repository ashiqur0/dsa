/*
Binary Search Tree: Insert in BST
*/

package Data_Structure.Tree;

public class Insert_in_BST {
    
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

    public static TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        } else {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else if (data > root.data) {
                root.right = insert(root.right, data);
            }
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(13);
        TreeNode node7 = new TreeNode(7);
        TreeNode node15 = new TreeNode(15);
        TreeNode node3 = new TreeNode(3);
        TreeNode node8 = new TreeNode(8);
        TreeNode node14 = new TreeNode(14);
        TreeNode node19 = new TreeNode(19);
        TreeNode node18 = new TreeNode(18);

        root.left = node7;
        root.right = node15;
        node7.left = node3;
        node7.right = node8;
        node15.left = node14;
        node15.right = node19;
        node19.left = node18;

        inorder(root);
        System.out.println();
        insert(root, 10);
        inorder(root);
    }
}
