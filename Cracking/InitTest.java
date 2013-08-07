public class InitTest {

    public static void main(String... args) {
	new InitTest().doTest();
    }
    
    public void doTest() {
	int[] c;
	int[] a = new int[3];
	c = a;
	for(int b : c) {
	    System.out.println(b);
	}
    }
}