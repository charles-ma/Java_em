import java.util.Arrays;

public class InsertionSort {
    public static void main(String... args) {
	int[] array = {4, 3, 8, 3, 9, 0};
	sort(array);
	System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] a) {
	if (a == null || a.length <= 1) return;
	for (int i = 1; i < a.length; i++) {
	    int key = a[i];
	    for (int j = i - 1; j >= 0; j--) {
		if (a[j] > key) a[j + 1] = a[j];
		else {
		    a[j + 1] = key;
		    break;
		}
		if (j == 0) a[j] = key;
	    }
	}
    }
}