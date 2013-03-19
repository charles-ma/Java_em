import java.util.*;

class C8Q8 {
    public static void main(String[] args) {
	new C8Q8().eightQueens();
    }

    /*
    public void eightQueens() {
	ArrayList<ArrayList<Position>> a = placeQueens(8);
	if(a.size() != 0) {
	    ArrayList<Position> queens = a.get(0);
	    for(int i = 0; i < 8; i++) {
		for(int j = 0; j < 8; j++) {
		    if(queens.get(i).y == j) System.out.print(String.format("%2d", 1));
		    else System.out.print(String.format("%2d", 0));
		}
		System.out.println();
	    }
	}
    }

    public ArrayList<ArrayList<Position>> placeQueens(int n) {
	ArrayList<ArrayList<Position>> result = new ArrayList<ArrayList<Position>>();
	if(n == 1) {
	    for(int i = 0; i < 8; i++) {
		Position p = new Position(0, i);
		ArrayList<Position> a = new ArrayList<Position>();
		a.add(p);
		result.add(a);
	    }
	} else {
	    ArrayList<ArrayList<Position>> lastResult = placeQueens(n - 1);
	    for(int i = 0; i < lastResult.size(); i++) {
		ArrayList<Position> a = lastResult.get(i);
		for(int k = 0; k < 8; k++) {
		    ArrayList<Position> sub = new ArrayList<Position>();
		    boolean isOk = true;
		    Position insert = new Position(n - 1, k);
		    for(int j = 0; j < a.size(); j++) {
			Position queen = a.get(j);
			if(!checkOk(queen, insert)) {
			    isOk = false;
			    break;
			}
		    }
		    if(isOk) {
			sub.addAll(a);
			sub.add(insert);
			result.add(sub);
		    }
		}
	    }
	}
	return result;
    }

    public boolean checkOk(Position queen, Position otherQ) {
	if(queen.x == otherQ.x || queen.y == otherQ.y || Math.abs(queen.x - otherQ.x) == Math.abs(queen.y - otherQ.y)) {
	    return false;
	}
	return true;
    }

    class Position {
	public int x, y;
	public Position(int x, int y) {
	    this.x = x;
	    this.y = y;
	}
    }
    */

    public void eightQueens() {
	int[] col4row = new int[8];
	placeQueen(0, col4row);
    }

    public boolean checkOk(int[] col4row, int r) {
	for(int i = 0; i < r; i++) {
	    if(col4row[i] == col4row[r] || Math.abs(col4row[i] - col4row[r]) == r - i) {
		return false;
	    }
	}
	return true;
    }

    public void placeQueen(int r, int[] col4row) {
	if(!checkOk(col4row, r - 1)) {

	} else if(r == 8) {
	    for(int i = 0; i < 8; i++) {
		for(int j = 0; j < 8; j++) {
		    if(j == col4row[i]) System.out.print(String.format("%2d", 1));
		    else System.out.print(String.format("%2d", 0));
		}
		System.out.println();
	    }
	    System.out.println();
	} else {
	    for(int i = 0; i < 8; i++) {
		col4row[r] = i;
		placeQueen(r + 1, col4row);
	    }
	}
    }
}