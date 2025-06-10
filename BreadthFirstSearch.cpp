// Breadth First Search Algorithm

#include <bits/stdc++.h>
using namespace std;

void BFS(vector<vector<int>> adjList, int startNode) {
    vector<bool> visited(adjList.size(), false);
    queue<int> q;
    visited[startNode] = true;
    q.push(startNode);
    while(!q.empty()) {
        int currentNode = q.front();
        q.pop();
        cout << currentNode << " ";
        for(int neighbour : adjList[currentNode]) {
            if(!visited[neighbour]) {
                visited[neighbour] = true;
                q.push(neighbour);
            }
        }
    }
    cout << endl;
}

int main() {

    vector<vector<int>> adjList = {
        {1, 2},
        {0, 3, 4},
        {0, 4},
        {1},
        {1, 2}
    };
    int startNode = 0;
    BFS(adjList, startNode);

  return 0;
}