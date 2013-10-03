public class C1Q83 {
    public static void main(String... args) {
	String s1 = "shfdoe";
	String s2 = "hfdoes";
	System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) {
	return (s2 + s2).contains(s1);
    }
}