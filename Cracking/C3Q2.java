import java.util.*;

public class C3Q2 {

    public static void main(String[] args) {
	Stack3 s = new Stack3();
	s.push(1);
	s.push(2);
	s.push(-1);
	System.out.println(s.min());
	s.pop();
	System.out.println(s.min());
	s.push(-2);
	System.out.println(s.min());
	s.pop();
	System.out.println(s.min());
	s.pop();
	System.out.println(s.min());
	s.pop();
    }
}


/**
 * Stack implemented with linkedlist
 */
/*class Stack {
    
    private LNode top = null;
    private int min = Integer.MAX_VALUE;
    
    public void push(int e) {
	top = new LNode(e, min, top);
	if(e < min) {
	    min = e;
	}
    }

    public int pop() {
	if(top == null) throw new UnsupportedOperationException("The stack is empty!");
	int v = top.value;
	min = top.min;
	top = top.next;
	return v;
    }

    public int min() {
	return min;
    }

    public int peek() {
	if(top == null) throw new UnsupportedOperationException("The stack is empty!");
	return top.value;
    }
    }*/

/**
 * Nodes of linkedlist to implement the stack
 */
/*class LNode {

    public int value = 0;
    public int min = 0;
    public LNode next = null;

    public LNode(int value, int min, LNode next) {
	this.value = value;
	this.min = min;
	this.next = next;
    }    

        
    } */

/**
 * Stack implemented with array
 */
/*class Stack1 {
    int[] baseArr = new int[100];
    int top = -1;
    int min = Integer.MAX_VALUE;
    int[] mins = new int[100];
    int index = -1;
    
    public void push(int e) {
	top++;
	baseArr[top] = e;
	if(index == -1) mins[++index] = e;
	else if(e <= mins[index]) mins[++index] = e; 
    }

    public int pop() {
	if(top == -1) throw new UnsupportedOperationException("The stack is empty!");
	int r = baseArr[top];
	if(mins[index] == r) index--;
	top--;
	return r;
    }

    public int peek() {
	if(top == -1) throw new UnsupportedOperationException("The stack is empty!");
	return baseArr[top];
    }

    public int min() {
	if(top == -1) throw new UnsupportedOperationException("The stack is empty!");
	return mins[index];
    }
    }*/

/**
 * Stack implemented using double integer node
 */
class Stack2 extends Stack<NodeWithMin> {

    public void push(int v) {
	int newMin = Math.min(min(), v);
	super.push(new NodeWithMin(v, newMin));
    }
    
    public int min() {
	if(this.isEmpty()) return Integer.MAX_VALUE;
	return this.peek().min;
    }
}


class NodeWithMin {

    public int value, min;

    public NodeWithMin(int value, int min) {
	this.value = value;
	this.min = min;
    }
}

class Stack3 extends Stack<Integer> {

    private Stack<Integer> s = new Stack<Integer>();

    public void push(int v) {
	if(v <= min()) {
	    s.push(v);
	}
	super.push(v);
    }

    public Integer pop() {
	int p = super.pop();
	if(p == s.peek()) s.pop();
	return p;
    }

    public int min() {
	if(isEmpty()) return Integer.MAX_VALUE;
	return s.peek();
    }
}

