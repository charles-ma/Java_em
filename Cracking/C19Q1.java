public class C19Q1 {
    public static void main(String... args) {
	int x = 0, y = 1;
	System.out.printf("%2d%2d\n", x, y);
	swap(x, y);
	swapX(x, y);
    }

    public static void swap(int x, int y) {
	x = x + y;
	y = x - y;
	x = x - y;
	System.out.printf("%2d%2d\n", x, y);
    }

    public static void swapX(int x, int y) {
	x = x ^ y;
	y = x ^ y;
	x = x ^ y;
	System.out.printf("%2d%2d\n", x, y);
    }
    
}