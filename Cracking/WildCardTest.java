import java.util.List;
import java.util.ArrayList;

public class WildCardTest {
    public static void main(String... args) {
	WildCardTest test = new WildCardTest();
	test.wildFunc(new ArrayList<String>());
	//test.WildFunc(new ArrayList());
    }

    public void wildFunc(List<? extends Comparable> param) {
	System.out.println("This is the wild card test!");
    }
}

