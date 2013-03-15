import java.util.*;

class C8Q5 {
    public static void main(String[] args) {
	printParens(4);
    }

    public static void printParens(int n) {
	printParens(n - 1, n, new ArrayList<String>(), "(");
    }
    
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
}