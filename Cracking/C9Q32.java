import java.util.*;

public class C9Q32 {
    public static void main(String... args) {
	int size = 10;
	int[] a = new int[size];
	for (int i = 0; i < size; i++) a[i] = i;
	Random r = new Random();
	int rTime = r.nextInt(size);
	int[] tmp = new int[rTime];
	for (int i = 0; i < rTime; i++) tmp[i] = a[i];
	for (int i = rTime; i < a.length; i++) a[i - rTime] = a[i];
	for (int i = 0; i < rTime; i++) a[i + a.length - rTime] = tmp[i];
	System.out.println(Arrays.toString(a));
	int n = r.nextInt(size + 10);
	System.out.println(n);
	System.out.println(find(n, a));
    }
    
    public static int find(int n, int[] a) {
	return find(n, a, 0, a.length);
    }

    public static int find(int n, int[] a, int start, int end) {
	if (start >= end) return -1;
	int mid = (start + end) / 2;
	if (a[mid] == n) return mid;
	if (a[mid] >= a[start]) {
	    if (n <= a[mid] && n >= a[start]) return find(n, a, start, mid);
	    return find(n, a, mid + 1, end);
	} else {
	    if (n >= a[mid] && n <= a[end - 1]) return find(n, a, mid + 1, end);
	    return find(n, a, start, mid);
	}
    }
}