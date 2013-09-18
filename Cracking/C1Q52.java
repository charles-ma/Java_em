public class C1Q52 {
    public static void main(String... args) {
	String s = "adf fe   fewef  d";
	System.out.println(s);
	System.out.println(encrypt(s));
	System.out.println(encryptArray(s));
    }
    
    public static String encrypt(String s) {
	if (s == null || s.length() == 0) return s;
	StringBuilder sb = new StringBuilder(s);
	for (int i = 0; i < sb.length(); i++) {
	    if (sb.charAt(i) == ' ') sb.replace(i, i + 1, "%20");
	}
	return sb.toString();
    }

    public static String encryptArray(String s) {
	char[] a = s.toCharArray();
	int count = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == ' ') count++;
	}
	char[] b = new char[2 * count + a.length];
	int j = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == ' ') {
		b[j++] = '%';
		b[j++] = '2';
		b[j++] = '0';
	    } else {
		b[j++] = a[i];
	    }
	}
	return new String(b);
    }
}