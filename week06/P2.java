package week06;
// graph search
public class P2 {
    public static void main(String[] args) {
        // create a graph with 3 nodes/vertices
        MatrixGraph graph = new MatrixGraph(3);
        // set the labels for the nodes
        graph.setNodeLabel(0, "A");
        graph.setNodeLabel(1, "B");
        graph.setNodeLabel(2, "C");
        // create edges between the nodes
        graph.addEdge(0, 1); // A <-> B
        graph.addEdge(0, 2); // A <-> C
        graph.addEdge(1, 2); // B <-> C
        // this graph cannot be colored with 2 colors
        System.out.println("Graph can be colored with 2 colors: " + graph.isTwoColor());

        // create a graph with 4 nodes/vertices
        MatrixGraph graph2 = new MatrixGraph(4);
        // set the labels for the nodes
        graph2.setNodeLabel(0, "A");
        graph2.setNodeLabel(1, "B");
        graph2.setNodeLabel(2, "C");
        graph2.setNodeLabel(3, "D");
        // create edges between the nodes
        graph2.addEdge(0, 1); // A <-> B
        graph2.addEdge(1, 2); // B <-> C
        graph2.addEdge(2, 3); // C <-> D
        graph2.addEdge(3, 0); // D <-> A
        // this graph can be colored with 2 colors
        System.out.println("Graph can be colored with 2 colors: " + graph2.isTwoColor());

        // add an edge from A to C to make the graph not two-colorable
        graph2.addEdge(0, 2); // A <-> C
        System.out.println("Graph can be colored with 2 colors: " + graph2.isTwoColor());
    }

    static class MatrixGraph {
        static int RED = -1;
        static int WHITE = 1;
        static int NO_COLOR = 0;
        int[] colors;  // the color of the vertices

        // this matrix presents the connections in the graph
        int[][] matrix;

        // this array presents the labels of the vertices/nodes
        String[] nodeLabels;

        int size;

        // create a graph with the number of nodes/vertices
        public MatrixGraph(int nodes) {
            size = nodes;
            matrix = new int[size][size];
            // no connection/edge initiall
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = 0;
                }
            }
            nodeLabels = new String[size];
            colors = new int[size];
            // all vertices have no color initially
        }

        // set the label for a node
        public void setNodeLabel(int nodeIdx, String label) {
            nodeLabels[nodeIdx] = label;
        }

        // create an edge between two nodes
        public void addEdge(int node1, int node2) {
            matrix[node1][node2] = 1;
            // for undirected graph, node1 -> node2 also means node2 -> node1
            matrix[node2][node1] = 1;
        }

        // remove an edge between two nodes
        public void removeEdge(int node1, int node2) {
            matrix[node1][node2] = 0;
            // for undirected graph, node1 -> node2 also means node2 -> node1
            matrix[node2][node1] = 0;
        }

        // depth-first search/traversal
        public boolean isTwoColor() {
            // no need for visited states, as we have colors already

            // start the DFS recursively from node 0
            // assume start with RED color
            return DFSR(0, RED);

            // the above code assumes the graph is connected
            // that mean you can reach all nodes from any node
            // if the graph is not connected, you must call DFSR on every node
        }

        public boolean DFSR(int nodeIdx, int color) {
            colors[nodeIdx] = color;
            // apply the DFS process to all adjacent nodes
            for (int i = 0; i < size; i++) {
                if (matrix[nodeIdx][i] == 1) {  // check if nodeIdx is connected to i
                    // vertex i is not colored yet
                    if (colors[i] == NO_COLOR) {
                        // color i with the opposite color of nodeIdx
                        if (!DFSR(i, -color)) {
                            return false;
                        }
                    } else if (colors[i] == color) {
                        // vertex i is already colored with the same color as nodeIdx
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
