// Define the graph as an adjacency list
const graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
};

// Function to perform Breadth-First Search (BFS)
function bfs(start) {
    const visited = {};
    const queue = [];

    queue.push(start);
    visited[start] = true;

    while (queue.length > 0) {
        const node = queue.shift();
        process.stdout.write(node + ' ');

        for (const neighbor of graph[node]) {
            if (!visited[neighbor]) {
                queue.push(neighbor);
                visited[neighbor] = true;
            }
        }
    }
}

// Example usage:
console.log('Breadth-First Search (BFS) Traversal:');
bfs('A');
console.log();