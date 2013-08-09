public class BooleanTest {

    private static int i = 0;
    private static int j = 1;

    public static void main(String... args) {
	if (i == 0 || j == (++i)) System.out.println(i);
    }
    
}