import java.util.*;

class C9Q2 {
    public static void main(String[] args) {
	String[] a = {"abx", "abd", "bax", "bad", "n"};
	anaSort(a);
	System.out.println(Arrays.toString(a));
    }

    public static void anaSort(String[] a) {
	Arrays.sort(a, new AnaComparator());
    }
}

class AnaComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
	return toSortedString(s1).compareTo(toSortedString(s2));
    }

    public String toSortedString(String s) {
	char[] a = s.toCharArray();
	Arrays.sort(a);
	return new String(a);
    }
}