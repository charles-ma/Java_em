import java.io.IOException;

public class ExceptionTest {
    public void test() throws RuntimeException, IOException {
	//throw new IOException();
    }

    public static void main(String... args) {
	System.out.println("There is a method advertises for RuntimeException in this class!");
    }
}