class C1Q5 {
    public static void main(String[] args) {
	String s = "ab c  de";
	System.out.println(replace(s));
    }

    public static String replace(String s) {
	if(s == null) return null;
	char[] chars = s.toCharArray();
	int spaceCount = 0;
	for(int i = 0; i < chars.length; i++) {
	    if(chars[i] == ' ') spaceCount++;
	}
	char[] result = new char[chars.length + 2 * spaceCount];
	int resultPos = 0;
	for(int i = 0; i < chars.length; i++) {
	    if(chars[i] == ' ') {
		result[resultPos] = '%';
		result[resultPos + 1] = '2';
		result[resultPos + 2] = '0';
		resultPos += 3;
	    } else {
		result[resultPos] = chars[i];
		resultPos++;
	    }
	}
	return new String(result);
    }
}
