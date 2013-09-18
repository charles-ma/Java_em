import java.util.*;

public class C3Q62 {
    public static void main(String... args) {
	Random r = new Random();
	int size = 10;
	LinkedList<Integer> s = new LinkedList<Integer>();
	for (int i = 0; i < size; i++) s.push(r.nextInt(100));
	printStack(s);
	sort(s);
	printStack(s);
    }

    public static void printStack(LinkedList<Integer> s) {
	for (int i : s) System.out.printf("%3d", i);
	System.out.println();
    }
    
    public static void sort(LinkedList<Integer> o) {
	LinkedList<Integer> n = new LinkedList<Integer>();
	while (!o.isEmpty()) {
	    int v = o.pop();
	    while (!n.isEmpty() && v < n.peek()) {
		o.push(n.pop());
	    }
	    n.push(v);
	}
	while (!n.isEmpty()) o.push(n.pop());
    }
}