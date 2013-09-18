public class C4Q12 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, true);
	root.print();
	System.out.println(isBalanced(root));
	BTree yetRoot = BTree.createInstance(10, false);
	yetRoot.print();
	System.out.println(isBalanced(yetRoot));
    }

    public static boolean isBalanced(BTree root) {
	return Math.abs(getDepth(root) - getMinDepth(root)) <= 1;
    }

    public static int getDepth(BTree root) {
	if (root == null) return 0;
	return Math.max(getDepth(root.getLeft()), getDepth(root.getRight())) + 1;
    }

    public static int getMinDepth(BTree root) {
	if (root == null) return 0;
	return Math.min(getMinDepth(root.getLeft()), getMinDepth(root.getRight())) + 1;
    }
}