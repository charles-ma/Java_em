public class C5Q62 {
    public static void main(String... args) {
	int v = 75943589;
	int s = swap(v);
	System.out.printf("%32s\n", Integer.toBinaryString(v));
	System.out.printf("%32s\n", Integer.toBinaryString(s));
    }

    public static int swap(int v) {
	int even = 0xaaaaaaaa;
	int odd = 0x55555555;
	return ((v & even) >>> 1 | (v & odd) << 1);
    }
}