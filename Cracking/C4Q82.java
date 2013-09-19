import java.util.*;

public class C4Q82 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, true);
	root.print();
	printAllPaths(root, 12);
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
    
}