public class C5Q32 {
    public static void main(String... args) {
	int v = 89453;
	int next = nextSmaller(v);
	int rec = preLarger(next);
	System.out.printf("%32s\n",Integer.toBinaryString(v));
	System.out.printf("%32s\n",Integer.toBinaryString(next));
	System.out.printf("%32s\n",Integer.toBinaryString(rec));
    }

    public static int nextSmaller(int v) {
	int i = 0, j = 0;
	while (getBit(v, i) == 0) i++;
	v = setBit(v, i++, true);
	while (getBit(v, i) == 1) {
	    v = setBit(v, i++, true);
	    v = setBit(v, j++, false);
	}
	v = setBit(v, i, false);
	return v;
    }

    public static int preLarger(int v) {
	int i = 0, j = 0;
	while (getBit(v, i) == 1) v = setBit(v, i++, true);
	int head = i - 1;
	while (getBit(v, i) == 0) i++;
	v = setBit(v, i--, true);
	for (int k = head + 1; k >= 0; k--) v = setBit(v, i--, false);
	return v;
    }

    public static int getBit(int n, int i) {
	int mask = 1 << i;
	return (n & mask) == 0 ? 0 : 1;
    }

    public static int setBit(int n, int i, boolean z) {
	int mask = 1 << i;
	n = n & ~mask;
	return z ? n : (n | mask);
    }
}