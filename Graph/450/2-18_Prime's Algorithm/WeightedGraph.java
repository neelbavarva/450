public class WeightedGraph {
    private class Node {
        private String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }

    }

    private class Edge {
        private Node from;
        private Node to;
        private int weight;

        public Edge(Node from, Node to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return from + " -> " + to;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Edge>> edges = new HashMap<>();

    public WeightedGraph getMinimumSpanningTree() {
        var tree = new WeightedGraph();

        PriorityQueue<Edge> edgesPQ = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        var startNode = nodes.values().iterator().next();
        edgesPQ.addAll(edges.get(startNode));
        tree.addNode(startNode.label);

        while (tree.nodes.size() < nodes.size()) {
            var minEdge = edgesPQ.remove();
            var nextNode = minEdge.to;

            if (tree.nodes.containsKey(nextNode.label)) {
                continue;
            }

            tree.addNode(nextNode.label);
            tree.addEdge(minEdge.from.label, nextNode.label, minEdge.weight);

            for (var edge : edges.get(nextNode)) {
                if (!tree.nodes.containsKey(edge.to.label)) {
                    edgesPQ.add(edge);
                }
            }
        }

        return tree;
    }
}
