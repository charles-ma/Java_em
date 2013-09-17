import java.util.Arrays;

public class C1Q42 {
    public static void main(String... args) {
	String s1 = "sdfh";
	String s2 = "dhfs";
	System.out.println(isAna(s1, s2));
    }

    public static boolean isAna(String s1, String s2) {
	if (s1 == null || s2 == null) return s1 == s2;
	return sort(s1).equals(sort(s2));
    }

    public static String sort(String s) {
	char[] a = s.toCharArray();
	Arrays.sort(a);
	return new String(a);
    }
}