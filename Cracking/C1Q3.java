import java.util.*;

class C1Q3 {
    public static void main(String[] args) {
	String s = "abcbad";
	System.out.println(removeDup(s));
	System.out.println(removeDupHash(s));
    }

    public static String removeDup(String s) {
	if(s.length() <= 1) return s;
	char[] chars = s.toCharArray();
	int end = 0;
	int head = 1;
	for(int i = head; i < chars.length; i++) {
	    int j = 0;
	    for(j = 0; j <= end; j++) {
		if(chars[i] == chars[j]) break;
	    }
	    if(j > end) {
		chars[j] = chars[i];
		end++;
	    }
	}
	chars = Arrays.copyOfRange(chars, 0, ++end);
	return new String(chars);
    }

    public static String removeDupHash(String s) {
	if(s.length() <= 1) return s;
	char[] chars = s.toCharArray();
	boolean[] hash = new boolean[26];
	for(int i = 0; i < 26; i++) {
	    hash[i] = false;
	}
	int end = 0;
	for(int i = 0; i < chars.length; i++) {
	    char c = chars[i];
	    if(!hash[c - 'a']) {
		hash[c - 'a'] = true;
		chars[end] = c;
		end++;
	    } else {
		
	    }
	}
	chars = Arrays.copyOfRange(chars, 0, end);
	return new String(chars);
    }
}