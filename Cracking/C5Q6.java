class C5Q6 {
    public static void main(String[] args) {
	int n = 105;
	System.out.println(Integer.toBinaryString(n));
	System.out.println(Integer.toBinaryString(changeBits(n)));
	System.out.println(Integer.toBinaryString(changeBits1(n)));
    }

    public static int changeBits(int n) {
	int mask = 1;
	for(int i = 0; i < 31; i++) {
	    mask = mask << 1;
	    if(i % 2 != 0) mask += 1;
	}
	return ((n & mask) >> 1) | ((n & (~ mask)) << 1);
    }

    public static int changeBits1(int n) {
	return ((n & 0xaaaaaaaa) >> 1) | ((n & 0x55555555) << 1);
    }
}