import java.util.*;

public class C1Q32 {
    public static void main(String... args) {
	String s = "dfhoeroefa";
	System.out.println(s);
	System.out.println(removeDup(s));
	System.out.println(removeDupLoop(s));
    }

    public static String removeDup(String s) {
	if (s == null || s.length() <= 1) return s;
	char[] a = s.toCharArray();
	int j = 0, base = 0;
	for (int i = 0; i < a.length; i++) {
	    char c = a[i];
	    int mask = 1 << Character.toLowerCase(c) - 97;
	    if ((mask & base) == 0) {
		a[j++] = c;
		base |= mask;
	    }
	}
	return new String(Arrays.copyOfRange(a, 0, j));
    }

    public static String removeDupLoop(String s) {
	if (s == null || s.length() <= 1) return s;
	char[] a = s.toCharArray();
	int j = 0;
	for (int i = 1; i < a.length; i++) {
	    int k = 0;
	    for (; k <= j; k++) {
		if (a[i] == a[k]) break;
	    }
	    if (k == j + 1) {
		a[k] = a[i];
		j++;
	    }
	}
	return new String(Arrays.copyOfRange(a, 0, j + 1));
    }
}