public class C1Q53 {
    public static void main(String... args) {
	String s = " fhdis   fdhis  fdi";
	String s1 = cipher(s);
	System.out.println(s);
	System.out.println(s1);
	System.out.println(decipher(s1));
    }

    public static String cipher(String s) {
	return replace(s, " ", "%20");
    }

    public static String decipher(String s) {
	return replace(s, "%20", " ");
    }
    
    public static String replace(String o, String t, String s) {
	int tl = t.length(), sl = s.length(), count = 0;
	char[] c = o.toCharArray(), d = null;
	for (int i = 0; i <= o.length() - tl; i++) {
	    String sub = o.substring(i, i + tl);
	    if (sub.equals(t)) count++;
	}
	d = new char[o.length() + count * (sl - tl)]; 
	int j = 0;
	for (int i = 0; i < c.length; i++) {
	    if (i > c.length - tl) d[j++] = c[i];
	    else {
		String sub = o.substring(i, i + tl);
		if (sub.equals(t)) {
		    for (int k = 0; k < sl; k++) {
			d[j++] = s.charAt(k);
		    }
		    i = i + tl - 1;
		} else {
		    d[j++] = c[i];
		}
	    }
	}
	return new String(d);
    }
}