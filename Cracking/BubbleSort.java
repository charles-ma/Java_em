import java.util.Arrays;

public class BubbleSort {
    public static void main(String... args) {
	int[] array = {3, 1, 7, 4, 6};
	sort(array);
	System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] a) {
	if (a == null || a.length <= 1) return;
	for (int i = 0; i < a.length - 1; i++) {
	    for (int j = 0; j < a.length - 1 - i; j++) {
		if (a[j] > a[j + 1]) {
		    int tmp = a[j + 1];
		    a[j + 1] = a[j];
		    a[j] = tmp;
		}
	    }
	}
    }
}