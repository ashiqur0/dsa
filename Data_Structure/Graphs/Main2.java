/*
Graphs: Implementation using class
Graph Type: directed and weighted Graph
*/

package Data_Structure.Graphs;

class D_W_Graph {
    private int size;
    private int[][] adjacencyMatrix;
    private char[] vertices;

    public D_W_Graph(int size) {
        this.size = size;
        this.adjacencyMatrix = new int[size][size];
        this.vertices = new char[size];
    }

    public void addVertices(int index, char vertex) {
        if (index >= 0 && index < size) {
            vertices[index] = vertex;
        }
    }

    public void addEdge(int u, int v, int weight) {
        if (u >= 0 && u < size && v >= 0 && v < size) {
            adjacencyMatrix[u][v] = weight;
        }
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nVertex:");
        for(int i = 0; i < size; i++) {
            System.out.println("vertex: " + i + ": " + vertices[i]);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        D_W_Graph graph = new D_W_Graph(4);
        graph.addVertices(0, 'A');
        graph.addVertices(1, 'B');
        graph.addVertices(2, 'C');
        graph.addVertices(3, 'D');

        graph.addEdge(0, 1, 3);
        graph.addEdge(0, 2, 2);
        graph.addEdge(2, 1, 1);
        graph.addEdge(3, 0, 4);

        graph.printGraph();
    }
}