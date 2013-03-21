class C9Q6 {
    public static void main(String[] args) {
	int[][] a = {{1, 2, 3}, {3, 4, 6}, {4, 5, 9}};
	find(a, 5);
    }

    /**
     * Finds a certian value in a 2d arrayx
     */
    public static void find(int[][] a, int v) {
	int i = 0;
	int j = a[0].length - 1;
	while(i < a.length && j >=0 && a[i][j] != v) {
	    if(a[i][j] < v) {
		i++;
	    } else {
		j--;
	    } 
	}
	if(i == a.length || j < 0) System.out.println("can't find it");
	else System.out.println("x: " + i + " y: " + j);
    }
}