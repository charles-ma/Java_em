class Fibonacci {
    
    public static void main(String[] args) {
	for(int i = 1; i < 9; i++) {
	    System.out.println(fibonacci(i));
	    System.out.println(fibonacciRec(i));
	}
    }
    
    /**
     * Solution using loop
     */
    public static int fibonacci(int n) {
	int a = 1;
	int b = 1;
	for(int i = 3; i <= n; i++) {
	    int tmp = b;
	    b = a + b;
	    a = tmp;
	}
	return b;
    }

    /**
     * Solution using recursion (time explosion)
     */
    public static int fibonacciRec(int n) {
	if(n <= 2) return 1;
	return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

}