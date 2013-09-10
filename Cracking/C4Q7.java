public class C4Q7 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(7, true);
	root.print();
	BTree subTree = root.getLeft().getRight();
	subTree.print();
	BTree subTree1 = BTree.createInstance(3, true);
	subTree1.print();
	System.out.println(isSubTree(root, subTree));
	System.out.println(isSubTree(root, subTree1));
    }

    public static boolean isSubTree(BTree root, BTree sub) {
	if (root == null && sub != null) return false;
	if (isEqual(root, sub)) return true;
	return isSubTree(root.getLeft(), sub) || isSubTree(root.getRight(), sub);
    }

    public static boolean isEqual(BTree tree1, BTree tree2) {
	if (tree1 == null && tree2 == null) return true;
	if (tree1 == null && tree2 != null) return false;
	if (tree1 != null && tree2 == null) return false;
	if (tree1.getValue() != tree2.getValue()) return false;
	return isEqual(tree1.getLeft(), tree2.getLeft()) || isEqual(tree1.getRight(), tree2.getLeft());
    }

}