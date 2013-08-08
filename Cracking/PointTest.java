public class PointTest {
    
    private int i = 0;

    public static void main(String... args) {
	PointTest p = new PointTest(0);
	p.printI();
	p.exchangePointer();
	p.printI();
    }

    public PointTest(int i) {
	this.i = i;
    }

    public void printI() {
	System.out.println(i);
    }

    public void exchangePointer() {
	this = new PointTest(1);
    }
}