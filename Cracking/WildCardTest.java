import java.util.List;
import java.util.ArrayList;

/**
 * Wild card tests
 */
public class WildCardTest {
    public static void main(String... args) {
	WildCardTest test = new WildCardTest();
	test.wildFunc(new ArrayList<String>());
	List<String> l = new ArrayList<String>();
	String s = "abc";
	l.add(s);
	System.out.println(contains(l, s));
    }

    public static boolean contains(List<?> l, Object o) {
	for (Object other : l) {
	    if (other == o) return true;
	}
	return false;
    }

    public void wildFunc(List<? extends Comparable> param) {
	System.out.println("This is the wild card test!");
    }

    public <T extends Object> void yetAno(T a) {
	
    }
}

