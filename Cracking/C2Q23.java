public class C2Q23 {
    public static void main(String... args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	head.print();
	System.out.println(findElement(head, 9));
    }

    public static char findElement(Node<Character> head, int n) {
	Node<Character> runner = head;
	for (int i = 0; i < n; i++) {
	    runner = runner.getNext();
	    if (runner == null) return '\0';
	}
	while (runner.getNext() != null) {
	    head = head.getNext();
	    runner = runner.getNext();
	}
	return head.getData();
    }
}