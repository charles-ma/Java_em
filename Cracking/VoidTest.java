import java.util.List;
import java.util.ArrayList;

public class VoidTest {
    public static void main(String... args) {
	System.out.println(Void.TYPE instanceof java.lang.Class);
	List<String> l = new ArrayList<String>();
	System.out.println(l instanceof List);
    }
}