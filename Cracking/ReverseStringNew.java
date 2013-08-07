public class ReverseStringNew {

    public static void main(String... args) {
	String s = "this is a test string";
	System.out.println(s);
	System.out.println(reverse(s));
	System.out.println(reverseRecur(s));
	System.out.println(reverseApi(s));
    }

    public static String reverse(String s) {
	StringBuilder sb = new StringBuilder(s);
	for (int i = 0; i < s.length() / 2; i++) {
	    char tmp = sb.charAt(i);
	    sb.setCharAt(i, sb.charAt(sb.length() - 1 - i));
	    sb.setCharAt(sb.length() - 1 - i, tmp);
	}
	return sb.toString();
    }
    
    public static String reverseRecur(String s) {
	if (s == null || s.length() == 1) return s;
	return (reverseRecur(s.substring(1)) + s.charAt(0));
    }

    public static String reverseApi(String s) {
	if (s == null) return null;
	return new StringBuilder(s).reverse().toString();
    }
}