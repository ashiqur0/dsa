/*
Graphs: Implementation using class
Graphs: undirected and unweighted UD_UW_Graph
*/

package Data_Structure.Graphs;

class UD_UW_Graph {
    private int[][] adjacencyMatrix;
    private char[] vertices;
    private int size;

    public UD_UW_Graph(int size) {
        this.size = size;
        this.adjacencyMatrix = new int[size][size];
        this.vertices = new char[size];
    }
    
    public void addVertices(int index, char vertex) {
        if (index >= 0 && index < size) {
            vertices[index] = vertex;
        }
    }

    public void addEdge(int u, int v) {
        if (u >= 0 && u < size && v >= 0 && v < size) {
            adjacencyMatrix[u][v] = 1;
            adjacencyMatrix[v][u] = 1;
        }
    }

    public void printUD_UW_Graph() {
        System.out.println("Adjacency Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nVertices");
        for (int i = 0; i < size; i++) {
            System.out.println("Vertex " + i + ": " + vertices[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        UD_UW_Graph UD_UW_Graph = new UD_UW_Graph(4);
        UD_UW_Graph.addVertices(0, 'A');
        UD_UW_Graph.addVertices(1, 'B');
        UD_UW_Graph.addVertices(2, 'C');
        UD_UW_Graph.addVertices(3, 'D');

        UD_UW_Graph.addEdge(0, 1);
        UD_UW_Graph.addEdge(0, 2);
        UD_UW_Graph.addEdge(0, 3);
        UD_UW_Graph.addEdge(1, 2);

        UD_UW_Graph.printUD_UW_Graph();
    }    
}