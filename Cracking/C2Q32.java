public class C2Q32 {
    public static void main(String... args) {
	Node<Character> head = LinkedListGenerator.createCharLinkedList(10);
	head.print();
	Node<Character> node = getNode(6, head);
	System.out.println(node.getData());
	removeNode(node);
	head.print();
    }

    public static Node<Character> getNode(int n, Node<Character> head) {
	for (int i = 0; i < n; i++) head = head.getNext();
	return head;
    }
    
    public static void removeNode(Node<Character> node) {
	node.setData(node.getNext().getData());
	node.setNext(node.getNext().getNext());
    }
}