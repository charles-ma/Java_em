import java.util.*;

public class C9Q12 {
    public static void main(String... args) {
	int[] a = {3, 5, 9, 10, 20, 25, 0, 0, 0, 0};
	int[] b = {2, 5, 10, 16};
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	merge(a, b);
	System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] a, int[] b) {
	int i = 5, j = 3, k = a.length - 1;
	while (i >= 0 && j >= 0) {
	    if (a[i] > b[j]) a[k--] = a[i--];
	    else a[k--] = b[j--];
	}
	while (j >= 0) a[k--] = b[j--];
    }
}