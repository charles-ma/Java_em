import java.lang.reflect.*;

public class ClassTest {
    public static void main(String... args) {
	ClassTest test = new ClassTest();
	Comparable<String> a = new String();
	//int b = 0;
	System.out.println(Comparable.class); 
	System.out.println(Integer.class == Integer.class);
	System.out.println(Integer.class == int.class);
	System.out.println(int.class == int.class);
	System.out.println(int.class instanceof Class);
    }

    public void a() {

    }

    private int b(double d, String s) {
	return 0;
    }
}