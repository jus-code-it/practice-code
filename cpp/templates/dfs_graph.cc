#include <iostream>
#include <vector>
#include <unordered_map>

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

// Function to perform Depth-First Search (DFS)
void dfs(char node, unordered_map<char, bool>& visited) {
    // Mark the current node as visited
    visited[node] = true;
    cout << node << " ";

    // Recur for all the adjacent nodes not yet visited
    for (char neighbor : graph[node]) {
        if (!visited[neighbor]) {
            dfs(neighbor, visited);
        }
    }
}

// Function to initialize the DFS traversal from all unvisited nodes
void dfs_traversal() {
    unordered_map<char, bool> visited;

    for (const auto& pair : graph) {
        visited[pair.first] = false;
    }

    for (const auto& pair : graph) {
        if (!visited[pair.first]) {
            dfs(pair.first, visited);
        }
    }
}

// Example usage:
int main() {
    cout << "Depth-First Search (DFS) Traversal:" << endl;
    dfs_traversal();
    cout << endl;

    return 0;
}