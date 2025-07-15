/*
Graphs: Implementation using Class

*/

package Data_Structure.Graphs;

class Graph {
    private int[][] adjacencyMatrix;
    private char[] vertices;
    private int size;

    public Graph(int size) {
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

    public void printGraph() {
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
        Graph graph = new Graph(4);
        graph.addVertices(0, 'A');
        graph.addVertices(1, 'B');
        graph.addVertices(2, 'C');
        graph.addVertices(3, 'D');

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);

        graph.printGraph();
    }    
}