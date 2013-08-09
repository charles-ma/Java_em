public class SingleForLoop {

    public static void main(String... args) {
	for (int i = 1, j = 1; j < 10; i++) {
	    System.out.printf("%3d", i * j);
	    if (i == j) {
		i = 0;
		j++;
		System.out.println();
	    }
	}	
    }
    
}