import java.util.HashMap;
import java.util.LinkedList;

public class AdjacencyGraph {
    public static void main(String[] args) {

        Graph2 graph = new Graph2(true);
        Node a = new Node(0, "A");
        Node b = new Node(1, "B");
        Node c = new Node(2, "C");
        Node d = new Node(3, "D");
        Node e = new Node(4, "E");

        graph.addEdge(a, b);
        graph.addEdge(b, c);
        graph.addEdge(b, d);
        graph.addEdge(c, e);
        graph.addEdge(b, a);

        graph.printEdges();

        System.out.println(graph.hasEdge(a, b));
        System.out.println(graph.hasEdge(d, a));
    }
}

class Node {
    int n;
    String name;

    public Node(int n, String name) {
        this.n = n;
        this.name = name;
    }
}

class Graph2 {
    // Each node maps to a list of all his neighbors
    private HashMap<Node, LinkedList<Node>> adjacencyMap;
    private boolean directed;

    public Graph2(boolean directed) {
        this.adjacencyMap = new HashMap<>();
        this.directed = directed;
    }

    public void addEdgeHelper(Node a, Node b) {
        LinkedList<Node> tmp = adjacencyMap.get(a);

        if (tmp != null) {
            tmp.remove(b);
        } else {
            tmp = new LinkedList<>();
        }
        tmp.add(b);
        adjacencyMap.put(a, tmp);

    }

    public void addEdge(Node source, Node destination) {
        if (!adjacencyMap.keySet().contains(source)) {
            adjacencyMap.put(source, null);
        }
        if (!adjacencyMap.keySet().contains(destination)) {
            adjacencyMap.put(destination, null);
        }
        addEdgeHelper(source, destination);

        if (!directed) {
            addEdgeHelper(destination, source);
        }
    }

    public void printEdges() {
        for (Node node : adjacencyMap.keySet()) {
            System.out.print("The " + node.name + " has an edge towards: ");
            if (adjacencyMap.get(node) != null) {
                for (Node neighbor : adjacencyMap.get(node)) {
                    System.out.print(neighbor.name + " ");
                }
                System.out.println("");
            } else {
                System.out.println("None");
            }
        }
    }

    public boolean hasEdge(Node source, Node destination) {
        return adjacencyMap.containsKey(source) && adjacencyMap.get(source) != null
                && adjacencyMap.get(source).contains(destination);
    }
}
