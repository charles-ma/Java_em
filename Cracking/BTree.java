import java.util.*;

public class BTree {
    private int value = 0;
    private BTree right = null;
    private BTree left = null;

    public BTree(int value) {
	this.value = value;
    }

    public void setRight(BTree right) {
	this.right = right;
    }
    
    public void setLeft(BTree left) {
	this.left = left;
    }

    public BTree getRight() {
	return right;
    }

    public BTree getLeft() {
	return left;
    }

    public void setValue(int value) {
	this.value = value;
    }

    public int getValue() {
	return value;
    }

    public static BTree createInstance(int size) {
	BTree root = new BTree(0);
	createInstance(root, size - 1);
	return root;
    }
    
    public static void createInstance(BTree root, int size) {
	if (size <= 0) return;
	if (root.getLeft() == null) {
	    root.setLeft(new BTree(size));
	    createInstance(root, size - 1);
	} else if (root.getRight() == null) {
	    root.setRight(new BTree(size));
	    createInstance(root.getLeft(), (size - 1) / 2);
	    createInstance(root.getRight(), size - 1 - (size - 1) / 2);
	}
    }

    public static int getDepth(BTree root) {
	if (root == null) return 0;
	return Math.max(getDepth(root.getLeft()), getDepth(root.getRight())) + 1;
    }

    public void printPre() {
	
    }

    public void print() {
	for (int i = 1; i <= getDepth(this); i++) {
	    printl(this, i, (int) Math.pow(2, getDepth(this) - 1) * 3 / 2);
	    System.out.println();
	}
    }

    public void printl(BTree root, int level, int width) {
	if (level == 1) {
	    for (int i = 0; i < width; i++) System.out.print(" ");
	    System.out.printf("%3d", root == null ? 0 : root.getValue());
	} else {
	    printl(root == null ? null : root.getLeft(), level - 1, 2 * width / 3);
	    for (int i = 0; i < width; i++) {
		System.out.print(" ");
	    }
	    printl(root == null ? null : root.getRight(), level - 1, 2 * width / 3);
	}
    }
}
