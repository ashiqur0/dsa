/*
Tree: is a hierarchical data structure

Uses: 
Hierarchical Data: File systems, organizational models, etc.
Databases: Used for quick data retrieval.
Routing Tables: Used for routing data in network algorithms.
Sorting/Searching: Used for sorting data and searching for data.
Priority Queues: Priority queue data structures are commonly implemented using trees, such as binary heaps.

Tree Terminology:
Root node: the top node of the tree
Edges: two nodes connected with an edge
Nodes: 
Leaf nodes: the node who doesn't have child node
Child nodes: the node who has parent node
Sibling: if a node has two child then those two child is sibling of one another
Parent nodes: the node who has at least one child node
Tree height: number or edges from the root node to leaf node
Tree size: number of nodes the tree consists with

Types of Tree:
Binary Tree: a type of tree where a node can have at maximum of two child nodes
Binary Search Tree: a type of binary tree where left child value is lower than right child
AVL Tree: a type of binary search tree that self balanced

*/
package Data_Structure.Tree;

public class Tree {

    private static class Node {
        String data;
        Node left;
        Node right;

        public Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node("R");
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

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
