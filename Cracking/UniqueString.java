import java.util.HashMap;

/**
 * Remove redundant letters
 */
class UniqueString {
    public static void main(String [] args) {
	boolean result = isUnique("asdds");
	boolean result2 = isUnique2("ase");
	System.out.println(result + "\n" + result2);
    }

    /**
     *This function uses hashmap
     */
    public static boolean isUnique(String s) {
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for(int i = 0; i < s.length(); i++) {
	    if(map.containsKey(s.charAt(i))) return false;
	    map.put(s.charAt(i), 1);
	}
	return true;
    }

    /**
     *This function uses an integer as a hashmap
     */
    public static boolean isUnique2(String s) {
	int exist = 0;
	for(int i = 0; i < s.length(); i++) {
	    int shift = (int)(s.charAt(i) - 97);
	    int sig = 1 << shift;
	    if((exist & sig) != 0) return false;
	    exist = exist | sig;
	}
	return true;
    }
}