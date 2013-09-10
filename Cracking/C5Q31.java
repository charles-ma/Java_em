public class C5Q31 {
    public static void main(String... args) {
    
    }

    public static int setBit(int value, int pos, boolean bValue) {
	if (pos > 31) return value;
	int mask = 1 << pos;
	return bValue ? value & (~mask) + mask : value & (~mask);
    }

    public static int getBit(int value, int pos) {
	if (pos > 31) return 0;
	int mask = 1 << pos;
	return value & mask == 0 ? 0 : 1;
    }

    public static int nextSmaller(int value) {
	int pos = 0;
	for (int i = 0; i < 32; i++) {
	    if (getBit(value, i) != 0) {
		if (getBit(value, i + 1) == 0) {
		    value = setBit(value, i, false);
		    value = setBit(value, i + 1, true);
		} else {
		    
		}
		break;
	    }
	}
	return 0;
    }

    public static int nextLarger(int value) {
	return 0;
    }
}