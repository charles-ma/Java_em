public class C1Q82 {
    public static void main(String... args) {
	String s1 = "hotel california";
	String s2 = "el californiahot";
	System.out.println(isRotate(s1, s2));
    }

    public static boolean isRotate(String s1, String s2) {
	return (s1 + s1).contains(s2);
    }
    
}