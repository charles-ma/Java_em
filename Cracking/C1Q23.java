import java.util.*;

public class C1Q23 {
    public static void main(String... args) {
	String s = "ahfod";
	System.out.println(s);
	System.out.println(reverse(s));
	System.out.println(reverse1(s));
    }

    public static String reverse(String s) {
	StringBuilder sb = new StringBuilder(s);
	return sb.reverse().toString();
    }

    public static String reverse1(String s) {
	char[] c = s.toCharArray();
	for (int i = 0; i < c.length / 2; i++) {
	    char tmp = c[i];
	    c[i] = c[c.length - 1 - i];
	    c[c.length - 1 - i] = tmp;
	}
	return new String(c);
    }
    
}