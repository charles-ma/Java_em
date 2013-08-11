public class BasicTest {

    public static void main(String... args) {
	int i = 0xFFFFFFF1;
	int j = ~i;
	System.out.println(j);
	int k = 0, l = 0;
	k = k++;
	l = ++l;
	System.out.println(k);
	System.out.println(l);
    }
    
}