public class reverseString {
    
    public static void main(String[] args) {
	String s = "abc";
	System.out.println(reverse(s));
	System.out.println(reverse1(s));
    }

    public static String reverse(String s) {
	char[] chars = s.toCharArray();
	for(int i = 0; i < s.length() / 2; i++) {
	    char c = chars[i];
	    chars[i] = chars[s.length() - 1 -i];
	    chars[s.length() - 1 -i] = c;
	}
	return new String(chars);
    }

    public static String reverse1(String s) {
	StringBuilder sb = new StringBuilder(s);
	sb.reverse();
	return sb.toString();
    }
}