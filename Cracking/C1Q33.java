import java.util.*;

public class C1Q33 {
    public static void main(String... args) {
	String s = "dshfoedf";
	System.out.println(s);
	System.out.println(removeDup(s));
	System.out.println(removeDup1(s));
    }

    public static String removeDup(String s) {
	StringBuilder sb = new StringBuilder(s);
	int seen = 0;
	int head = 0;
	for (int i = 0; i < sb.length(); i++) {
	    char c = sb.charAt(i);
	    int mask = 1 << (Character.toLowerCase(c) - 97);
	    if ((seen & mask) == 0) {
		sb.setCharAt(head++, c);
	    }
	    seen |= mask;
	}
	return sb.substring(0, head);
    }

    public static String removeDup1(String s) {
	StringBuilder sb = new StringBuilder(s);
	int head = 0;
	for (int i = 1; i < sb.length(); i++) {
	    int j = 0;
	    for (; j <= head; j++) {
		if (sb.charAt(j) == sb.charAt(i)) break;
	    }
	    if (j == head + 1) sb.setCharAt(++head, sb.charAt(i));
	}
	return sb.substring(0, ++head);
    }
}