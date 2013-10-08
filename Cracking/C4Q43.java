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
    }

    public static void printLevel(BTree root, int level) {
	if (root == null) return;
	if (level == 0) System.out.printf("%3d", root.getValue());
	else {
	    printLevel(root.getLeft(), level - 1);
	    printLevel(root.getRight(), level - 1);
	}
    }
}