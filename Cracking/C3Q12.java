class Stacks {
    public static void main(String... args) {
	Stacks ss = new Stacks(6);
	ss.printArray();
	Stack[] sa = ss.getStacks();
	sa[0].push(1);
	sa[0].push(3);
	sa[0].push(6);
	ss.printArray();
	sa[1].push(2);
	ss.printArray();
	System.out.println(sa[0].pop());
	sa[0].push(6);
	ss.printArray();
	System.out.println(sa[1].pop());
	System.out.println(sa[1].pop());
    }

    private int size = 0;
    private int[] a = null;  
    private Stack[] stackArray = new Stack[3];

    public Stacks(int size) {
	this.size = size;
	a = new int[size];
	stackArray[0] = new Stack(a, 0, size / 3);
	stackArray[1] = new Stack(a, size / 3, size * 2 / 3);
	stackArray[2] = new Stack(a, size * 2 / 3, size);
    }

    public void printArray() {
	for (int i : a) System.out.printf("%3d", i);
	System.out.println();
    }

    public Stack[] getStacks() {
	return stackArray;
    }

    class Stack {
	private int[] a = null;
	private int start = 0;
	private int end = 0;
	private int top = 0;

	public Stack(int[] a, int start, int end) {
	    this.a = a;
	    this.start = start;
	    this.end = end;
	    top = start;
	}

	public boolean push(int v) {
	    if (top != end) {
		a[top++] = v;
		return true;
	    }
	    return false;
	}

	public int pop() {
	    if (top != start) return a[--top];
	    return Integer.MIN_VALUE;
	}
    }
}