public class C1Q62 {
    public static void main(String... args) {
	int size = 5;
	int[][] a = new int[size][size];
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		a[i][j] = i + j;
	    }
	}
	printArray(a);
	rotate(a);
	System.out.println();
	printArray(a);
    }

    public static void printArray(int[][] a) {
	for (int[] sub : a) {
	    for (int i : sub) {
		System.out.printf("%2d", i);
	    }
	    System.out.println();
	}
    }

    public static void rotate(int[][] a) {
	for (int i = 0; i < a.length / 2; i++) {
	    for (int j = i; j < a[i].length - 1 - i; j++) {
		int tmp = a[i][j];
		a[i][j] = a[j][a[j].length - i - 1];
		a[j][a[j].length - i - 1] = a[a.length - 1 - i][a[i].length - 1 - j];
		a[a.length - 1 - i][a[i].length - 1 -j] = a[a.length - 1 - j][i];
		a[a.length - 1 - j][i] = tmp;
	    }
	}
    }
    
}