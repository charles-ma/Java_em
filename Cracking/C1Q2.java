class C1Q2 {
    public static void main(String[] args) {
	String s = "abehd";
	System.out.println(reverse(s));
    }

    public static String reverse(String s) {
	if(s == null) return null;
	char[] chars = s.toCharArray();
	for(int i = 0; i < s.length() / 2; i++) {
	    char c = chars[i];
	    chars[i] = chars[s.length() - 1 - i];
	    chars[s.length() - 1 - i] = c;
	}
	return new String(chars);
    }

}