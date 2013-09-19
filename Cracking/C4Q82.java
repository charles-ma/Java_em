import java.util.*;

public class C4Q82 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, true);
	root.print();
	printAllPaths(root, 12);
	System.out.println();
	printAllPaths1(root, 12);
    }

    public static void printAllPaths(BTree root, int sum) {
	printPath(root, sum, new LinkedList<Integer>());
	if (root.getLeft() != null) printAllPaths(root.getLeft(), sum);
	if (root.getRight() != null) printAllPaths(root.getRight(), sum);
    }

    public static void printPath(BTree root, int sum, LinkedList<Integer> values) {
	if (root == null) return;
	values.add(root.getValue());
	if (root.getValue() == sum) {
	    for (int i : values) System.out.printf("%2d", i);
	    System.out.println();
	} 
	printPath(root.getLeft(), sum - root.getValue(), values);
	printPath(root.getRight(), sum - root.getValue(), values);
	values.removeLast();
    }

    public static void printAllPaths1(BTree root, int sum) {
	printAllPaths1(root, sum, new LinkedList<Integer>());
    }
    
    public static void printAllPaths1(BTree root, int sum, LinkedList<Integer> values) {
	values.add(root.getValue());
	if (root.getRight() == null && root.getLeft() == null) {
	    for (int i = 0; i < values.size(); i++) {
		int s = 0;
		for (int j = i; j < values.size(); j++) {
		    s += values.get(j);
		    if (s == sum) {
			for (int k = i; k <= j; k++) System.out.printf("%2d", values.get(k));
			System.out.println();
		    }
		}
	    }
	    values.removeLast();
	    return;
	}
	if (root.getLeft() != null) printAllPaths1(root.getLeft(), sum, values);
	if (root.getRight() != null) printAllPaths1(root.getRight(), sum, values);
	values.removeLast();
    }

}