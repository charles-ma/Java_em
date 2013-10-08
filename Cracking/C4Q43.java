import java.util.*;

public class C4Q43 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, true);
	root.print();
	Random r = new Random();
	int i = r.nextInt(BTree.getDepth(root));
	System.out.println(i);
	printLevel(root, i);
	System.out.println();
	printAll(root);
    }

    public static void printLevel(BTree root, int level) {
	if (root == null) return;
	if (level == 0) System.out.printf("%3d", root.getValue());
	else {
	    printLevel(root.getLeft(), level - 1);
	    printLevel(root.getRight(), level - 1);
	}
    }

    public static void printAll(BTree root) {
	LinkedList<BTree> level = new LinkedList<BTree>();
	LinkedList<BTree> q = new LinkedList<BTree>();
	q.add(root);
	q.add(new BTree(Integer.MIN_VALUE));
	while (q.size() != 0) {
	    BTree n = q.remove();
	    if (n.getValue() == Integer.MIN_VALUE) {
		for (BTree t : level) System.out.printf("%3d", t.getValue());
		System.out.println();
		level.clear();
		if (q.size() != 0) q.add(n);
	    } else {
		if (n.getLeft() != null) q.add(n.getLeft());
		if (n.getRight() != null) q.add(n.getRight());
		level.add(n);
	    }
	}
    }
}