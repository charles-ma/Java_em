import java.util.List;
import java.util.ArrayList;

/**
 * Void is also a type
 */
public class VoidTest {
    public static void main(String... args) {
	System.out.println(Void.TYPE instanceof java.lang.Class);
	System.out.println(Void.class instanceof java.lang.Class);
	System.out.println(Integer.class instanceof java.lang.Class);
	List<String> l = new ArrayList<String>();
	System.out.println(l instanceof List);
	System.out.println(l.getClass() instanceof java.lang.Class);
    }
}