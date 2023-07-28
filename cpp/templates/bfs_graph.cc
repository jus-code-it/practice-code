#include <iostream>
#include <vector>
#include <unordered_map>
#include <queue>

using namespace std;

// Define the graph as an adjacency list
unordered_map<char, vector<char>> graph = {
    {'A', {'B', 'C'}},
    {'B', {'D', 'E'}},
    {'C', {'F'}},
    {'D', {}},
    {'E', {'F'}},
    {'F', {}}
};

// Function to perform Breadth-First Search (BFS)
void bfs(char start) {
    unordered_map<char, bool> visited;
    queue<char> q;

    q.push(start);
    visited[start] = true;

    while (!q.empty()) {
        char node = q.front();
        q.pop();
        cout << node << " ";

        for (char neighbor : graph[node]) {
            if (!visited[neighbor]) {
                q.push(neighbor);
                visited[neighbor] = true;
            }
        }
    }
}

// Example usage:
int main() {
    cout << "Breadth-First Search (BFS) Traversal:" << endl;
    bfs('A');
    cout << endl;

    return 0;
}