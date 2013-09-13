import java.util.Arrays;

public class SelectionSort {
    public static void main(String... args) {
	int[] array = {3, 1, 5, 9, 0};
	sort(array);
	System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] a) {
	if (a == null || a.length <= 1) return;
	for (int i = 0; i < a.length - 1; i++) {
	    int index = smallest(a, i, a.length);
	    int tmp = a[index];
	    a[index] = a[i];
	    a[i] = tmp;
	}
    }

    public static int smallest(int[] a, int start, int end) {
	if (start > end) return Integer.MIN_VALUE;
	int index = start;
	int min = a[start];
	for (int i = start; i < end; i++) {
	    if (a[i] < min) {
		min = a[i];
		index = i;
	    }
	}
	return index;
    }
}