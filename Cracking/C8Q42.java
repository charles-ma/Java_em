import java.util.*;

public class C8Q42 {
    public static void main(String... args) {
	String s = "ahd";
	new C8Q42().printAll(s);
    }

    public void printAll(String s) {
	if (s == null) return;
	List<String> result = getAll(s);
	for (String e : result) System.out.println(e);
    }

    public List<String> getAll(String s) {
	List<String> result = new LinkedList<String>();
	if (s.length() <= 1) {
	    result.add(s);
	    return result;
	}
	char f = s.charAt(0);
	List<String> sub = getAll(s.substring(1));
	for (String e : sub) {
	    for (int i = 0; i <= e.length(); i++) {
		result.add(e.substring(0, i) + f + e.substring(i));
	    }
	}
	return result;
    } 
}