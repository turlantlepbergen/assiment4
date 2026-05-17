import java.util.*;

public class Graph {

    private ArrayList<Vertex> vertices;
    private ArrayList<ArrayList<Integer>> list;

    public Graph(int size) {

        vertices = new ArrayList<>();
        list = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            vertices.add(new Vertex(i));

            list.add(new ArrayList<>());
        }
    }


    public void addEdge(int from, int to) {

        list.get(from).add(to);

        // undirected graph
        list.get(to).add(from);
    }

    // print graph
    public void printGraph() {

        System.out.println("Graph:");

        for (int i = 0; i < list.size(); i++) {

            System.out.print(i + " -> ");

            for (int j : list.get(i)) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }


    public void bfs(int start) {

        boolean[] visited = new boolean[list.size()];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;

        queue.add(start);

        System.out.print("BFS: ");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbor : list.get(current)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;

                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }


    public void dfs(int start) {

        boolean[] visited = new boolean[list.size()];

        System.out.print("DFS: ");

        dfsHelper(start, visited);

        System.out.println();
    }

    private void dfsHelper(int current, boolean[] visited) {

        visited[current] = true;

        System.out.print(current + " ");

        for (int neighbor : list.get(current)) {

            if (!visited[neighbor]) {

                dfsHelper(neighbor, visited);
            }
        }
    }
}