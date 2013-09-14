import java.util.*;

public class C9Q11 {
    public static void main(String... args) {
	Random r = new Random();
	int[] a = new int[10];
	int[] b = new int[5];
	for (int i = 0; i < 10; i++) {
	    a[i] = r.nextInt(10);
	    if (i < 5) b[i] = r.nextInt(10);
	}
	Arrays.sort(a);
	Arrays.sort(b);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	merge(a, b);
	System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] a, int[] b) {
	int length = a.length, i = length - b.length - 1, j = b.length - 1, k = length - 1;
	while (i >= 0 && j >= 0) {
	    if (a[i] > b[j]) a[k--] = a[i--];
	    else a[k--] = b[j--];
	}
	while (i >= 0) a[k--] = a[i--];
	while (j >= 0) a[k--] = b[j--];
    }
}