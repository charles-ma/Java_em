import java.util.ArrayList;

public class QMTest {

    public static void main(String... args) {
	ArrayList<?> a = new ArrayList<String>();
	ArrayList<? super Object> o = new ArrayList();
	ArrayList<? extends Comparable> c = new ArrayList();
	ArrayList<String> s = new ArrayList();
	s.add("and");
	o.add("ads");
	//c.add("asd");
	System.out.println(s.get(0) + "/" + o.get(0));
    }
    
}