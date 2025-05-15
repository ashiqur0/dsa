#include <iostream>
#include <vector>
#include <queue>
using namespace std;

void BFS(int startNode, vector<vector<int>> adjList) {
    vector<bool> visited(adjList.size(), false);
    queue<int> q;
    visited[startNode] = true;
    q.push(startNode);
    while(!q.empty()) {
        int currentNode = q.front();
        q.pop();
        cout << currentNode << " ";
        for(int neighbor : adjList[currentNode]) {
            if(!visited[neighbor]) {
                visited[neighbor] = true;
                q.push(neighbor);
            }
        }
    }
    cout << endl;
}

int main() {

    vector<vector<int>> adjlist = {
        {1, 2},
        {0, 3, 4},
        {0, 4},
        {1},
        {1, 2}
    };

    int startNode = 0;
    BFS(startNode, adjlist);

    return 0;
}