public class Experiment {

    public void runTest(int size) {

        Graph g = new Graph(size);


        for (int i = 0; i < size - 1; i++) {

            g.addEdge(i, i + 1);

            if (i + 2 < size) {
                g.addEdge(i, i + 2);
            }
        }

        System.out.println("\nSize: " + size);


        if (size == 10) {
            g.printGraph();
        }


        long start1 = System.nanoTime();

        g.bfs(0);

        long end1 = System.nanoTime();


        long start2 = System.nanoTime();

        g.dfs(0);

        long end2 = System.nanoTime();

        System.out.println("BFS Time: " + (end1 - start1) + " ns");

        System.out.println("DFS Time: " + (end2 - start2) + " ns");
    }
}