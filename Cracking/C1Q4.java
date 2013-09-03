import java.util.*;

class C1Q4 {
    public static void main(String[] args) {
	String s1 = "abdhg";
	String s2 = "dhgba";
	String s3 = "abc";
	System.out.println(isAna(s1, s2));
	System.out.println(isAna(s1, s3));
	System.out.println(isAna(s2, s3));
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