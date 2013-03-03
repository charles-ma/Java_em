import java.util.Arrays;
import java.util.Random;

/**
 *This is a bunch of sorting problems using different algo
 */
public class Sort {
    public static void main(String[] args) {
	Random ran = new Random();
	int length = ran.nextInt(11);
	int[] a = new int[length];
	for(int i = 0; i < length; i++) {
	    a[i] = ran.nextInt(100);
	}
	System.out.println(Arrays.toString(a));
	bubbleSort(a);
	System.out.println(Arrays.toString(a));
    }

    public static void insertionSort(int[] a) {
	for(int i = 1; i < a.length; i++) {
	    int key = a[i];
	    for(int j = i - 1; j >= 0; j--) {
		if(a[j] > key) {
		    a[j + 1] = a[j];
		    if(j == 0) a[j] = key;
		} else {
		    a[j + 1] = key;
		    break;
		}
	    }
	}
    }

    public static void insertionSortWhile(int[] a) {
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

    public static void bubbleSort(int[] a) {
	for(int i = a.length - 2; i >= 0; i--) {
	    for(int j = 0; j <= i; j++) {
		if(a[j] > a[j + 1]) {
		    int tmp = a[j];
		    a[j] = a[j + 1];
		    a[j + 1] = tmp;
		}
	    }
	}
    }
}