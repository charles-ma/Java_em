public class C2Q4 {
    public static void main(String [] args) {
	Node<Integer> head1 = LinkedListGenerator.createIntLinkedList(5);
	Node<Integer> head2 = LinkedListGenerator.createIntLinkedList(5);
	head1.print();
	head2.print();
	addTwoLinkedLists(head1, head2, 0);
	head1.print();
    }
    
    /*public static Node<Integer> addTwoLinkedLists(Node<Integer> head1, Node<Integer> head2, int carrier) {
	if(head1 == null || head2 == null) return null; 
	int result = head1.getData() + head2.getData() + carrier;
	head2.setData(result % 10);
	carrier = result / 10;
	if(head2.getNext() == null && carrier != 0) {
	    Node<Integer> node = new Node<Integer>(carrier, null);
	    head2.setNext(node);
	    return head2;
	}
	addTwoLinkedLists(head1.getNext(), head2.getNext(), carrier);
	return head2;
	}*/
    
    public static Node<Integer> addTwoLinkedLists(Node<Integer> head1, Node<Integer> head2, int carrier) {
	int result = head1.getData() + head2.getData() + carrier;
	carrier = result / 10;
	result = result % 10;
	head1.setData(result);
	if(head1.getNext() != null && head2.getNext() != null) {
	    addTwoLinkedLists(head1.getNext(), head2.getNext(), carrier);
	} else {
	    if(head1.getNext() != null) head1.getNext().setData(carrier + head1.getNext().getData());
	    else if(head2.getNext() != null) head1.setNext(new Node<Integer>(carrier + head2.getNext().getData(), null));
	    else if(carrier == 1) head1.setNext(new Node<Integer>(carrier, null));
	}
	return head1;
    }
}