public class InnerTest {
    public static void main(String... args) {
	OutClass.InnClass a = new OutClass().new InnClass();
	a.printOut();
	new OutClass.StaticInner().printOut();
    }
}


class OutClass {
    private int i = 0;
    private static int j = 1;

    public class InnClass {
	public void printOut() {
	    System.out.println(i);
	}
    }

    public static class StaticInner {
	public void printOut() {
	    System.out.println(j);
	}
    }
}