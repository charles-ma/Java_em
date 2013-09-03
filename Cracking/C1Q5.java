class C1Q5 {
    public static void main(String[] args) {
	String s = "ab c  de";
	System.out.println(replace(s));
	System.out.println(replaceInSb(s));
	System.out.println(replaceArray(s));
    }

    public static String replace(String s) {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) == ' ') sb.append("%20");
	    else sb.append(s.charAt(i));
	}
	return sb.toString();
    }

    public static String replaceInSb(String s) {
	StringBuilder sb = new StringBuilder(s);
	for (int i = 0; i < sb.length(); i++) {
	    if (sb.charAt(i) == ' ') sb.replace(i, i + 1, "%20");
	}
	return sb.toString();
    }

    public static String replaceArray(String s) {
	char[] chars = s.toCharArray();
	int count = 0;
	for (int i = 0; i < chars.length; i++) {
	    if (chars[i] == ' ') count++;
	}
	char[] result = new char[chars.length + 2 * count];
	int k = 0;
	for (int i = 0; i < chars.length; i++) {
	    if (chars[i] == ' ') {
		result[k++] = '%';
		result[k++] = '2';
		result[k++] = '0';
	    } else {
		result[k++] = chars[i];
	    }
	}
	return new String(result);
    } 
    
}
