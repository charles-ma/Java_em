public class C19Q4 {
    public static void main(String... args) {
	System.out.println(max(100, -10));
    }

    public static int max(int x, int y) {
	int z = x - y;
	int k = z >>> 31;
	return x - k * z;
    }
}