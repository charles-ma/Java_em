public class C4Q63 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(10, true);
	root.print();
	BTree n1 = root.getRight().getLeft();
	BTree n2 = root.getRight().getRight().getLeft();
	System.out.println(commonAnce(root, n1, n2).getValue());
    }

    public static BTree commonAnce(BTree root, BTree n1, BTree n2) {
	if (contains(root.getRight(), n1) && contains(root.getRight(), n2)) return commonAnce(root.getRight(), n1, n2);
	if (contains(root.getLeft(), n1) && contains(root.getLeft(), n2)) return commonAnce(root.getLeft(), n1, n2);
	return root;
    }
    
    public static boolean contains(BTree root, BTree tree) {
	if (root == null) return false;
	if (root == tree) return true;
	return contains(root.getRight(), tree) || contains(root.getLeft(), tree);
    }
}