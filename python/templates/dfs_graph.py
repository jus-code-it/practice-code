# Define the graph as an adjacency list
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
}

# Function to perform Depth-First Search (DFS)
def dfs(graph, node, visited):
    # Mark the current node as visited
    visited[node] = True
    print(node, end=' ')

    # Recur for all the adjacent nodes not yet visited
    for neighbor in graph[node]:
        if not visited[neighbor]:
            dfs(graph, neighbor, visited)

# Function to initialize the DFS traversal from all unvisited nodes
def dfs_traversal(graph):
    visited = {node: False for node in graph}

    for node in graph:
        if not visited[node]:
            dfs(graph, node, visited)

# Example usage:
if __name__ == "__main__":
    print("Depth-First Search (DFS) Traversal:")
    dfs_traversal(graph)