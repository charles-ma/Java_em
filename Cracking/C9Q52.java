import java.util.*;

public class C9Q52 {
    public static void main(String... args) {
	String[] a = {"ab", "", "", "ewo", "fde", "", "ghe"};
	System.out.println(Arrays.toString(a));
	System.out.println(find("ghe", a));
    }
    
    public static int find(String s, String[] a) {
	return find(s, a, 0, a.length);
    }
    
    public static int find(String s, String[] a, int start, int end) {
	if (start >= end) return -1;
	int mid = (start + end) / 2;
	while (mid < end && a[mid].equals("")) mid++;
	if (a[mid].equals(s)) return mid;
	if (mid == end) return find(s, a, start, (start + end) / 2);
	if (a[mid].compareTo(s) < 0) return find(s, a, mid + 1, end);
	else return find(s, a, start, mid);
    }
}