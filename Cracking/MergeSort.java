import java.util.Arrays;

public class MergeSort {
    public static void main(String... args) {
	int[] array = {5, 3, 0, 2, 7};
	sort(array);
	System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] a) {
	if (a == null || a.length <= 1) return;
	sort(a, 0, a.length);
    }

    public static void sort(int[] a, int start, int end) {
	if (start >= end || start == end - 1) return;
	int mid = (start + end) / 2;
	sort(a, start, mid);
	sort(a, mid, end);
	merge(a, start, mid, end);
    }

    public static void merge(int[] a, int start, int mid, int end) {
	int[] first = new int[mid - start + 1];
	int[] second = new int[end - mid + 1];
	for (int i = 0; i < first.length - 1; i++) first[i] = a[start + i];
	for (int i = 0; i < second.length - 1; i++) second[i] = a[mid + i];
	first[first.length - 1] = Integer.MAX_VALUE;
	second[second.length - 1] = Integer.MAX_VALUE;
	int m = 0, n = 0;
	for (int k = start; k < end; k++) {
	    if (first[m] < second[n]) a[k] = first[m++];
	    else a[k] = second[n++];
	}
    }
    
}