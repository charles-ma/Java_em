public class C4Q1 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, false);
	root.print();
	System.out.println(isBanlanced(root));

	BTree yetRoot = BTree.createInstance(10, true);
	yetRoot.print();
	System.out.println(isBanlanced(yetRoot));
    }

    public static boolean isBanlanced(BTree root) {
	return getDepth(root) - getMinDepth(root) <= 1;
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