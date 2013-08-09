import java.util.Arrays;
import java.util.Random;

public class MergeTest {

    public static void main(String... args) {
	Random ran = new Random();
	int[] a = new int[10];
	for (int i = 0; i < 10; i++) {
	    a[i] = ran.nextInt(100);
	}
	System.out.println(Arrays.toString(a));
	mergeSort1(a, 0, a.length - 1);
	System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] a) {
	if (a == null || a.length <= 1) return;
	int start = 0;
	int end = a.length - 1;
	int mid = (start + end) / 2 + 1;
	int[] firstH = new int[mid];
	int[] sencH = new int[end - mid + 1];
	for (int i = 0; i < mid; i++) {
	    firstH[i] = a[i];
	}
	for (int j = 0; j < end - mid + 1; j++) {
	    sencH[j] = a[j + mid];
	} 
	mergeSort(firstH);
	mergeSort(sencH);
	int[] result = merge(firstH, sencH);
	for (int k = 0; k <= end; k++) {
	    a[k] = result[k];
	}
    }

    public static int[] merge(int[] a, int[] b) {
	int len = a.length + b.length;
	int[] result = new int[len];
	int ai = 0;
	int bi = 0;
	int i = 0;
	while (ai < a.length && bi < b.length) {
	    if (a[ai] < b[bi]) result[i++] = a[ai++];
	    else result[i++] = b[bi++];
	}
	while (ai < a.length) {
	    result[i++] = a[ai++];
	}
	while (bi < b.length) {
	    result[i++] = b[bi++];
	}

	return result;
    }

    public static void mergeSort1(int[] a, int start, int end) {
	if (start >= end) return;
	int mid = (start + end) / 2;
	mergeSort1(a, start, mid);
	mergeSort1(a, mid + 1, end);
	merge1(a, start, end, mid);
    }

    public static void merge1(int[] a, int start, int end, int mid) {
	int len1 = mid - start + 2;
	int len2 = end - mid + 1;
	int[] firstH = new int[len1];
	int[] sencH = new int[len2];
	for (int i = 0; i < len1 - 1; i++) {
	    firstH[i] = a[start + i];
	}
	for (int j = 0; j < len2 - 1; j++) {
	    sencH[j] = a[j + mid + 1];
	}
	firstH[len1 - 1] = Integer.MAX_VALUE;
	sencH[len2 - 1] = Integer.MAX_VALUE;
	int m = 0, n = 0;
	for (int k = start; k < end + 1; k++) {
	    if (firstH[m] < sencH[n]) a[k] = firstH[m++];
	    else a[k] = sencH[n++];
	}
    }
}
