/*
Graphs: Implementation
Graphs: is a non linear data structures that consists vertices and edges.

a Vertex: also called node, is a point or an object in the graph, and 
an Edge: is used to connect two vertices with each other.

Uses of Graphs:
Social Networks: where each person is a vertex and friendship is edge
Map and Navigation: where a town or bus stop is a vertex or node and road is edge
Internet: where web pages are vertices and hyperlink are edges

Properties of Graphs:
A weighted graph: where the edges have values
A connected graph: where all the vertices are connected through edges somehow
A directed graph: is when the edge between the vertex pair has a direction
A cyclic graph: when a graph's vertex connected like a loop 
    Undirected graph:
    Directed graph:
Loop: when an edge is begins and end with same vertex.

Graph Representation: tells us how the graph is stored in the memory
Adjacency Matrix Graph Representation:
    Undirected and Unweighted
    Directed and Weighted
Adjacency List Graph Representation:
    Undirected and Unweighted
    Directed and Weighted
*/

package Data_Structure.Graphs;

public class Graphs {

    static void printAdjacencyMatrix(int[][] matrix) {
        System.out.println("\n\nAdjacency Matrix:");
        for (int[] row : matrix) {
            for (int data : row) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] vertex = {"A", "B", "C", "D"};

        int[][] AdjacencyMatrix = {
            {0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 0},
            {1, 0, 0, 0}
        };

        System.out.print("Vertex Data: ");
        for (String node : vertex) {
            System.out.print(node + " ");
        }

        printAdjacencyMatrix(AdjacencyMatrix);
    }
}
