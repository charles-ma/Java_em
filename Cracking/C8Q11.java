public class C8Q11 {
    public static void main(String... args) {
	for (int i = 0; i < 10; i++) System.out.printf("%3d", fibo(i));
	System.out.println();
	for (int i = 0; i < 10; i++) System.out.printf("%3d", fiboInte(i));
	System.out.println();
    }

    public static int fibo(int n) {
	if (n < 0) return Integer.MIN_VALUE;
	return (n <= 1) ? 1 : fibo(n - 1) + fibo(n - 2);
    }

    public static int fiboInte(int n) {
	if (n < 0) return Integer.MIN_VALUE;
	if (n <= 1) return 1;
	int a = 1;
	int b = 1;
	for (int i = 0; i < n - 1; i++) {
	    int tmp = b;
	    b = a + b;
	    a = tmp;
	}
	return b;
    }
}