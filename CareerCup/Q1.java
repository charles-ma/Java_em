import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
	int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	Tree<Integer> resultTree = makeTree(sortedArray);
	resultTree.print();
    }

    public static Tree<Integer> makeTree(int[] sortedArray) {
	return makeTree(sortedArray, 0, sortedArray.length - 1);
    }

    private static Tree<Integer> makeTree(int[] sortedArray, int start, int end) {
	if(start <= end) {
	    int mid = (start + end) / 2;
	    Tree<Integer> tree = new Tree<Integer>(sortedArray[mid]);
	    tree.setLeftChild(makeTree(sortedArray, start, mid - 1));
	    tree.setRightChild(makeTree(sortedArray, mid + 1, end));
	    return tree;
	} else {
	    return null;
	}
    }
}

class Tree<T> {

    private Tree<T> rightChild = null;
    private Tree<T> leftChild = null;
    private T value = null;
    private LinkedList<Tree<T>> trees = new LinkedList<Tree<T>>();

    public Tree(T value) {
	this.value = value;
    }

    public void print() {
	trees.addLast(this);
	trees.addLast(new Tree<T>(null));
	while(trees.size() != 0) {
	    Tree<T> tree = trees.removeFirst();
	    if(tree.value != null) {
		System.out.print(tree.value.toString() + " ");
		if(tree.leftChild != null) trees.addLast(tree.leftChild);
		if(tree.rightChild != null) trees.addLast(tree.rightChild);
	    } else {
		System.out.println();
		if(trees.size() != 0) trees.addLast(new Tree<T>(null));
	    }
	}
    }

    public void setRightChild(Tree<T> tree) {
	rightChild = tree;
    }

    public void setLeftChild(Tree<T> tree) {
	leftChild = tree;
    }
}
