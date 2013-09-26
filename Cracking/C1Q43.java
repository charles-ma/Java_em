import java.util.*;

public class C1Q43 {
    public static void main(String... args) {
	String s1 = "dfhoee";
	String s2 = "fdeheo";
	System.out.println(isAna(s1, s2));
    }

    public static boolean isAna(String s1, String s2) {
	if (s1 == null || s2 == null) return false;
	return sort(s1).equals(sort(s2));
    }

    public static String sort(String s) {
	char[] c = s.toCharArray();
	Arrays.sort(c);
	return new String(c);
    }
    
}