import java.util.*;

public class SelectionSort1 {
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
	for (int i = 0; i < a.length - 1; i++) {
	    int min = Integer.MAX_VALUE;
	    int index = -1;
	    for (int j = i; j < a.length; j++) {
		if (a[j] < min) {
		    min = a[j];
		    index = j;
		}
	    }
	    int tmp = a[i];
	    a[i] = min;
	    a[index] = tmp;
	}
    }
}