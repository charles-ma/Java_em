public class StringTest {
    public static void main(String... args) {
	String a = "abc";
	String b = "abc";
	String c = new String("abc");
	String d = new String("abc");
	System.out.println((a == b) + "/" + (a == c) + "/" + (c == d));
    }
}