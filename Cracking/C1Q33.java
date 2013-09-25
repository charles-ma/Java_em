import java.util.*;

public class C1Q33 {
    public static void main(String... args) {
	String s = "dshfoedf";
	System.out.println(s);
	System.out.println(removeDup(s));
    }

    public static String removeDup(String s) {
	StringBuilder sb = new StringBuilder();
	int seen = 0;
	for (int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    int mask = 1 << (Character.toLowerCase(c) - 97);
	    if ((seen & mask) == 0) sb.append(c);
	    seen |= mask;
	}
	return sb.toString();
    }
}