import java.io.PrintStream;

public class SysTest {
    
    public static void main(String... args) {
	System.out.println(System.out instanceof PrintStream);
	//System.out = new PrintStream();//System.out is final
    }
}