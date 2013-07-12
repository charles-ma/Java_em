import java.util.Arrays;
import java.util.Random;

/**
 * This is a bunch of sorting problems using different algo
 */
public class Sort {

    /**
     * Main method will generate random arrays and sort them with sorting algo to be tested
     */
    public static void main(String[] args) {
	Random ran = new Random();
	int length = ran.nextInt(11);
	int[] a = new int[length];
	for(int i = 0; i < length; i++) {
	    a[i] = ran.nextInt(100);
	}
	System.out.println(Arrays.toString(a));
	mergeSort(a, 0, a.length - 1);
	System.out.println(Arrays.toString(a));
    }

    /**
     * Insertion sort
     */
    public static void insertionSort(int[] a) {
	for(int i = 1; i < a.length; i++) {
	    int key = a[i];
	    for(int j = i - 1; j >= 0; j--) {
		if(key < a[j]) {
		    a[j + 1] = a[j];
		    if(j == 0) a[j] = key;
		} else {
		    a[j + 1] = key;
		    break;
		}
	    }
	}

    }

    /**
     * Insertion sort with a while loop
     */
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

    /**
     * Bubble sort
     */
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

    /**
     * Merge Sort
     */
    public static void mergeSort(int[] a, int start, int end) {
	if(start >= end) return;
	int mid = (start + end) / 2;
	mergeSort(a, start, mid);
	mergeSort(a, mid + 1, end);
	int[] first = new int[mid - start + 2];
	int[] second = new int[end - mid + 1];
	for(int i = 0; i < mid - start + 1; i++) {
	    first[i] = a[i + start];
	}
	first[mid - start + 1] = Integer.MAX_VALUE;
	for(int i = 0; i < end - mid; i++) {
	    second[i] = a[i + mid + 1];
	}
	second[end - mid] = Integer.MAX_VALUE;
	int j = 0, k = 0;
	for(int i = start; i <= end; i++) {
	    if(first[j] < second[k]) {
		a[i] = first[j];
		j++;
	    } else {
		a[i] = second[k];
		k++;
	    }
	}
    }
}