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
	ArrayList<ArrayList<?>> dd = new ArrayList();
	ArrayList<ArrayList> ad = new ArrayList();
	dd.add(a);
	dd.add(s);
	ad.add(a);
	ad.add(s);
    }
    
}