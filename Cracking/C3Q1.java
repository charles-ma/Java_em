import java.util.Arrays;

public class C3Q1 {
    private final static int aSize = 12;
    private static int[] baseArray = new int[aSize];

    public static void main(String... args) {
	Stack s1 = getStack(0);
	Stack s2 = getStack(1);
	Stack s3 = getStack(2);
	s1.push(1);
	s2.push(11);
	s3.push(111);
	s2.push(12);
	s2.push(13);
	s2.push(14);
	s2.push(15);
	s1.push(2);
	System.out.println(s1.pop());
	s1.push(3);
	System.out.println(s3.pop());
	System.out.println(s3.pop());
	System.out.println(Arrays.toString(baseArray));
    }

    public static Stack getStack(int index) {
	return new Stack(baseArray, index * aSize / 3, (index + 1) * aSize / 3 - 1);
    }

}

class Stack {
    private int[] baseArray = null;
    private int start = 0;
    private int end = 0;
    private int top = 0;

    public Stack(int[] baseArray, int start, int end) {
	this.baseArray = baseArray;
	this.start = start;
	this.end = end;
	top = start - 1;
    }

    public int pop() {
	if (top == start - 1) return Integer.MIN_VALUE;
	top -= 1;
	return baseArray[top + 1];
    }

    public boolean push(int value) {
	if (top == end) return false;
	top += 1;
	baseArray[top] = value;
	return true;
    }
}

