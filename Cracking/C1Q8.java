public class C1Q8 {
    public static void main(String[] args) {
	System.out.println(isRotation("adcfg", "cfgad"));
    }

    public static boolean isRotation(String s1, String s2) {
	return (s2 + s2).contains(s1);
    }
}