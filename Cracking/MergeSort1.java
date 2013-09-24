import java.util.*;

public class MergeSort1 {
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
	int mid = (start + end) / 2;
	sort(a, start, mid);
	sort(a, mid, end);
	merge(a, start, mid, end);
    }

    public static void merge(int[] a, int start, int mid, int end) {
	int[] f = new int[mid - start + 1];
	int[] s = new int[end - mid + 1];
	for (int i = start; i < mid; i++) f[i - start] = a[i];
	for (int i = mid; i < end; i++) s[i - mid] = a[i];
	f[f.length - 1] = Integer.MAX_VALUE;
	s[s.length - 1] = Integer.MAX_VALUE;
	int i = 0, j = 0;
	for (int k = start; k < end; k++) {
	    if (f[i] < s[j]) a[k] = f[i++];
	    else a[k] = s[j++];
	}
    }
}