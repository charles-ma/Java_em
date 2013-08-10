public class DoubleInnerTest {

    public static void main(String... args) {
	new InterA() {
	    public void printMessage() {
		new InterB() {
		    public void printMessage() {
			System.out.println("Double inner classes");
		    }
		}.printMessage();
	    }
	}.printMessage();
    }

}

interface InterA {

}

interface InterB {

}