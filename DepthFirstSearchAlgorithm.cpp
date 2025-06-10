// Depth First Search Algorithm

#include <bits/stdc++.h>
using namespace std;

void DFS(vector<vector<int>> adjList, int startNode) {
    vector<bool> visited(adjList.size(), false);
    stack<int> s;
    s.push(startNode);

    while(!s.empty()) {
        int currentNode = s.top();
        s.pop();

        if (!visited[currentNode]) {
            cout << currentNode << " ";
            visited[currentNode] = true;
        }

        for (int neighbour : adjList[currentNode]) {
            s.push(neighbour);
        }
    }
    cout << endl;
}

int main() {

    vector<vector<int>> adjList = {
        {1, 2},
        {3, 4},
        {4},
        {},
        {}
    };

    int startNode = 0;
    DFS(adjList, startNode);

  return 0;
}