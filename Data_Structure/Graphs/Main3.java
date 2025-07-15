/*
Graphs: Graph Traversal DFS 
DFS: Depth First Search

How it works:
Start DFS traversal on a vertex.
Do a recursive DFS traversal on each of the adjacent vertices as long as they are not already visited.
*/

package Data_Structure.Graphs;

class DFS_Graph {
    private int size;
    private int[][] adjacencyMatrix;
    private char[] vertices;

    public DFS_Graph(int size) {
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

    public void dfs(char visit) {
        boolean[] visited = new boolean[size];
        int startVertex = new String(vertices).indexOf(visit);
        dfs_util(startVertex, visited);
    }
}

public class Main3 {
    public static void main(String[] args) {
        DFS_Graph graph = new DFS_Graph(7);
        graph.addVertices(0, 'A');
        graph.addVertices(1, 'B');
        graph.addVertices(2, 'C');
        graph.addVertices(3, 'D');
        graph.addVertices(4, 'E');
        graph.addVertices(5, 'F');
        graph.addVertices(6, 'G');

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
        graph.dfs('D');
    }
}