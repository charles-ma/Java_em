import java.util.*;

public class C8Q52 {
    public static void main(String... args) {
	printParen(4);
    }

    public static void printParen(int size) {
	step(size - 1, size, new LinkedList<Character>(), true);
    }
    
    public static void step(int l, int r, LinkedList<Character> result, boolean isLeft) {
	if (isLeft) result.add('(');
	else result.add(')');
	if (r == 0) {
	    for (char c : result) System.out.print(c);
	    System.out.println();
	}
	if (l - 1 >= 0) step(l - 1, r, result, true);
	if (l <= r - 1) step(l, r - 1, result, false);
	result.removeLast();
    }
}