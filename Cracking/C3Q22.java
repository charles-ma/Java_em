import java.util.*;

public class C3Q22 {
    public static void main(String... args) {
	StackMin stackMin = new StackMin();
	stackMin.push(0);
	stackMin.push(2);
	stackMin.push(1);
	stackMin.pop();
	stackMin.push(-6);
	stackMin.printStack();
	System.out.println(stackMin.min());
    }
}

class StackMin {
    private LinkedList<Integer> baseList = null;
    private LinkedList<Integer> minValues = null;

    public StackMin() {
	baseList = new LinkedList<Integer>();
	minValues = new LinkedList<Integer>();
    }
    
    public void push(int value) {
	if (minValues.peek() == null) minValues.push(value);
	if (minValues.peek() >= value) minValues.push(value);
	baseList.push(value);
    }

    public int pop() throws NoSuchElementException {
	int result = baseList.pop();
	if (result == minValues.peek()) minValues.pop();
	return result;
    }

    public int min() {
	return minValues.peek() == null ? Integer.MIN_VALUE : minValues.peek();
    }

    public void printStack() {
	for (int i : baseList) {
	    System.out.printf("%3d", i);
	}
	System.out.println();
    }
}