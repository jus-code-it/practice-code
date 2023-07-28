// Define the graph as an adjacency list
const graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
};

// Function to perform Depth-First Search (DFS)
function dfs(node, visited) {
    // Mark the current node as visited
    visited[node] = true;
    process.stdout.write(node + ' ');

    // Recur for all the adjacent nodes not yet visited
    for (const neighbor of graph[node]) {
        if (!visited[neighbor]) {
            dfs(neighbor, visited);
        }
    }
}

// Function to initialize the DFS traversal from all unvisited nodes
function dfsTraversal() {
    const visited = {};

    for (const node in graph) {
        visited[node] = false;
    }

    for (const node in graph) {
        if (!visited[node]) {
            dfs(node, visited);
        }
    }
}

// Example usage:
console.log('Depth-First Search (DFS) Traversal:');
dfsTraversal();
console.log();