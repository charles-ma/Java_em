public class C1Q52 {
    public static void main(String... args) {
	String s = "adf fe   fewef  d";
	System.out.println(s);
	System.out.println(encrypt(s));
    }
    
    public static String encrypt(String s) {
	if (s == null || s.length() == 0) return s;
	StringBuilder sb = new StringBuilder(s);
	for (int i = 0; i < sb.length(); i++) {
	    if (sb.charAt(i) == ' ') sb.replace(i, i + 1, "%20");
	}
	return sb.toString();
    }
}