import java.util.*;

public class C4Q23 {
    public static void main(String... args) {
	GraphSample gs = new GraphSample();
	Random r = new Random();
	int index1 = r.nextInt(6);
	int index2 = r.nextInt(6);
	List<GraphNode> l = gs.getNodes();
	System.out.println("node " + index1 + " and node " + index2 + ": " + isConnectedBase(l.get(index1), l.get(index2), new LinkedList<GraphNode>()));
    }

    public static boolean isConnected(GraphNode n1, GraphNode n2) {
	return isConnectedBase(n1, n2, new LinkedList<GraphNode>()) || isConnectedBase(n2, n1, new LinkedList<GraphNode>());
    }

    public static boolean isConnectedBase(GraphNode n1, GraphNode n2, List<GraphNode> visited) {
	if (visited.contains(n1)) return false;
	if (n1 == n2) return true;
	visited.add(n1);
	for (GraphNode n : n1.getNexts()) {
	    if (isConnectedBase(n, n2, visited)) return true;
	}
	return false;
    }
}