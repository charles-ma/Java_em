import java.util.Arrays;

class AnagramString {
    public static void main(String []args) {
	System.out.println(AnagramString.isAnagram("abcdefg", "gfedcba"));
	System.out.println(AnagramString.isAnagram("abcdefg", "gfedghd"));
    }

    public static boolean isAnagram(String s1, String s2) {
	char [] charArray1 = s1.toCharArray();
	char [] charArray2 = s2.toCharArray();
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	String s3 = new String(charArray1);
	String s4 = new String(charArray2);
	return (!s1.equals(s2)) && s3.equals(s4);
    }
}
