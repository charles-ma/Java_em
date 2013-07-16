import java.util.Arrays;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Tree<T> {
    
    private T value = null;
    private List<Tree<T>> children = null;

    public Tree(T value, Tree<T>... children) {
	this.value = value;
	this.children = new ArrayList<Tree<T>>(Arrays.asList(children));
    }

    public T getValue() {
	return value;
    }

    public List<Tree<T>> getChildren() {
	return children;
    }

    public void setValue(T value) {
	this.value = value;
    }

    public void addChild(Tree<T> child) {
	children.add(child);
    }

    public void addChildren(Collection<Tree<T>> children) {
	this.children.addAll(children);
    }

    public void removeChild(Tree<T> child) throws RuntimeException{
	if(children.contains(child)) children.remove(child);
	else throw new RuntimeException("No children for this tree");
    }

    public void removeChildren(Collection<Tree<T>> children) {
	this.children.removeAll(children);
    }

    public int getChildrenNumber() {
	return children.size();
    }

    @Override
    public String toString() {
	return "Tree, value: " + value + "; children number: " + children.size();
    }

}