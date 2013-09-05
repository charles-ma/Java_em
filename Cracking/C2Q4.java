public class C2Q4 {
    public static void main(String [] args) {
	Node<Integer> head1 = LinkedListGenerator.createIntLinkedList(5);
	Node<Integer> head2 = LinkedListGenerator.createIntLinkedList(5);
	head1.print();
	head2.print();
	addTwoLinkedLists1(head1, head2).print();
    }
    
    public static Node<Integer> addTwoLinkedLists1(Node<Integer> head1, Node<Integer> head2) {
	return addTwoLinkedLists1(head1, head2, 0);
    }

    public static Node<Integer> addTwoLinkedLists1(Node<Integer> head1, Node<Integer> head2, int carrier) {
	if (head1 == null && head2 == null && carrier == 0) return null;
	int a = head1 != null ? head1.getData() : 0;
	int b = head2 != null ? head2.getData() : 0;
	Node<Integer> newHead = new Node<Integer>((a + b + carrier) % 10, null);
	carrier = (a + b + carrier) / 10;
	newHead.setNext(addTwoLinkedLists1(head1 != null ? head1.getNext() : null, head2 != null ? head2.getNext() : null, carrier));
	return newHead;
    }
}