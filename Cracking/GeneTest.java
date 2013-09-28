import java.util.*;

public class GeneTest {
    public static void main(String... args) {
	ArrayList a = new ArrayList();
	a.add(1);
	ArrayList<GeneTest> s = (ArrayList<GeneTest>) a;
	s.add(new GeneTest());
	Date d = new Date();
	//System.out.println(d instanceof GeneTest);
	GeneTest t = s.get(0);
    }
}