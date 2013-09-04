import java.util.ArrayList;
import java.util.Arrays;

public class C1Q7 {
    public static void main(String[] args) {
	int[][] a = {{1, 2, 3}, {0, 3, 5}, {0, 1, 9}};
	System.out.println(Arrays.deepToString(a));
	setZeros(a);
	System.out.println(Arrays.deepToString(a));
    }


    /**
     * This method uses three loops
     */
    public static void setZeros(int[][] a) {
	ArrayList<Integer> lineNum = new ArrayList<Integer>();
	ArrayList<Integer> colNum = new ArrayList<Integer>();
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		if (a[i][j] == 0) {
		    lineNum.add(i);
		    colNum.add(j);
		}
	    }
	}
	for (int i : lineNum) {
	    for (int j = 0; j < a[i].length; j++) {
		a[i][j] = 0;
	    }
	}
	for (int j : colNum) {
	    for (int i = 0; i < a.length; i++) {
		a[i][j] = 0;
	    }
	}
    }
}