import java.util.Arrays;

public class QuickSort {
    public static void main(String... args) {
	int[] array = {5, 3, 0, 8, 9, 1};
	sort(array);
	System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] a) {
	if (a == null || a.length <= 1) return;
	sort(a, 0, a.length);
    }

    public static void sort(int[] a, int start, int end) {
	if (start >= end || end == start + 1) return;
	int p = getPivot(a, start, end);
	sort(a, start, p);
	sort(a, p + 1, end);
    }

    public static int getPivot(int[] a, int start, int end) {
	int p = a[start];
	int i = start + 1, j = end - 1;
	while (i < j) {
	    while (i < end - 1 && a[i] < p) i++;
	    while (j > start && a[j] >= p) j--;
	    if (i < j) {
		int tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;
	    }
	}
	a[start] = a[j];
	a[j] = p;
	return j;
    }
}