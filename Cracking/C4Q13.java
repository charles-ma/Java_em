import java.util.*;

public class C4Q13 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, true);
	root.print();
	BTree root1 = BTree.createInstance(10, false);
	root1.print();
	System.out.println(isBalanced(root));
	System.out.println(isBalanced(root1));
	System.out.println(isBalanced1(root));
	System.out.println(isBalanced1(root1));
	System.out.println(isBalanced2(root));
	System.out.println(isBalanced2(root1));
    }
    
    public static boolean isBalanced(BTree root) {
	return (getDepth(root) - getShallow(root)) < 2;
    }

    public static int getDepth(BTree root) {
	if (root == null) return 0;
	return Math.max(getDepth(root.getLeft()), getDepth(root.getRight())) + 1;
    }

    public static int getShallow(BTree root) {
	if (root == null) return 0;
	return Math.min(getShallow(root.getLeft()), getShallow(root.getRight())) + 1;
    }

    public static boolean isBalanced1(BTree root) {
	int[] result = getDS(root);
	return result[0] - result[1] < 2;
    }

    /**
     * This approach will traverse the tree only once
     */
    public static int[] getDS(BTree root) {
	int[] result = new int[2];
	if (root == null) {
	    result[0] = 0;
	    result[1] = 0;
	} else {
	    int[] left = getDS(root.getLeft());
	    int[] right = getDS(root.getRight());
	    result[0] = Math.max(left[0], right[0]) + 1;
	    result[1] = Math.min(left[1], right[1]) + 1;
	}
	return result;
    }

    public static boolean isBalanced2(BTree root) {
	Queue<TreeWrapper> q = new LinkedList<TreeWrapper>();
	if (root == null) return true;
	q.add(new TreeWrapper(root, 0));
	int min = Integer.MAX_VALUE, max = 0;
	while (q.size() != 0) {
	    TreeWrapper tr = q.remove();
	    BTree t = tr.tree;
	    if (t.getLeft() == null && t.getRight() == null) {
		min = Math.min(min, tr.depth);
		max = Math.max(max, tr.depth);
	    } else {
		if (t.getLeft() != null) q.add(new TreeWrapper(t.getLeft(), tr.depth + 1));
		if (t.getRight() != null) q.add(new TreeWrapper(t.getRight(), tr.depth + 1));
	    }
	}
	return max - min < 2;
    }
}

class TreeWrapper {
	public BTree tree;
	public int depth = 0;
	
	public TreeWrapper(BTree tree, int depth) {
	    this.tree = tree;
	    this.depth = depth;
	}
}