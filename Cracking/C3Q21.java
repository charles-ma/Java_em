import java.util.*;

public class C3Q21 {
    public static void main(String... args) {
	MinStack misStack = new MinStack();
	for (int i = 0; i < 5; i++) {
	    misStack.push(i);
	}
	misStack.push(-1);
	misStack.push(-6);
	System.out.println(misStack.pop());
	misStack.printStack();
	System.out.println(misStack.getMin());
    }
}

class MinStack {
    private LinkedList<MinNode> baseList = null;
    private int minValue = Integer.MAX_VALUE;
    
    public MinStack() {
	baseList = new LinkedList<MinNode>();
    }

    public void push(int value) {
	if (value < minValue) minValue = value;
	baseList.push(new MinNode(value, minValue));
    }

    public int pop() throws NoSuchElementException {
	int result = baseList.pop().getValue();
	minValue = baseList.peek().getMin();
	return result;
    }

    public int getMin() {
	return minValue;
    }
    
    public void printStack() {
	for (MinNode node : baseList) {
	    System.out.printf("%3d", node.getValue());
	}
	System.out.println();
    }
}

class MinNode {
    private int value = 0;
    private int min = 0;

    public MinNode(int value, int min) {
	this.value = value;
	this.min = min;
    }

    public int getValue() {
	return value;
    }

    public int getMin() {
	return min;
    }
}