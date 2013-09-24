import java.util.*;

public class Pascal {
    public static void main(String... args) {
	printPascal(7);
    }

    public static void printPascal(int n) {
	List<Integer> line = new LinkedList<Integer>();
	line.add(1);
	if (n == 1) {
	    printList(line);
	    return;
	}
	for (int i = 2; i <= n + 1; i++) {
	    printList(line);
	    List<Integer> newLine = new LinkedList<Integer>();
	    for (int j = -1; j < line.size(); j++) {
		newLine.add(getValue(j, line) + getValue(j + 1, line));
	    }
	    line = newLine;
	}
    }

    public static void printList(List<Integer> l) {
	for (int i : l) System.out.printf("%3d", i);
	System.out.println();
    }

    public static int getValue(int i, List<Integer> list) {
	if (i == -1 || i == list.size()) return 0;
	return list.get(i);
    }
}