import java.util.LinkedList;

public class C3Q42 {
    @SuppressWarnings("unchecked")
    private LinkedList<Integer>[] roles = new LinkedList[3];
    private int size = 0;
    
    public static void main(String... args) {
	new C3Q42(4).solve();
    }

    public C3Q42(int size) {
	if (size <= 0) throw new RuntimeException("Yon should at least have one plate!");
	this.size = size;
	for (int i = 0; i < roles.length; i++) {
	    roles[i] = new LinkedList<Integer>();
	}
	for (int i = 0; i < size; i++) {
	    roles[0].push(size - i);
	}
    }

    public void solve() {
	printRoles();
	move(0, 1, 2, size);
    }

    public void move(int start, int mid, int end, int num) {
	if (num == 1) {
	    roles[end].push(roles[start].pop());
	    printRoles();
	} else {
	    move(start, end, mid, num - 1);
	    move(start, mid, end, 1);
	    move(mid, start, end, num - 1);
	}
    }

    public void printRoles() {
	for (int i = 0; i < roles.length; i++) {
	    System.out.print("Role" + i + ": ");
	    for (int j : roles[i]) System.out.printf("%3d", j);
	    System.out.println();
	}
    }
}

