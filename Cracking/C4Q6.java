public class C4Q6 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(7, true);
	root.print();
	BTree node1 = root.getLeft().getLeft();
	node1.print();
	BTree node2 = root.getLeft().getRight();
	node2.print();
	BTree result = commonAncestor(root, node1, node2);
	result.print();
    }

    public static BTree commonAncestor(BTree root, BTree node1, BTree node2) {
	if (!containsNode(root, node1) || !containsNode(root, node2)) return null;
	if (containsNode(root.getRight(), node1) && containsNode(root.getRight(), node2)) return commonAncestor(root.getRight(), node1, node2);
	if (containsNode(root.getLeft(), node1) && containsNode(root.getLeft(), node2)) return commonAncestor(root.getLeft(), node1, node2);
	return root;
    }

    public static boolean containsNode(BTree root, BTree node) {
	if (root == null) return false;
	if (root == node) return true;
	return containsNode(root.getRight(), node) || containsNode(root.getLeft(), node);
    }
    
}