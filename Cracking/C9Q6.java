class C9Q6 {
    public static void main(String[] args) {
	int[][] a = {{1, 2, 3}, {3, 4, 6}, {4, 5, 9}};
	find(a, 3);
    }


    /**
     * Finds a certian value in a 2d arrayx
     */
    public static void find(int[][] a, int v) {
	int x = 0;
	int y = a[0].length - 1;
	while(x < a.length && y >= 0) {
	    if(a[x][y] == v) {
		System.out.println("x: " + x + " y: " + y);
		return;
	    } else if(a[x][y] < v) {
		x++;
	    } else {
		y--;
	    }
	}
	System.out.println("cannot find this value");
    }
}