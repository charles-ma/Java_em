class C5Q1 {

    public static void main(String[] args) {
	int n = 356789;
	int m = 1200023;
	System.out.println(Integer.toBinaryString(n));
	System.out.println(Integer.toBinaryString(m));
	n = setBit(n, m, 2, 10);
	System.out.println(Integer.toBinaryString(n));
    }


    /**
     * Set a certain bit of an integer
     */
    public static int setBit(int n, int m, int i, int j) {
	int mask0 = 0;
	int mask1 = 0;
	for(int k = 0; k < 32; k++) {
	    if(i <= k && k <= j) mask1 += Math.pow(2, k);
	}
	mask0 = ~mask1;
	return (n & mask0) + (m & mask1); 
    }
}