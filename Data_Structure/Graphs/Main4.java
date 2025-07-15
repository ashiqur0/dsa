/*
Graphs: Graph Traversal BFS
BFS: Breadth First Search

How it works:
Put the starting vertex into the queue.
For each vertex taken from the queue, visit the vertex, then put all unvisited adjacent vertices into the queue.
Continue as long as there are vertices in the queue.
*/

package Data_Structure.Graphs;

class BFS_Graph {
    private int size;
    private int[][] adjacentMatrix;
    private char[] vertices;

    public BFS_Graph(int size) {
        this.size = size;
        this.adjacentMatrix = new int[size][size];
        this.vertices = new char[size];
    }

    public void addVertices(int index, char vertex) {
        if (index >= 0 && index < size) {
            vertices[index] = vertex;
        }
    }

    public void addEdges(int u, int v) {
        if (u >= 0 && u < size && v >= 0 && v < size) {
            adjacentMatrix[u][v] = 1;
            adjacentMatrix[v][u] = 1;
        }
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(adjacentMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nVertex:");
        for (int i = 0; i < size; i++) {
            System.out.println("vertex " + i + ": " + vertices[i]);
        }
    }

    public void bfs(char startVertex) {
        boolean[] visited = new boolean[size];
        int[] q = new int[size];
        int rear = 0;
        int front = 0;

        int startIndex = new String(vertices).indexOf(startVertex);
        q[front++] = startIndex;
        visited[startIndex] = true;

        while (rear < front) {
            int currentVertex = q[rear++];
            System.out.print(vertices[currentVertex] + " ");

            for (int i = 0; i < size; i++) {
                if (adjacentMatrix[currentVertex][i] == 1 && !visited[i]) {
                    q[front++] = i;
                    visited[i] = true;
                }
            }
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        BFS_Graph graph = new BFS_Graph(7);
        graph.addVertices(0, 'A');
        graph.addVertices(1, 'B');
        graph.addVertices(2, 'C');
        graph.addVertices(3, 'D');
        graph.addVertices(4, 'E');
        graph.addVertices(5, 'F');
        graph.addVertices(6, 'G');

        graph.addEdges(3, 0);
        graph.addEdges(0, 2);
        graph.addEdges(0, 3);
        graph.addEdges(0, 4);
        graph.addEdges(4, 2);
        graph.addEdges(2, 5);
        graph.addEdges(2, 1);
        graph.addEdges(2, 6);
        graph.addEdges(1, 5);

        graph.printGraph();

        System.out.print("\nBFS Traversal: ");
        graph.bfs('D');
    }
}