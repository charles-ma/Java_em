import java.util.List;
import java.util.ArrayList;

public class NoMain {
    public static int j;
    static {
	int i = 0;
	j = 1;
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	System.out.println("There is no main function!");
	for(int k : list) System.out.println(k);
	System.exit(0);
    }
}