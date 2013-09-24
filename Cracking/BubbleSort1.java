import java.util.*;

public class BubbleSort1 {
    public static void main(String... args) {
	Random r = new Random();
	int size = 10;
	int[] a = new int[size];
	for (int i = 0; i < size; i++) {
	    a[i] = r.nextInt(10);
	}
	System.out.println(Arrays.toString(a));
	sort(a);
	System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
	if (a == null || a.length <= 1) return;
	for (int i = 0; i < a.length - 1; i++) {
	    for (int j = 0; j < a.length - i - 1; j++) {
		if (a[j] > a[j + 1]) {
		    int tmp = a[j];
		    a[j] = a[j + 1];
		    a[j + 1] = tmp;
		}
	    }
	}
    }
}