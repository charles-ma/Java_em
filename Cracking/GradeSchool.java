class GradeSchool {

    public static void main(String[] args) {
	printTable(12);
    }

    public static void printTable(int n) {
	for(int i = 0; i < n; i++) {
	    for(int j = 0; j < n; j++) {
		System.out.print(String.format("%4d", (i + 1) * (j + 1)));
	    }
	    System.out.println();
	}
    }
}