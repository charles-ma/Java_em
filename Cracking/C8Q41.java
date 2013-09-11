import java.util.*;

public class C8Q41 {
    public static void main(String... args) {
	List<String> result = getAll("abcd");
	for (String s : result) System.out.println(s);
    }

    public static List<String> getAll(String s) {
	List<String> result = new ArrayList<String>();
	if (s == null || s.length() <= 1) {
	    result.add(s);
	    return result;
	}
	char c = s.charAt(0);
	List<String> sbresult = getAll(s.substring(1));
	for (String sub : sbresult) {
	    for (int i = 0; i <= sub.length(); i++) {
		result.add(sub.substring(0, i) + c + sub.substring(i));
	    }
	}
	return result;
    }

}