class C5Q5 {
    public static void main(String[] args) {
	System.out.println(getBitNum(31, 15));
	System.out.println(getBitNum1(31, 15));
    }

    public static int getBitNum(int m, int n) {
	int result = 0;
	for(int i = 0; i <= 31; i++) {
	    int mask = 1 << i;
	    if((m & mask) == (n & mask)) result++;
	}
	return 32 - result;
    }

    public static int getBitNum1(int m, int n) {
	int count = 0;
	for(int i = m ^ n; i != 0; i = i >> 1) {
	    count += i & 1;
	}
	return count;
    }
}