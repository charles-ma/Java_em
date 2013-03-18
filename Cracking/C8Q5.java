import java.util.*;

class C8Q5 {
    public static void main(String[] args) {
	printParens(4);
    }

    /**
     * Facade method
     */
    public static void printParens(int n) {
	printParens(n - 1, n, new ArrayList<String>(), "(");
    }
    
    /**
     * Recursive method
     */    
    public static void printParens(int l, int r, ArrayList<String> parens, String paren) {
	parens.add(paren);
	if(l < 0 || l > r) {
	    
	} else if(r == 0) {
	    for(int i = 0; i < parens.size(); i++) {
		System.out.print(parens.get(i));
	    }
	    System.out.println();
	} else {
	    printParens(l, r - 1, parens, ")");
	    printParens(l - 1, r, parens, "(");
	}
	parens.remove(parens.size() - 1);
    }

    public void printParens1(int i, int j, String paren, ArrayList<String> parens) {
	parens.add(paren);
	if(i < 0 || j < 0 || i > j) {
	    
	} else if(i == 0 && j == 0) {
	    for(int k = 0; k < parens.size(); k++) {
		System.out.print(parens.get(k));
	    }
	} else {
	    printParens(i - 1, j, "(", parens);
	    printParens(i, j - 1, ")", parens);
	}
	parens.remove(parens.size() - 1);
    }
}