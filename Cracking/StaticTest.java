public class StaticTest {
    // static block will be executed when class is loaded, while non-static block will be exectued only when the class is initialized
    static {
	System.out.println("block!");
    }
    
    public static void main(String... args) {
	StaticTest t = new StaticTest();
    }

    public StaticTest() {
	System.out.println("constructor!");
    }
}