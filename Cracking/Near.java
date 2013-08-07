public class Near {
    
    public static void main(String... args) {
	System.out.println(near(95, 90));
    }

    public static int near(int a, int b) {
	return Math.abs(a - 100) > Math.abs(b - 100) ? b : a;
    }
}