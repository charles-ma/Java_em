import java.util.*;

public class C4Q83 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, true);
	root.print();
	printPaths(root, 12);
    }

    public static void printPaths(BTree root, int sum) {
	printPaths(root, sum, new LinkedList<BTree>());
    }

    public static void printPaths(BTree root, int sum, LinkedList<BTree> path) {
	path.push(root);
	if (root.getRight() == null && root.getLeft() == null) printPath(path, sum);
	if (root.getLeft() != null) printPaths(root.getLeft(), sum, path);
	if (root.getRight() != null) printPaths(root.getRight(), sum, path);
	path.pop();
    }

    public static void printPath(LinkedList<BTree> path, int sum) {
	for (int i = 0; i < path.size(); i++) {
	    int s = 0;
	    for (int j = i; j < path.size(); j++) {
		s += path.get(j).getValue();
		if (s == sum) {
		    for (int k = i; k <= j; k++) {
			System.out.printf("%3d", path.get(k).getValue());
		    }
		    System.out.println();
		}
	    }
	}
    }
}