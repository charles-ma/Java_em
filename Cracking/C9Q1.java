import java.util.*;

class C9Q1 {
    public static void main(String[] args) {
	int[] a = {2, 4, 5, 7, 8, 0, 0, 0, 0, 0};
	int[] b = {0, 1, 3, 6, 9};
	merge1(a, b);
	System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] a, int[] b) {
	int m = 4; 
	int n = b.length - 1;
	for(int i = a.length - 1; i >= 0; i--) {
	    if(m == -1) {
		a[i] = b[n];
		n--;
	    } else if(n == -1) {
		a[i] = a[m];
		m--;
	    } else if(a[m] > b[n]) {
		a[i] = a[m];
		m--;
	    } else {
		a[i] = b[n];
		n--;
	    }
	}
    }

    /**
     * This method is simple, can be used in merge sort without using the sentinel card
     */
    public static void merge1(int[] a, int[] b) {
	int i = 4;
	int j = b.length - 1;
	int k = a.length - 1;

	while(i >= 0 && j >= 0) {
	    if(a[i] > b[j]) {
		a[k--] = a[i--];
	    } else {
		a[k--] = b[j--];
	    }
	}

	while(j >= 0) {
	    a[k--] = b[j--];
	}
    }
}