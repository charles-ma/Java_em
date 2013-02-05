import java.util.Hashtable;
import java.util.HashMap;
import java.util.Scanner;

public class UniqueString {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	while(true) {
	    String s = scanner.nextLine();
	    if(s.equals("quit")) break;
	    System.out.println(UniqueString.isUnique(s));
	}
    }

    public static boolean isUnique(String s) {
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	for(int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    if(map.containsKey(c + "")) return false;
	    else map.put(c + "", 1);
	}
	return true;
    }
}

