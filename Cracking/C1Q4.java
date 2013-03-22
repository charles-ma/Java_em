import java.util.*;

class C1Q4 {
    public static void main(String[] args) {
	String s1 = "abdhg";
	String s2 = "dhgba";
	System.out.println(isAna(s1, s2));
    }

    public static boolean isAna(String s1, String s2) {
	return sortString(s1).equals(sortString(s2));
    }

    public static String sortString(String s) {
	char[] chars = s.toCharArray();
	Arrays.sort(chars);
	return new String(chars);
    }
}