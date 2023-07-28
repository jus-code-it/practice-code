from collections import deque

# Define the graph as an adjacency list
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
}

# Function to perform Breadth-First Search (BFS)
def bfs(start):
    visited = {}
    queue = deque()

    queue.append(start)
    visited[start] = True

    while queue:
        node = queue.popleft()
        print(node, end=' ')

        for neighbor in graph[node]:
            if neighbor not in visited:
                queue.append(neighbor)
                visited[neighbor] = True

# Example usage:
if __name__ == "__main__":
    print("Breadth-First Search (BFS) Traversal:")
    bfs('A')
    print()