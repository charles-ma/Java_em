import java.util.*;

public class C9Q51 {
    public static void main(String... args) {
	String[] a = {"abc", "", "dge", "ert", "", "", "hyioet", "ko"};
	System.out.println(Arrays.toString(a));
	System.out.println(findElement(a, "hyioet"));
    }

    public static int findElement(String[] a, String s) {
	if (a == null || a.length == 0) return Integer.MIN_VALUE;
	return findElement(a, s, 0, a.length);
    }

    public static int findElement(String[] a, String s, int start, int end) {
	if (start >= end) return Integer.MIN_VALUE;
	int mid = (start + end) / 2;
	if (s.equals(a[mid])) return mid;
	while (mid < end && a[mid].equals("")) mid++;
	if (mid == end || a[mid].compareTo(s) > 0) return findElement(a, s, start, mid);
	return findElement(a, s, mid, end);
    }
}
