import java.util.*;

public class DepthFirstSearchGraph {

    // Define the graph as an adjacency list
    static Map<Character, List<Character>> graph = new HashMap<>();
    static {
        graph.put('A', Arrays.asList('B', 'C'));
        graph.put('B', Arrays.asList('D', 'E'));
        graph.put('C', Arrays.asList('F'));
        graph.put('D', new ArrayList<>());
        graph.put('E', Arrays.asList('F'));
        graph.put('F', new ArrayList<>());
    }

    // Function to perform Depth-First Search (DFS)
    static void dfs(Character node, Map<Character, Boolean> visited) {
        // Mark the current node as visited
        visited.put(node, true);
        System.out.print(node + " ");

        // Recur for all the adjacent nodes not yet visited
        for (Character neighbor : graph.get(node)) {
            if (!visited.get(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }

    // Function to initialize the DFS traversal from all unvisited nodes
    static void dfsTraversal() {
        Map<Character, Boolean> visited = new HashMap<>();
        for (Character node : graph.keySet()) {
            visited.put(node, false);
        }

        for (Character node : graph.keySet()) {
            if (!visited.get(node)) {
                dfs(node, visited);
            }
        }
    }

    // Example usage:
    public static void main(String[] args) {
        System.out.println("Depth-First Search (DFS) Traversal:");
        dfsTraversal();
        System.out.println();
    }
}
