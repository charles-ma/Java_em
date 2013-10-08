import java.util.*;

public class C4Q23 {
    public static void main(String... args) {
	GraphSample gs = new GraphSample();
	Random r = new Random();
	int index1 = r.nextInt(5);
	int index2 = r.nextInt(5);
	List<GraphNode> l = gs.getNodes();
	System.out.println("node " + index1 + " and node " + index2 + ": " + isConnectedBase(l.get(index1), l.get(index2)));
    }

    public static boolean isConnected(GraphNode n1, GraphNode n2) {
	return isConnectedBase(n1, n2) || isConnectedBase(n2, n1);
    }

    public static boolean isConnectedBase(GraphNode n1, GraphNode n2) {
	if (n1 == n2) return true;
	for (GraphNode n : n1.getNexts()) {
	    if (isConnectedBase(n, n2)) return true;
	}
	return false;
    }
}