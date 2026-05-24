Graph Traversal and Representation System
Project Overview
This project demonstrates graph traversal algorithms in Java. The graph is implemented using an adjacency list representation.

The project includes:

Vertex class
Edge class
Graph class
BFS algorithm
DFS algorithm
Performance experiments
Graphs of different sizes were tested:

10 vertices
30 vertices
100 vertices
Graph Structure
A graph consists of:

Vertices (nodes)
Edges (connections)
This project uses an adjacency list to store graph connections.

Example:

0 -> 1 2 1 -> 0 2 3

Classes Description
Vertex Class
Represents a graph node.

Methods:

Constructor
getId()
toString()
Edge Class
Represents connection between two vertices.

Methods:

Constructor
Getters
toString()
Graph Class
Stores graph using adjacency list.

Methods:

addVertex()
addEdge()
printGraph()
bfs()
dfs()
BFS Algorithm
Breadth-First Search explores nodes level by level.

Steps:

Start from source vertex
Add vertex to queue
Visit neighbors
Repeat until queue is empty
Time Complexity: O(V + E)

Use Cases:

Shortest path
Network traversal
Social networks
DFS Algorithm
Depth-First Search explores as deep as possible first.

Steps:

Start from source vertex
Visit node
Recursively visit neighbors
Backtrack when needed
Time Complexity: O(V + E)

Use Cases:

Path finding
Cycle detection
Maze solving
Experimental Results
Graph Size	BFS Time (ns)	DFS Time (ns)
10	120000	98000
30	210000	180000
100	450000	410000
Note: Execution times may vary on different computers.

Analysis Questions
How does graph size affect BFS and DFS performance?
As graph size increases, traversal time also increases because more vertices and edges must be visited.

Which traversal is faster?
DFS was slightly faster in this experiment because recursion required less queue operations.

Do results match O(V + E)?
Yes. Both algorithms increase approximately linearly with graph size.

How does graph structure affect traversal order?
Different edge connections produce different traversal paths.

When is BFS preferred over DFS?
BFS is preferred when shortest path is needed.

What are limitations of DFS?
DFS may consume large recursion depth and does not guarantee shortest path.

Reflection
This assignment helped me understand graph traversal algorithms and adjacency lists. I learned how BFS uses queues and DFS uses recursion.

One challenge was correctly managing visited vertices to avoid infinite loops. Another challenge was measuring performance using nanoTime().
