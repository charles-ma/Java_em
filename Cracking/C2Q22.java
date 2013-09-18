public class C2Q22 {
    public static void main(String... args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	head.print();
	System.out.println(findEle(6, head));
    }

    public static char findEle(int n, Node<Character> head) {
	Node<Character> runner1 = head;
	Node<Character> runner2 = head;
	if (head == null) return '\0';
	for (int i = 0; i < n; i++) {
	    runner1 = runner1.getNext();
	    if (runner1 == null) return '\0';
	}
	while (runner1.getNext() != null) {
	    runner2 = runner2.getNext();
	    runner1 = runner1.getNext();
	}
	return runner2.getData();
    }
}