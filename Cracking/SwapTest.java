public class SwapTest {
    
    private int x = 0, y = 1;

    public static void main(String... args) {
	SwapTest sw = new SwapTest();
	System.out.println(sw.getX());
	sw.swap();
	System.out.println(sw.getX());
    }

    public void swap() {
	int tmp = x;
	x = y;
	y = tmp;
    }

    public int getX() {
	return x;
    }
}