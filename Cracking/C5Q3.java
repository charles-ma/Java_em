class C5Q3 {
    public static void main(String[] args) {
	int n = 99;
	System.out.println(Integer.toBinaryString(n));
	System.out.println(Integer.toBinaryString(nextMin(n)));
	System.out.println(Integer.toBinaryString(nextMax(n)));
    }
    
    public static int getBit(int ori, int n) {
	if(n > 31 || n < 0) return -1;
	int mask = 0;
	mask = mask << n;
	ori = ori & mask;
	return ori == 0 ? 0 : 1;
    }

    public static int setBit(int ori, int n, int tar) {
	if(n > 31 || n < 0) throw new RuntimeException("Can't set " + n + " bit.");
	int mask = 1;
	mask = mask << n;
	ori = ori & (~ mask);
	if(tar == 1) ori += mask;
	return ori;
    }

    public static int nextMin(int n) {
	int i = 0;
	int num = 0;
	while(getBit(n, i) == 0) {
	    i++;
	}
	n = setBit(n, i, 0);
	i++;
	while(getBit(n, i) == 1) {
	    n = setBit(n, i, 0);
	    i++;
	    num++;
	}
	n = setBit(n, i, 1);
	for(int j = 0; j < num; j++) {
	    n = setBit(n, j, 1);
	}
	return n;
    }

    public static int nextMax(int n) {
	int num = 0;
	for(int i = 0; i < 32; i++) {
	    num += getBit(n, i);
	}
	n = 0;
	for(int i = 0; i < num; i++) {
	    n = setBit(n, 30 - i, 1);
	}
	return n;
    }
}