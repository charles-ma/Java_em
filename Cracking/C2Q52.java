public class C2Q52 {
    public static void main(String... args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	Node<Character> runner = head;
	Node<Character> runner1 = head;
	head.print();
	while (runner.getNext() != null) runner = runner.getNext();
	for (int i = 0; i < 3; i++) runner1 = runner1.getNext();
	runner.setNext(runner1);
	System.out.println(runner1.getData());
	System.out.println(getStart(head));
    }

    public static char getStart(Node<Character> head) {
	Node<Character> runner1 = head.getNext();
	Node<Character> runner2 = head.getNext().getNext();
	while (runner1 != runner2) {
	    runner1 = runner1.getNext();
	    runner2 = runner2.getNext().getNext();
	}
	runner2 = head;
	while (runner1 != runner2) {
	    runner1 = runner1.getNext();
	    runner2 = runner2.getNext();
	}
	return runner1.getData();
    }    
}