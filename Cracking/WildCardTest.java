import java.util.List;
import java.util.ArrayList;

/**
 * Wild card tests
 */
public class WildCardTest {
    public static void main(String... args) {
	WildCardTest test = new WildCardTest();
	test.wildFunc(new ArrayList<String>());
    }

    public void wildFunc(List<? extends Comparable> param) {
	System.out.println("This is the wild card test!");
    }

    public <T extends Object> void yetAno(T a) {
	
    }
}

