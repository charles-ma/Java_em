import java.util.*;

public class C3Q4 {
    Stack<HaNode> stack1 = new Stack<HaNode>();
    Stack<HaNode> stack2 = new Stack<HaNode>();
    
    public static void main(String[] args) {
	new C3Q4().run(4);
    }

    public void run(int n) {
	HaNode node = new HaNode(1, 2, 3, n);
	stack1.push(node);
	while(!stack1.isEmpty()) {
	    HaNode curr = stack1.pop();
	    if(curr.ope != null) stack2.push(curr);
	    else {
		if(curr.num == 1) {
		    stack1.push(new HaNode(curr.start, curr.end));
		} else {
		    stack1.push(new HaNode(curr.start, curr.end, curr.mid, curr.num - 1));//The order of pushes matters! Now is the reverse order of logic
		    stack1.push(new HaNode(curr.start, curr.end));
		    stack1.push(new HaNode(curr.mid, curr.start, curr.end, curr.num - 1));
		}
	    }
	}
	while(!stack2.isEmpty()) {
	    System.out.println(stack2.pop().ope);
	}
    }
}

class HaNode {
    public int start = 0;
    public int mid = 0;
    public int end = 0;
    public int num = 0;
    public String ope = null;
    
    public HaNode(int start, int end) {
	ope = "Move one plate from " + start + " to " + end;
    }
    
    public HaNode(int start, int mid, int end, int num) {
	this.start = start;
	this.mid = mid;
	this.end = end;
	this.num = num;
    }
}