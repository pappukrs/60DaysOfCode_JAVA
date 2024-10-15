package Pappu.DAY11;
import java.util.*;

public class BFS {
    
    static class Edge {
        int src, dest, wt;

        // Constructor to initialize source, destination, and weight
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Create a graph as an adjacency list
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();  // Initialize each vertex's adjacency list
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));
    }

    // BFS implementation
    public static void bfs(ArrayList<Edge> graph[], int V) {
        boolean visited[] = new boolean[V]; // Track visited nodes
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // Starting from node 0

        while (!q.isEmpty()) {
            int curr = q.remove(); // Remove element from queue
            if (!visited[curr]) {
                System.out.print(curr + " "); // Process the current node
                visited[curr] = true;

                // Add unvisited neighbors to the queue
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);  // Add destination node to queue
                }
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int V = 7;  // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);  // Create the graph
        bfs(graph, V);  // Perform BFS
    }


}

