public class FinalTest {

    private final int a;
    public static int b;

    public FinalTest() {
	a = 0;
	b = 1;
    }

    public static void main(String... args) {
	System.out.println(new FinalTest().b);
    }
}