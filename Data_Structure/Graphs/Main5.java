/*
Graphs: Graph Traversal DFS-BFS
Graphs Type: Directed Graphs
*/

package Data_Structure.Graphs;

class BFS_DFS_Graph {
    private int size;
    private int[][] adjacencyMatrix;
    private String[] vertices;

    public BFS_DFS_Graph(int size) {
        this.size = size;
        this.adjacencyMatrix = new int[size][size];
        this.vertices = new String[size];
    }

    public void addVertices(int index, String vertex) {
        if (index >= 0 && index < size) {
            vertices[index] = vertex;
        }
    }

    public void addEdge(int u, int v) {
        if (u >= 0 && u < size && v >= 0 && v < size) {
            adjacencyMatrix[u][v] = 1;
            // adjacencyMatrix[v][u] = 1;
        }
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0 ; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nVertices:");
        for (int i = 0; i < size; i++) {
            System.out.println("vertex " + i + ": " + vertices[i]);
        }
    }

    public void dfs_util(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(vertices[v] + " ");
        for (int i = 0; i < size; i++) {
            if (adjacencyMatrix[v][i] == 1 && !visited[i]) {
                dfs_util(i, visited);
            }
        }
    }

    public void dfs(String visit) {
        boolean[] visited = new boolean[size];
        int startVertex = findVertexIndex(visit);
        dfs_util(startVertex, visited);
    }
    
    public void bfs(String startVertex) {
        boolean[] visited = new boolean[size];
        int[] q = new int[size];
        int rear = 0;
        int front = 0;

        int startIndex = findVertexIndex(startVertex);
        q[front++] = startIndex;
        visited[startIndex] = true;

        while (rear < front) {
            int currentVertex = q[rear++];
            System.out.print(vertices[currentVertex] + " ");

            for (int i = 0; i < size; i++) {
                if (adjacencyMatrix[currentVertex][i] == 1 && !visited[i]) {
                    q[front++] = i;
                    visited[i] = true;
                }
            }
        }
    }

    public int findVertexIndex(String vertex) {
        for (int i = 0; i < size; i++) {
            if (vertices[i].equals(vertex)) {
                return i;
            }
        }
        return -1;
    }
}

public class Main5 {
    public static void main(String[] args) {
        BFS_DFS_Graph graph = new BFS_DFS_Graph(7);
        graph.addVertices(0, "A");
        graph.addVertices(1, "B");
        graph.addVertices(2, "C");
        graph.addVertices(3, "D");
        graph.addVertices(4, "E");
        graph.addVertices(5, "F");
        graph.addVertices(6, "G");

        graph.addEdge(3, 0);
        graph.addEdge(0, 2);
        graph.addEdge(0, 4);
        graph.addEdge(4, 2);
        graph.addEdge(2, 5);
        graph.addEdge(2, 1);
        graph.addEdge(2, 6);
        graph.addEdge(1, 5);

        graph.printGraph();

        System.out.print("\nDFS Traversal: ");
        graph.dfs("D");

        System.out.print("\nBFS Traversal: ");
        graph.bfs("D");
    }
}