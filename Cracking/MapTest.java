import java.util.HashMap;
import java.util.Map;

public class MapTest {
    
    public static void main(String... args) {
	Map<String, String> m = new HashMap<String, String>();
	m.put(null, "abc");
	m.put(null, "bcd");
	m.put(null, null);
	m.put("a", null);
	System.out.println(m.get(null));
	System.out.println(m.get("a"));
    }
    
}

