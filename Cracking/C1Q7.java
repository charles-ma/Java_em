import java.util.ArrayList;
import java.util.Arrays;

public class C1Q7 {
    public static void main(String[] args) {
	int [][] a = {{1, 2, 3}, {0, 3, 5}, {0, 1, 9}};
	setZeros(a);
	System.out.println(Arrays.deepToString(a));
    }


    /**
     * This method uses three loops
     */
    public static void setZeros(int[][] a) {
	ArrayList<Integer> cols = new ArrayList<Integer>();
	ArrayList<Integer> rows = new ArrayList<Integer>();
	for(int i = 0; i < a.length; i++) {
	    for(int j = 0; j < a[i].length; j++) {
		if(a[i][j] == 0) {
		    rows.add(i);
		    cols.add(j);
		}
	    }
	}
	for(int i = 0; i < rows.size(); i++) {
	    for(int j = 0; j < a[rows.get(i)].length; j++) {
		a[rows.get(i)][j] = 0;
	    }
	}
	for(int i = 0; i < cols.size(); i++) {
	    for(int j = 0; j < a.length; j++) {
		a[j][cols.get(i)] = 0;
	    }
	}
    }
}