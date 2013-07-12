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

/**
 * Implements a comparator<String>
 */
class AnaComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
	return sortString(s1).compareTo(sortString(s2));
    }

    public String sortString(String s) {
	char[] chars = s.toCharArray();
	Arrays.sort(chars);
	return new String(chars);
    }
}
