import java.util.*;

public class C1Q11 {
    public static void main(String... args) {
	System.out.println(isUniqueLoop("abc"));
	System.out.println(isUniqueLoop("abcdca"));
    }

    public static boolean isUnique(String s) {
	if (s == null) return true;
	Set<Character> uniqueSet = new HashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
	    if (!uniqueSet.add(s.charAt(i))) return false;
	}
	return true;
    }

    public static boolean isUniqueInt(String s) {
	if (s == null) return true;
	int uniqueInt = 0;
	for (int i = 0; i < s.length(); i++) {
	    int mask = 1 << Character.toLowerCase(s.charAt(i)) - 97;
	    if ((mask & uniqueInt) != 0) return false;
	    uniqueInt |= mask;
	}
	return true;
    }

    public static boolean isUniqueLoop(String s) {
	if (s == null) return true;
	for (int i = 0; i < s.length(); i++) {
	    for (int j = i + 1; j < s.length(); j++) {
		if (s.charAt(i) == s.charAt(j)) return false;
	    }
	}
	return true;
    }
}