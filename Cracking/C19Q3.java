import java.util.Random;

public class C19Q3 {
    public static void main(String... args) {
	Random r = new Random();
	int i = r.nextInt(12);
	System.out.println(i + "!(" + factor(i) + ") has " + countZeros(i) + " trailing zeros.");
    }

    public static int countZeros(int n) {
	if (n < 0) return -1;
	int count = 0;
	for (int i = 5; i <= n; i *= 5) count += n / i;
	return count;
    }

    public static int factor(int n) {
	if (n <= 0) return 1;
	return factor(n - 1) * n;
    }
}