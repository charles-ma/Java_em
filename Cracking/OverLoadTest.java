public class OverLoadTest {

    public static void main(String... args) {
	new OverLoadTest().getV();
    }
    
    public int getV() {
	return 0;
    }

    public Double getV(int i) {
	return new Double(1);
    }

}

