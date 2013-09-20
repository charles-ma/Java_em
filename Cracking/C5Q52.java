public class C5Q52 {
    public static void main(String... args) {
	int a = 500;
	int b = 330;
	System.out.printf("%32s\n", Integer.toBinaryString(a));
	System.out.printf("%32s\n", Integer.toBinaryString(b));
	System.out.println(getBitNumber(a, b));
	System.out.println(getBitNumber1(a, b));
    }

    public static int getBitNumber(int a, int b) {
	int result = a ^ b;
	int count = 0;
	for (int i = 0; i < 32; i++) {
	    int mask = 1 << i;
	    if ((mask & result) != 0) count++;
	}
	return count;
    }

    public static char getCharAt(String s, int p) {
	if (p >= s.length()) return '0';
	else return s.charAt(p);
    }

    public static int getBitNumber1(int a, int b) {
	int count = 0;
	String sa = Integer.toBinaryString(a);
	String sb = Integer.toBinaryString(b);
	for (int i = 0; i < 32; i++) {
	    if (getCharAt(sa, i) != getCharAt(sb, i)) count++;
	}
	return count;
    }
}