public class C8Q12 {
    public static void main(String... args) {
	int n = 8;
	System.out.println(fibo(n));
	System.out.println(fiboLoop(n));
    }

    public static int fibo(int n) {
	if (n <= 1) return n;
	return fibo(n - 1) + fibo(n - 2);
    }

    public static int fiboLoop(int n) {
	int a = 1, b = 1, tmp = 1;
	if (n <= 2) return tmp;
	for (int i = 0; i < n - 2; i++) {
	    tmp = a + b;
	    a = b;
	    b = tmp;
	}
	return tmp;
    }
}