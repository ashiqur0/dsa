#include <iostream>
#include <vector>
#include <stack>
using namespace std;

void DFS(int start, const vector<vector<int>>& graph, vector<bool>& visited) {
    stack<int> s;
    s.push(start);
    
    while (!s.empty()) {
        int node = s.top();
        s.pop();
        
        if (!visited[node]) {
            cout << node << " ";
            visited[node] = true;
        }
        
        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                s.push(neighbor);
            }
        }
    }
}

int main() {
    int vertices = 5;
    vector<vector<int>> graph(vertices);
    graph[0] = {1, 2};
    graph[1] = {3, 4};
    graph[2] = {4};
    graph[3] = {};
    graph[4] = {};

    vector<bool> visited(vertices, false);

    cout << "DFS Traversal starting from node 0: ";
    DFS(0, graph, visited);

    return 0;
}