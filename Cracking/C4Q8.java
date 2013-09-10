import java.util.LinkedList;

public class C4Q8 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(7, true);
	root.print();
	printAllPath(root, 7);
    }

    /**
     * The time complexity of this algo is O(nlgn)
     */
    public static void printAllPath(BTree root, int sum) {
	LinkedList<Integer> result = new LinkedList<Integer>();
	/*LinkedList<BTree> queue = new LinkedList<BTree>();
	queue.add(root);
	while (!queue.isEmpty()) {
	    BTree node = queue.remove();
	    printPath(node, sum, result);
	    result.clear();
	    if (node.getLeft() != null) queue.add(node.getLeft());
	    if (node.getRight() != null) queue.add(node.getRight());
	    }*/
	printPath(root, sum, result);
	if (root.getLeft() != null) printAllPath(root.getLeft(), sum);
	if (root.getRight() != null) printAllPath(root.getRight(), sum);
    }

    public static void printPath(BTree root, int sum, LinkedList<Integer> values) {
	if (root == null) return;
	int value = root.getValue();
	values.add(value);
	if (sum == value) {
	    for (int i : values) System.out.printf("%2d", i);
	    System.out.println();
	}
	printPath(root.getLeft(), sum - value, values);
	printPath(root.getRight(), sum - value, values);
	values.removeLast();
    }
}