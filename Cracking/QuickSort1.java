import java.util.*;

public class QuickSort1 {
    public static void main(String... args) {
	Random r = new Random();
	int size = 10;
	int[] a = new int[size];
	for (int i = 0; i < size; i++) a[i] = r.nextInt(10);
	System.out.println(Arrays.toString(a));
	sort(a);
	System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
	if (a == null || a.length <= 1) return;
	sort(a, 0, a.length);
    }

    public static void sort(int[] a, int start, int end) {
	if (start >= end - 1) return;
	int p = getPivot(a, start, end);
	sort(a, start, p);
	sort(a, p + 1, end);
    }

    public static int getPivot(int[] a, int start, int end) {
	int p = a[start];
	int i = start;
	int j = end - 1;
	while (i < j) {
	    while (i < end && a[i] <= a[start]) i++;
	    while (j >= start && a[j] > a[start]) j--;
	    if (i < j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	    }
	}
	a[start] = a[j];
	a[j] = p;
	return j;
    }
}