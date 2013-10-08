import java.util.*;

public class GraphSample {
    private ArrayList<GraphNode> nodes = null;
    
    public static void main(String... args) {
	GraphSample gs = new GraphSample();
	gs.printNodes();
    }

    public GraphSample() {
	nodes = new ArrayList<GraphNode>(6);
	for (int i = 0; i < 6; i++) nodes.add(new GraphNode(i));
	nodes.get(0).addNexts(nodes.get(1), nodes.get(2), nodes.get(4));
	nodes.get(1).addNexts(nodes.get(3));
	nodes.get(3).addNexts(nodes.get(2), nodes.get(0));
	nodes.get(2).addNexts(nodes.get(4));
    }
    
    public List<GraphNode> getNodes() {
	return nodes;
    }

    public void printNodes() {
	for (GraphNode node : nodes) node.printNode();
    }
}

class GraphNode {
    private ArrayList<GraphNode> nexts = null;
    private int id = 0;

    public GraphNode(int id) {
	this.id = id;
	nexts = new ArrayList<GraphNode>();
    }
    
    public void addNexts(GraphNode... nodes) {
	for (GraphNode node : nodes) nexts.add(node);
    }

    public List<GraphNode> getNexts() {
	return nexts;
    }

    public int getId() {
	return id;
    }

    public void printNode() {
	System.out.println("Node " + id);
	for (GraphNode next : nexts) System.out.printf("%2d", next.getId());
	System.out.println();
    }
}