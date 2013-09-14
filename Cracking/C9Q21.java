import java.util.*;

public class C9Q21 implements Comparator<String> {
    public static void main(String... args) {
	String[] ss = {"abc", "ghd", "cba", "bac", "df", "hgd"};
	for (String s : ss) System.out.printf("%5s", s);
	System.out.println();
	Arrays.sort(ss, new C9Q21());
	for (String s : ss) System.out.printf("%5s", s);
	System.out.println();
    }
    
    public int compare(String s1, String s2) {
	return sort(s1).compareTo(sort(s2));
    }

    public String sort(String s) {
	char[] chars = s.toCharArray();
	Arrays.sort(chars);
	return new String(chars);
    } 
}