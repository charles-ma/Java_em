import java.util.*;

public class C3Q31 {
    public static void main(String... args) {
	SetOfStacks ss = new SetOfStacks(5);
	for (int i = 0; i < 30; i++) {
	    ss.push(i);
	}
	for (int i = 0; i < 16; i++) System.out.println(ss.pop());
	ss.printStack();
	for (int i = 0; i < 5; i++) ss.popAt(1);
	ss.popAt(0);
	ss.printStack();
    }
}

class SetOfStacks {
    private int thresh = 0;
    private LinkedList<LinkedList<Integer>> stacks = null;
    
    public SetOfStacks(int thresh) {
	this.thresh = thresh;
	stacks = new LinkedList<LinkedList<Integer>>();
    }

    public void push(int value) {
	LinkedList<Integer> stack = null;
	if (stacks.peek() == null || stacks.peek().size() == thresh) {
	    stack = new LinkedList<Integer>();
	    stacks.push(stack);
	}
	stacks.peek().push(value);
    }

    public int pop() {
	if (stacks.peek() == null) return Integer.MIN_VALUE;
	LinkedList<Integer> stack = stacks.peek();
	int result = stack.pop();
	if (stack.size() == 0) stacks.pop();
	return result;
    }

    public int popAt(int index) {
	LinkedList<Integer> stack = stacks.get(index);
	int result = stack.pop();
	if (stack.peek() == null) stacks.remove(index);
	return result;
    }

    public void printStack() {
	for (LinkedList<Integer> stack : stacks) {
	    for (int i : stack) System.out.printf("%3d", i);
	    System.out.println();
	}
    }
}