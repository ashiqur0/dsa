/*
Binary Tree: Implementation
*/

package Data_Structure.Tree;

public class Tree_Implementation {

    private static class TreeNode {
        char data;
        TreeNode left;
        TreeNode right;

        public TreeNode(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static TreeNode createNode(char data) {
        return new TreeNode(data);
    }

    public static void main(String[] args) {
        TreeNode root = createNode('R');
        TreeNode nodeA = createNode('A');
        TreeNode nodeB = createNode('B');
        TreeNode nodeC = createNode('C');
        TreeNode nodeD = createNode('D');
        TreeNode nodeE = createNode('E');
        TreeNode nodeF = createNode('F');
        TreeNode nodeG = createNode('G');
        
        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        System.out.println(root.left.right.data);
    }
}