import java.util.*;

public class BreadthFirstSearch {

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

    // Function to perform Breadth-First Search (BFS)
    static void bfs(Character start) {
        Map<Character, Boolean> visited = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        queue.add(start);
        visited.put(start, true);

        while (!queue.isEmpty()) {
            Character node = queue.poll();
            System.out.print(node + " ");

            for (Character neighbor : graph.get(node)) {
                if (!visited.getOrDefault(neighbor, false)) {
                    queue.add(neighbor);
                    visited.put(neighbor, true);
                }
            }
        }
    }

    // Example usage:
    public static void main(String[] args) {
        System.out.println("Breadth-First Search (BFS) Traversal:");
        bfs('A');
        System.out.println();
    }
}

