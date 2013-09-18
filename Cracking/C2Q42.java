public class C2Q42 {
    public static void main(String... args) {
	Node<Integer> head1 = LinkedListGenerator.createIntLinkedList(5);
	Node<Integer> head2 = LinkedListGenerator.createIntLinkedList(5);
	head1.print();
	head2.print();
	addLists(head1, head2, 0).print();
    }

    public static Node<Integer> addLists(Node<Integer> head1, Node<Integer> head2, int c) {
	if (head1 == null && head2 == null && c == 0) return null;
	int x = head1 == null ? 0 : head1.getData();
	int y = head2 == null ? 0 : head2.getData();
	Node<Integer> head = new Node<Integer>((x + y + c) % 10, null);
	head.setNext(addLists(head1 == null ? null : head1.getNext(), head2 == null ? null : head2.getNext(), (x + y + c) / 10));
	return head;
    }
}