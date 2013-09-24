import java.util.*;

public class C9Q22 implements Comparator<String> {
    public static void main(String... args) {
	String[] a = {"abc", "dfe", "bca", "bac", "fho", "dfe", "def"};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a, new C9Q22());
	System.out.println(Arrays.toString(a));
    }

    public int compare(String s1, String s2) {
	return sort(s1).compareTo(sort(s2));
    }

    public String sort(String s) {
	char[] c = s.toCharArray();
	Arrays.sort(c);
	return new String(c);
    }
    
}