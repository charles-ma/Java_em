public class C4Q62 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, true);
	BTree m = root.getLeft().getLeft();
	BTree n = root.getLeft().getRight().getLeft();
	BTree com = commonAncestor(root, m, n);
	root.print();
	m.print();
	n.print();
	com.print();
    }

    public static BTree commonAncestor(BTree root, BTree m, BTree n) {
	if (root == null || m == null || n == null) return null;
	if (contains(root.getLeft(), m) && contains(root.getLeft(), n)) return commonAncestor(root.getLeft(), m, n);
	if (contains(root.getRight(), m) && contains(root.getRight(), n))  return commonAncestor(root.getRight(), m, n);
	return root;
    }

    public static boolean contains(BTree root, BTree n) {
	if (root == n) return true;
	if (root == null) return false;
	return contains(root.getLeft(), n) || contains(root.getRight(), n);
    }
    
}