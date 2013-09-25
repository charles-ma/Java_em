import java.util.*;

public class C1Q13 {
    public static void main(String... args) {
	String s = "abc";
	System.out.println(isUnique1(s));
    }

    public static boolean isUnique(String s) {
	if (s == null) return true;
	Set<Character> seen = new HashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
	    if (!seen.add(s.charAt(i))) return false;
	}
	return true;
    }

    public static boolean isUnique1(String s) {
	if (s == null) return true;
	int seen = 0;
	for (int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    int mask = 1 << (Character.toLowerCase(c) - 97);
	    if ((seen & mask) != 0) return false;
	    seen |= mask;
	}
	return true;
    }
}