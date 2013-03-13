import java.util.*;

class C3Q6 {
    public static void main(String[] args) {
	Stack<Integer> s = new Stack<Integer>();
	Random ran = new Random();
	for(int i = 0; i < 10; i++) {
	    int ranNum = ran.nextInt(10);
	    s.push(ranNum);
	}
	printStack(s);
	s = sortStack(s);
	printStack(s);
    }

    public static Stack<Integer> sortStack(Stack<Integer> s) {
	Stack<Integer> sortedStack = new Stack<Integer>();
	while(!s.empty()) {
	    if(sortedStack.empty()) {
		sortedStack.push(s.pop());
	    } else {
		int v = s.pop();
		while(!sortedStack.empty() && v < sortedStack.peek()) {
		    s.push(sortedStack.pop());
		}
		sortedStack.push(v);
	    }
	}
	return sortedStack;
    }

    public static void printStack(Stack<Integer> s) {
	Iterator it = s.iterator();
	while(it.hasNext()) System.out.print(String.format("%2d", it.next()));
	System.out.println();
    }
}


