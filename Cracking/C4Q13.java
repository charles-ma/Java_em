public class C4Q13 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, true);
	root.print();
	BTree root1 = BTree.createInstance(10, false);
	root1.print();
	System.out.println(isBalanced(root));
	System.out.println(isBalanced(root1));
	System.out.println(isBalanced(root));
	System.out.println(isBalanced(root1));
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
}