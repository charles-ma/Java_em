public class C5Q31 {
    public static void main(String... args) {
	int value = 108;
	System.out.printf("%32s\n", Integer.toBinaryString(value));
	System.out.printf("%32s\n", Integer.toBinaryString(nextSmaller(value)));
	System.out.printf("%32s\n", Integer.toBinaryString(nextLarger(value)));
    }

    public static int setBit(int value, int pos, boolean bValue) {
	if (pos > 31) return value;
	int mask = 1 << pos;
	return bValue ? (value & (~mask)) + mask : value & (~mask);
    }

    public static int getBit(int value, int pos) {
	if (pos > 31) return 0;
	int mask = 1 << pos;
	return (value & mask) == 0 ? 0 : 1;
    }

    public static int nextSmaller(int value) {
	int pos = 0;
	int index = 0;
	for (; index < 31; index++) {
	    if (getBit(value, index) != 0) break; 
	}
	if (index == 30) return 0;
	int i = index + 1;
	while (getBit(value, i) != 0) {
	    value = setBit(value, pos++, true);
	    value = setBit(value, i, false);
	    i++;
	}
	if (i == 31) return 0;
	value = setBit(value, i, true);
	value = setBit(value, index, false);
	return value;
    }

    public static int nextLarger(int value) {
	int count = 0;
	for (int i = 0; i < 31; i++) {
	    if (getBit(value, i) == 1) {
		count++;
		value = setBit(value, i, false);
	    }
	}
	for (int i = 0; i < count; i++) {
	    value = setBit(value, 30 - i, true);
	}
	return value;
    }
}