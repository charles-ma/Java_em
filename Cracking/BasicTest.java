public class BasicTest {

    public static void main(String... args) {
	int i = 0xFFFFFFF1;
	int j = ~i;
	System.out.println(j);
	int k = 0;
	k = k++;
	System.out.println(k);
    }
    
}