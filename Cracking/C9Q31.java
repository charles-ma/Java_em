import java.util.*;

public class C9Q31 {
    public static void main(String... args) {
	Random r = new Random();
	int[] a = new int[10];
	for (int i = 0; i < 10; i++) {
	    a[i] = r.nextInt(10);
	}
	Arrays.sort(a);
	int time = r.nextInt(10);
	int[] b = new int[10];
	for (int i = 0; i < 10; i++) {
	    b[i] = a[(time + i) % 10];
	}
	System.out.println(Arrays.toString(b));
	System.out.println(findElement(b, 3));
    }

    public static int findElement(int[] a, int v) {
	if (a == null || a.length == 0) return Integer.MIN_VALUE;
	return findElement(a, v, 0, a.length);
    }

    public static int findElement(int[] a, int v, int start, int end) {
	if (start >= end) return Integer.MIN_VALUE;
	int mid = (start + end) / 2;
	if (a[mid] == v) return mid;
	if (a[mid] >= a[start]) {
	    if (v >= a[start] && v <= a[mid]) return findElement(a, v, start, mid);
	    return findElement(a, v, mid + 1, end);
	} else if (v >= a[mid] && v <= a[end - 1]) {
	    return findElement(a, v, mid + 1, end);
	} else {
	    return findElement(a, v, start, mid);
	}
    }
}
