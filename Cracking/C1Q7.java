import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Integer;

public class C1Q7 {
    public static void main(String[] args) {
	int [][] a = {{1, 2, 3}, {0, 3, 5}, {0, 1, 9}};
	setZeros(a);
    }

    public static void setZeros(int[][] array) {
	ArrayList<Integer> rows = new ArrayList<Integer>();
	ArrayList<Integer> cols = new ArrayList<Integer>();
	for(int i = 0; i < array.length; i++) {
	    for(int j = 0; j < array[0].length; j++) {
		if(array[i][j] == 0) {
		    rows.add(i);
		    cols.add(j);
		}
	    }
	}
	for(int i = 0; i < rows.size(); i++) {
	    for(int j = 0; j < array[0].length; j++) array[rows.get(i)][j] = 0;
	}
	for(int i = 0; i < array.length; i++) {
	    for(int j = 0; j < cols.size(); j++) array[i][cols.get(j)] = 0;
	}
	System.out.println(Arrays.deepToString(array));
    }
}