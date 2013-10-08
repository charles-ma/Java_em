import java.util.*;

public class C4Q33 {
    public static void main(String... args) {
	Random r = new Random();
	int size = r.nextInt(15);
	int[] a = new int[size];
	for (int i = 0; i < size; i++) a[i] = r.nextInt(100);
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	BTree root = consTree(a);
	if (root != null) root.print();
    }
    
    public static BTree consTree(int[] a) {
	return consTree(a, 0, a.length);
    }

    public static BTree consTree(int[] a, int start, int end) {
	if (start >= end) return null;
	int mid = (start + end) / 2;
	BTree root = new BTree(a[mid]);
	root.setLeft(consTree(a, start, mid));
	root.setRight(consTree(a, mid + 1, end));
	return root;
    }
}