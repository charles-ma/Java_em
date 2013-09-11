public class C5Q51 {
    public static void main(String... args) {
	int value = 3029;
	int value1 = 100;
	System.out.printf("%32s\n", Integer.toBinaryString(value));
	System.out.printf("%32s\n", Integer.toBinaryString(value1));
	System.out.println(getBitNum(value, value1));
    }

    public static int getBitNum(int m, int n) {
	int result = m ^ n;
	int count = 0;
	while (result != 0) {
	    count += result % 2;
	    result /= 2;
	}
	return count;
    }
}