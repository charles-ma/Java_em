import java.util.*;

public class C4Q71 {
    public static void main(String... args) {
	Random r = new Random();
	int size = r.nextInt(10);
	int size1 = r.nextInt(10);
	BTree root = BTree.createInstance(size, true);
	BTree root1 = BTree.createInstance(size1, true);
	root.print();
	root1.print();
	System.out.println(isEqual(root, root1));
    }

    public static boolean isEqual(BTree root, BTree root1) {
	if (root == null || root1 == null) return root == root1;
	if (root.getValue() != root1.getValue()) return false;
	return isEqual(root.getRight(), root1.getRight()) && isEqual(root.getLeft(), root1.getLeft());
    }
}