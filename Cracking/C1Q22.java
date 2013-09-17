public class C1Q22 {
    public static void main(String... args) {
	String s = "adhfohweo";
	System.out.println(s);
	char[] a = s.toCharArray();
	reverseArray(a);
	System.out.println(new String(a));
    }

    public static void reverseArray(char[] a) {
	if (a == null || a.length == 0) return;
	for (int i = 0; i < a.length / 2; i++)  {
	    char tmp = a[i];
	    a[i] = a[a.length - 1 - i];
	    a[a.length - 1 - i] = tmp;
	}
    }
}