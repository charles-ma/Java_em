import java.util.*;

class C1Q3 {
    public static void main(String[] args) {
	String s = "adfqoefoeqft";
	System.out.println(removeDup(s));
	System.out.println(removeDupHash(s));
    }

    public static String removeDup(String s) {
	if (s == null || s.length() <= 1) return s;
	char[] chars = s.toCharArray();
	int noDupIndex = 0;
	int dup = 0;
	for (int head = 1; head < chars.length; head++) {
	    int k = 0;
	    for (; k <= noDupIndex; k++) {
		if (chars[head] == chars[k]) {
		    dup++;
		    break;
		}
	    }
	    if (k == noDupIndex + 1) {
		noDupIndex++;
		chars[noDupIndex] = chars[head];
	    }
	}
	chars = Arrays.copyOfRange(chars, 0, chars.length - dup);
	return new String(chars);
    }

    public static String removeDupHash(String s) {
	if (s == null || s.length() == 0) return s;
	int hashInt = 0;
	int head = 0;
	int dup = 0;
	char[] chars = s.toCharArray();
	for (int i = 0; i < chars.length; i++) {
	    int mask = 1 << (chars[i] - 96);
	    if ((mask & hashInt) == 0) {
		chars[head++] = chars[i];
		hashInt += mask;
	    }
	    else dup++;
	}
	chars = Arrays.copyOfRange(chars, 0, chars.length - dup);
	return new String(chars);
    }
}