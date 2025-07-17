/*
Binary Search Tree: Search in BST
*/

package Data_Structure.Tree;

public class Search_in_BST {
    
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

    public static TreeNode search(TreeNode root, int key) {
        
        if (root == null) {
            return null;
        } else if (root.data == key) {
            return root;
        } else if (root.data < key) {
            return search(root.right, key);
        } else if (root.data > key) {
            return search(root.left, key);
        }

        return null;
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

        System.out.println((search(root, 2) != null ? "found" : "not found"));
        System.out.println((search(root, 8) != null ? "found" : "not found"));
    }
}