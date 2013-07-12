import java.util.*;

class C1Q1 {
    public static void main(String[] args) {
	String uni = "abcsd";
	String rep = "abcdc";
	System.out.println(isUnique(uni));
	System.out.println(isUnique(rep));
    }

    public static boolean isUnique(String s) {
	return isUniqueInt(s);
    }

    public static boolean isUniqueHash(String s) {
	HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
	for(int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    if(hash.containsKey(c)) return false;
	    hash.put(c, 1);
	}
	return true;
    }

    public static boolean isUniqueArr(String s) {
	int[] a = new int[26];
	for(int i = 0; i < 26; i++) {
	    a[i] = 0;
	}
	for(int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    if(a[(int)(c - 'a')] != 0) return false;
	    a[(int)(c - 'a')] = 1;
	}
	return true;
    } 

    public static boolean isUniqueInt(String s) {
	int hashInt = 0;
	for(int i = 0; i < s.length(); i++) {
	    int hashNum = 1 << (int)(s.charAt(i) - 97);
	    if((hashNum & hashInt) != 0) return false;
	    hashInt |= hashNum;
	}
	return true;
    }

}

