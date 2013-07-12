import java.util.*;

public class C3Q3 {
    public static void main(String[] args) {
	SetOfStacks ss = new SetOfStacks();
	for(int i = 0; i < 10; i++) {
	    ss.push(i);
	}
	System.out.println(ss.peek());
	System.out.println(ss.pop(0));
	for(int i = 0; i < 6; i++) {
	    ss.pop();
	}
	System.out.println(ss.peek());
    }
}

class SetOfStacks {
    
    private ArrayList<Stack<Integer>> stacks= new ArrayList<Stack<Integer>>();
    private int currStackIndex = 0;
    
    public SetOfStacks() {
	stacks.add(new Stack<Integer>());
    }

    public void push(int v) {
	Stack<Integer> currS = stacks.get(currStackIndex);
	if(currS.size() == 5) {
	    currS = new Stack<Integer>();
	    stacks.add(currS);
	    currStackIndex++;
	}
	currS.push(v);
    }
    
    public int pop() {
	Stack<Integer> currS = stacks.get(currStackIndex);
	while(currS.isEmpty()) {
	    if(currStackIndex != 0) {
		currStackIndex--;
		currS = stacks.get(currStackIndex);
	    } else {
		throw new RuntimeException("The stack is empty!");
	    }
	}
	return currS.pop();
    }

    public int peek() {
	Stack<Integer> currS = stacks.get(currStackIndex);
	while(currS.isEmpty()) {
	    if(currStackIndex != 0) {
		currStackIndex--;
		currS = stacks.get(currStackIndex);
	    } else {
		throw new RuntimeException("The stack is empty!");
	    }
	}
	return currS.peek();
    }

    public int pop(int index) {
	Stack<Integer> s = stacks.get(index);
	return s.pop();
    }
}