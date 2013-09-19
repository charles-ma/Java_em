public class C5Q12 {
    public static void main(String... args) {
	int m = 5458685;
	int n = 343420;
	int i = 5; 
	int j = 10;
	System.out.printf("%32s\n", Integer.toBinaryString(m));
	System.out.printf("%32s\n", Integer.toBinaryString(n));
	System.out.printf("%32s\n", Integer.toBinaryString(setBit(m, n, i, j)));
    }

    public static int setBit(int m, int n, int i, int j) {
	int mask = 0;
	for (int k = i; k <= j; k++) mask += (1 << k);
	return m & ~mask | n & mask;
    }
}