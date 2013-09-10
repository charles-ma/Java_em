import java.util.*;

public class ArrayTest {
    public static void main(String... args) {
	String[] strings = new String[] {"1"};
	mocFun(new String[]{"123"});
	//mocFun({"123"});
	//Integer[] inArray = new Object[3];
	ArrayList<String> [] a = new ArrayList[3];
	//a[0] = new ArrayList<Integer>();
	ArrayList al = new ArrayList();
	al.add(2);
	al.add("string");
	Object[] b = a;
	b[0] = 3;
    }

    public static void mocFun(String[] strings) {

    }
}