import java.util.Arrays;

public class BBSort {

    public static void main(String... args) {
	int[] a = {1, 5, 2, 8, 0};
	System.out.println(Arrays.toString(a));
	sort(a);
	System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
	int len = a.length;
	for (int i = 0; i < len - 1; i++) {
	    for (int j = 0; j < len - 1 - i; j++) {
		if (a[j] > a[j + 1]) {
		    int tmp = a[j];
		    a[j] = a[j + 1];
		    a[j + 1] = tmp;
		}
	    }
	}
    }
}