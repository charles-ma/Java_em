import java.util.ArrayList;
import java.util.List;

public class EqTest {
    public static void main(String ... args) {
	int a = 0;
	Integer b = 0;
	List<String> l = new ArrayList<String>();
	Object obj = new Object();
	System.out.println((a == obj) + " " + (l == obj) + " " + (a == b));

	String[] s = new String[] {"abc", "dd", "eho"};
	for(String w : s) {
	    System.out.println(w);
	}
    }
}