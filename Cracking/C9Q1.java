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
     * Merge method using while loop
     */
    public static void merge1(int[] a, int[] b) {
	int k = a.length - 1;
	int m = 4;
	int n = b.length - 1;
	while(m >= 0 && n >= 0) {
	    if(a[m] > b[n]) {
		a[k--] = a[m--]; 
	    } else {
		a[k--] = b[n--];
	    }
	}
	while(n >= 0) {
	    a[k--] = b[n--];
	}
    }
}