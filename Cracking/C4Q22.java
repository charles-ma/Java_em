import java.util.*;

public class C4Q22 {
    public static void main(String... args) {
	GraphSample gs = new GraphSample();
	List<GraphNode> nodes = gs.getNodes();
	System.out.println(isConnected(nodes.get(0), nodes.get(2)));
	System.out.println(isConnected(nodes.get(3), nodes.get(1)));
    }

    public static boolean isConnected(GraphNode n1, GraphNode n2) {
	Set<GraphNode> visited = new HashSet<GraphNode>();
	return isConnectedIte(n1, n2, visited);
    }
    
    public static boolean isConnected(GraphNode n1, GraphNode n2, Set<GraphNode> visited) {
	visited.add(n1);
	if (n1 == n2) return true;
	List<GraphNode> nexts = n1.getNexts();
	for (GraphNode next : nexts) {
	    if (!visited.contains(next) && isConnected(next, n2, visited)) return true;
	}
	return false;
    }

    public static boolean isConnectedIte(GraphNode n1, GraphNode n2, Set<GraphNode> visited) {
	LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
	queue.push(n1);
	while (!queue.isEmpty()) {
	    GraphNode n = queue.removeLast();
	    if (n == n2) return true;
	    visited.add(n);
	    for (GraphNode next : n.getNexts()) {
		if (!visited.contains(next)) queue.push(next);
	    }
	}
	return false;
    }
}