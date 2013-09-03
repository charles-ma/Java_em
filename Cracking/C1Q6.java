class RotateArray {
    public static void main(String... args) {
	int[][] array = new int[5][5];
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[0].length; j++) {
		array[i][j] = i + j;
	    }
	}
	printArray(array);
	rotate(array);
	System.out.println();
	printArray(array);
    }

    public static void printArray(int[][] array) {
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++) {
		System.out.printf("%2d", array[i][j]);
	    }
	    System.out.println();
	}
    }

    public static void rotate(int[][] array) {
	int length = array.length;
	for (int i = 0; i < length / 2; i++) {
	    for (int j = i; j < length - 1 - i; j++) {
		int tmp = array[i][j];
		array[i][j] = array[j][length - i - 1];
		array[j][length - i - 1] = array[length - i - 1][length - j - 1];
		array[length - i - 1][length - j - 1] = array[length - j - 1][i];
		array[length - j - 1][i] = tmp;
	    }
	}
    }
    
}