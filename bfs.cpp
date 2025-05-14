#include <iostream>
#include <vector>
#include <queue>
using namespace std;
void BFS(int startNode, const vector<vector<int>>& adjList) {
    vector<bool> visited(adjList.size(), false);
    queue<int> q;

    // Start from the given node
    visited[startNode] = true;
    q.push(startNode);

    cout << "BFS Traversal: ";
    while (!q.empty()) {
        int currentNode = q.front();
        q.pop();
        cout << currentNode << " ";

        // Visit all unvisited neighbors
        for (int neighbor : adjList[currentNode]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                q.push(neighbor);
            }
        }
    }
    cout << endl;
}

int main() {
    // Example graph: 5 vertices (0 to 4)
    vector<vector<int>> adjList = {
        {1, 2},    // Neighbors of vertex 0
        {0, 3, 4}, // Neighbors of vertex 1
        {0, 4},    // Neighbors of vertex 2
        {1},       // Neighbors of vertex 3
        {1, 2}     // Neighbors of vertex 4
    };

    int startNode = 0;
    BFS(startNode, adjList);

    return 0;
}
