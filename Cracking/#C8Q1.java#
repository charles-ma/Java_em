class C8Q1 {
    public static void main(String[] args) {
	for(int i = 1; i < 6; i++) {
	    System.out.println(fibo(i));
	    System.out.println(fibo1(i));
	}
    }
    
    /**
     * nth fibonacci using iteration
     */
    public static int fibo(int n) {
	int a = 0;
	int b = 1;
	for(int i = 2; i <= n; i++) {
	    int tmp = b;
	    b = a + b;
	    a = tmp;
	}
	return b;
    }
    
    /**
     * nth fibonacci using recursion
     */
    public static int fibo1(int n) {
	return n < 2 ? n : fibo1(n - 1) + fibo1(n - 2);
    }
}