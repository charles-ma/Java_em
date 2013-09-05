import java.util.LinkedList;

public class C3Q61 {
    public static void main(String... args) {
	LinkedList<Integer> stack = new LinkedList<Integer>();
	stack.push(3);
	stack.push(1);
	stack.push(4);
	stack.push(2);
	stack.push(6);
	for (int i : stack) System.out.printf("%2d", i);
	System.out.println();
	stack = sortStack(stack);
	for (int i : stack) System.out.printf("%2d", i);
	System.out.println();
    }

    public static LinkedList<Integer> sortStack(LinkedList<Integer> stack) {
	LinkedList<Integer> sorted = new LinkedList<Integer>();
	Integer value = 0;
	Integer sValue = 0;
	while ((value = stack.peek()) != null) {
	    stack.pop();
	    while ((sValue = sorted.peek()) != null && value < sValue) {
		stack.push(sorted.pop());
	    }
	    sorted.push(value);
	}
	return sorted;
    }
}