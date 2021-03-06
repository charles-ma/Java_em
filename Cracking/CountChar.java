public class CountChar {

    public static void main(String... args) {
	System.out.println(getCount("afdoafhoqhef", 'f'));
    }

    /**
     * api for the world
     */
    public static int getCount(String s, char a) {
	if (s == null) return 0;
	else return tailRecurCount(s, a, 0);
    }

    /**
     * count implemented by interating
     */
    public static int inteCount(String s, char a) {
	int count = 0;
	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) == a) count++;
	}
	return count;
    }

    /**
     * count implemented by recursion
     */
    public static int recurCount(String s, char a) {
	if (s.equals("")) return 0; 
	int count = s.charAt(0) == a ? 1 : 0;
	return count + recurCount(s.substring(1), a);
    }

    /**
     * count implemented by tail recursion
     */
    public static int tailRecurCount(String s, char a, int count) {
	if (s.equals("")) return count;
	int c = s.charAt(0) == a ? 1 : 0;
	return tailRecurCount(s.substring(1), a, count + c);
    }
}