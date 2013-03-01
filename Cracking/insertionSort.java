import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
	int[] a = {1, 5, 6, 2, 3, 8, 2};
	int[] b = {2, 5, 1, 6, 3, 9, 0};
	System.out.println(Arrays.toString(a));
	sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	sortWhile(b);
	System.out.println(Arrays.toString(b));
    }

    public static void sort(int[] a) {
	if(a.length == 0 || a.length == 1) return;
	for(int i = 1; i < a.length; i++) {
	    int key = a[i];
	    for(int j = i - 1; j >= 0; j--) {
		if(a[j] > key) a[j + 1] = a[j];
		else {
		    a[j + 1] = key;
		    break;
		}
	    }
	}
    }

    public static void sortWhile(int[] a) {
	if(a.length == 0 || a.length == 1) return;
	for(int i = 1; i < a.length; i++) {
	    int key = a[i];
	    int j = i - 1;
	    while(j >= 0 && a[j] > key) {
		a[j + 1] = a[j];
		j--;
	    }
	    a[j + 1] = key;
	}
    }
}