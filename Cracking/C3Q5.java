import java.util.*;

class C3Q5 {
    public static void main(String[] args) {
	MyQueue q = new MyQueue();
	for(int i = 0; i < 10; i++) {
	    q.add(i);
	}
	System.out.println(q.size());
	for(int i = 0; i < 10; i++) {
	    System.out.println(q.remove());
	}
	System.out.println(q.size());
    }
}

class MyQueue {
    
    private Stack<Integer> inStack = new Stack<Integer>();
    private Stack<Integer> outStack = new Stack<Integer>();
    
    public void add(int v) {
	while(!outStack.empty()) {
	    inStack.push(outStack.pop());
	}
	inStack.push(v);
    }

    public int remove() {
	while(!inStack.empty()) {
	    outStack.push(inStack.pop());
	}
	return outStack.pop();
    }

    public int size() {
	return inStack.size() + outStack.size();
    }
}