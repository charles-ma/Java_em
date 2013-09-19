import java.util.*;

public class C4Q42 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, true);
	root.print();
	LinkedList<LinkedList<Integer>> results = getLevels(root);
	for (LinkedList<Integer> r : results) {
	    for (int i : r) {
		System.out.printf("%2d", i);
	    }
	    System.out.println();
	}
    }

    public static LinkedList<LinkedList<Integer>> getLevels(BTree root) {
	LinkedList<LinkedList<Integer>> results = new LinkedList<LinkedList<Integer>>();
	for (int i = 1; i <= getDepth(root); i++) {
	    LinkedList<Integer> result = new LinkedList<Integer>();
	    getLevel(root, i, result);
	    results.add(result);
	}
	return results;
    }

    public static void getLevel(BTree root, int l, LinkedList<Integer> result) {
	if (root == null) return;
	if (l == 1) result.add(root.getValue());
	else {
	    getLevel(root.getLeft(), l - 1, result);
	    getLevel(root.getRight(), l - 1, result);
	}
    }
    
    public static int getDepth(BTree root) {
	if (root == null) return 0;
	return Math.max(getDepth(root.getLeft()), getDepth(root.getRight())) + 1;
    }
}