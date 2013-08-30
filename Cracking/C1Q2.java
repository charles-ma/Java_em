class C1Q2 {
    public static void main(String[] args) {
	String s = "abehd";
	System.out.println(reverseBuiltIn(s));
	System.out.println(reverseArray(s));
    }

    public static String reverseBuiltIn(String s) {
	StringBuilder sb = new StringBuilder(s);
	return sb.reverse().toString();
    }

    public static String reverseArray(String s) {
	StringBuilder sb = new StringBuilder(s);
	for (int i = 0; i < sb.length() / 2; i++) {
	    char c = sb.charAt(sb.length() - 1 - i);
	    sb.setCharAt(sb.length() - 1 - i, sb.charAt(i));
	    sb.setCharAt(i, c);
	}
	return sb.toString();
    }
}