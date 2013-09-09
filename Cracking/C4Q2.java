import java.util.*;

public class C4Q2 {
    public static void main(String... args) {
	GraphSample gs = new GraphSample();
	List<GraphNode> nodes = gs.getNodes();
	System.out.println(isConnected(nodes.get(1), nodes.get(3)));
	System.out.println(isConnectedW(nodes.get(3), nodes.get(0)));
    }

    public static boolean isConnected(GraphNode start, GraphNode end) {
	List<GraphNode> visited = new ArrayList<GraphNode>();
	return isConnected(start, end, visited);
    }

    /**
     * Depth first
     */
    public static boolean isConnected(GraphNode start, GraphNode end, List<GraphNode> visited) {
	if (visited.contains(start)) return false;
	if (start == end) return true;
	for (GraphNode node : start.getNexts()) {
	    if (isConnected(node, end, visited)) return true;
	}
	return false;
    }

    public static boolean isConnectedW(GraphNode start, GraphNode end) {
	ArrayList<GraphNode> visited = new ArrayList<GraphNode>();
	return isConnectedW(start, end, visited);
    }

    /**
     * Width first
     */
    public static boolean isConnectedW(GraphNode start, GraphNode end, List<GraphNode> visited) {
	LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
	queue.add(start);
	while (queue.size() != 0) {
	    GraphNode node = queue.remove();
	    visited.add(node);
	    if (node == end) return true;
	    for (GraphNode subNode : node.getNexts()) {
		if (!visited.contains(subNode)) queue.add(subNode);
	    }
	}
	return false;
    }
}