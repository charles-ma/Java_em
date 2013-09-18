import java.util.*;

public class C3Q43 {
    private LinkedList<Integer> stack1 = new LinkedList<Integer>();
    private LinkedList<Integer> stack2 = new LinkedList<Integer>();
    private LinkedList<Integer> stack3 = new LinkedList<Integer>();
    private ArrayList<LinkedList<Integer>> stacks = new ArrayList<LinkedList<Integer>>();

    public static void main(String... args) {
	new C3Q43().solve(3);
    }

    public C3Q43() {
	stacks.add(stack1);
	stacks.add(stack2);
	stacks.add(stack3);
    }

    public void printStacks() { 
	for (int i = 0; i < 3; i++) {
	    System.out.print("Tower" + i + ": ");
	    for (int j : stacks.get(i)) System.out.printf("%3d", j);
	    System.out.println();
	}
	System.out.println();
    }

    public void solve(int size) {
	for (int i = 0; i < size; i++) stack1.push(size - i);
	printStacks();
	step(stack1, stack2, stack3, size);
    }

    public void step(LinkedList<Integer> stack1, LinkedList<Integer> stack2, LinkedList<Integer> stack3, int size) {
	if (size == 1) {
	    stack3.push(stack1.pop());
	    printStacks();
	    return;
	}
	step(stack1, stack3, stack2, size - 1);
	step(stack1, stack2, stack3, 1);
	step(stack2, stack1, stack3, size - 1);
    }
}