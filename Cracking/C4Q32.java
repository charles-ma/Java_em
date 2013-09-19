public class C4Q32 {
    public static void main(String... args) {
	int[] a = {1, 3, 5, 8, 10, 16};
	BTree root = createTree(a);
	root.print();
    }

    public static BTree createTree(int[] a) {
	if (a == null || a.length == 0) return null;
	return createTree(a, 0, a.length);
    }

    public static BTree createTree(int[] a, int start, int end) {
	if (start >= end) return null;
	int mid = (start + end) / 2;
	BTree root = new BTree(a[mid]);
	root.setLeft(createTree(a, start, mid));
	root.setRight(createTree(a, mid + 1, end));
	return root;
    }
}