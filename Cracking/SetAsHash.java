import java.util.Set;
import java.util.HashSet;

public class SetAsHash {

    public static void main(String... args) {
	Set<String> s = new HashSet<String>();
	System.out.println(s.add("a"));
	System.out.println(s.add("a"));
	s.add("a");
	s.add("b");
	for (String ss : s) {
	    System.out.println(ss);
	}
    }

}