/*
Graphs: Implementation
Graphs: is a non linear data structures that consists vertices and edges.

a vertices: also called node, is a point or an object in the graph, and 
an Edge: is used to connect two vertices with each other.

Uses of Graphs:
Social Networks: where each person is a vertices and friendship is edge
Map and Navigation: where a town or bus stop is a vertices or node and road is edge
Internet: where web pages are vertices and hyperlink are edges

Properties of Graphs:
A weighted graph: where the edges have values
A connected graph: where all the vertices are connected through edges somehow
A directed graph: is when the edge between the vertices pair has a direction
A cyclic graph: when a graph's vertices connected like a loop 
    Undirected graph:
    Directed graph:
Loop: when an edge is begins and end with same vertices.

Graph Representation: tells us how the graph is stored in the memory
Adjacency Matrix Graph Representation:
    Undirected and Unweighted
    Directed and Weighted
Adjacency List Graph Representation:
    Undirected and Unweighted
    Directed and Weighted
*/

package Data_Structure.Graphs;

public class DSA_Graphs {

    static void printAdjacencyMatrix(int[][] matrix) {
        System.out.println("\n\nAdjacency Matrix:");
        for (int[] row : matrix) {
            for (int data : row) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }

    static void printConnection(int[][] matrix, String[] vertices) {
        System.out.println("\nConnection for Each vertices:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(vertices[i] + ": ");
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print(vertices[j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] vertices = {"A", "B", "C", "D"};

        int[][] adjacencyMatrix = {
            {0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 0},
            {1, 0, 0, 0}
        };

        System.out.print("vertices Data: ");
        for (String node : vertices) {
            System.out.print(node + " ");
        }

        printAdjacencyMatrix(adjacencyMatrix);
        printConnection(adjacencyMatrix, vertices);
    }
}
