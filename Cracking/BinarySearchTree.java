public class BinarySearchTree<T extends Comparable<T>> extends Tree<T>{

    @SuppressWarnings("unchecked")
    public BinarySearchTree(T value, BinarySearchTree<T> left, BinarySearchTree<T> right) {
	super(value, left, right);
    }

    @SuppressWarnings("unchecked")
    public BinarySearchTree(T value) {
	super(value);
    }

    public BinarySearchTree<T> getLeftChild() {
	return getChild(false);
    }

    public BinarySearchTree<T> getRightChild() {
	return getChild(true);
    }

    private BinarySearchTree<T> getChild(boolean right) {
	BinarySearchTree<T> rightChild = null;
	BinarySearchTree<T> leftChild = null;
	for(Tree<T> child : getChildren()) {
	    if(child.getValue().compareTo(getValue()) <= 0) leftChild = (BinarySearchTree<T>)child;
	    else rightChild = (BinarySearchTree<T>)child;
	}
	return right? rightChild : leftChild;
    }

    public void addNode(T value) {
	if(value.compareTo(getValue()) <= 0) {
	    if(getLeftChild() == null) getChildren().add(new BinarySearchTree<T>(value));
	    else getLeftChild().addNode(value);
	} else {
	    if(getRightChild() == null) getChildren().add(new BinarySearchTree<T>(value));
	    else getRightChild().addNode(value);
	}
    }

    public static void main(String... args) {
	BinarySearchTree<Integer> root = new BinarySearchTree<Integer>(1);
	root.addNode(-1);
	root.addNode(5);
	System.out.println(root.getLeftChild() + "\n" + root.getRightChild());
    }

}