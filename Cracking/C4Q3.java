public class C4Q3 {
    public static void main(String... args) {
	int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
	BTree root = new BTree(0);
	createBTree(a, root);
	root.print();
    }

    public static void createBTree(int[] array, BTree root) {
	createBTree(array, 0, array.length - 1, root);
    }

    public static void createBTree(int[] array, int start, int end, BTree root) {
	if (array == null || start > end) return;
	int mid = (start + end) / 2;
	root.setValue(array[mid]);
	if (start <= mid - 1) {
	    root.setLeft(new BTree(0));
	    createBTree(array, start, mid - 1, root.getLeft());
	}
	if (mid + 1 <= end) {
	    root.setRight(new BTree(0));
	    createBTree(array, mid + 1, end, root.getRight());
	}
    }
}