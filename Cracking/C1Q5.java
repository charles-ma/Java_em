class C1Q5 {
    public static void main(String[] args) {
	String s = "ab c  de";
	System.out.println(replace(s));
    }

    public static String replace(String s) {
	StringBuilder sb = new StringBuilder(s);
	for (int i = 0; i < sb.length(); i++) {
	    if (sb.charAt(i) == ' ') sb.replace(i, i + 1, "%20");
	}
	return sb.toString();
    }
}
