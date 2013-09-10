public class C5Q11 {
    public static void main(String... args) {
	int m = 0x0400;
	int n = 0x0054;
	System.out.println(n);
	System.out.println(setBitValues(m, n, 2, 6));
    }

    public static int setBitValue(int index, int value, boolean bitV) {
	int mask = 1 << index;
	value = value & (~mask);
	if (bitV) value += mask;
	return value;
    }

    public static int setBitValues(int m, int n, int start, int end) {
	int mask = 0;
	for (int i = start; i <= end; i++) {
	    mask = setBitValue(i, mask, true);
	}
	int fraction = n & mask;
	return fraction + (m & (~mask));
    }
}