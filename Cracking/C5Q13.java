public class C5Q13 {
    public static void main(String... args) {
	int m = 23432;
	int n = 993;
	int i = 3, j = 9;
	System.out.printf("%32s\n", Integer.toBinaryString(m));
	System.out.printf("%32s\n", Integer.toBinaryString(n));
	System.out.printf("%32s\n", Integer.toBinaryString(setBits(m, n, i, j)));
    }

    public static int setBits(int m, int n, int i, int j) {
	int mask = 0;
	for (int k = i; k <= j; k++) mask += (1 << k);
	return (m & (~mask)) | (n & mask);
    }
}