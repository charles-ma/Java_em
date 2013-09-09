import java.util.*;

public class C4Q4 {
    public static void main(String... args) {
	BTree root = BTree.createInstance(7, true);
	root.print();
	for (List<BTree> list : getNodeByLevel(root)) {
	    for (BTree node : list) {
		System.out.printf("%2d", node.getValue());
	    }
	    System.out.println();
	}
	for (int i = 0; i < BTree.getDepth(root); i++) {
	    for (BTree node : getLevelList(root, i)) System.out.printf("%2d", node.getValue());
	    System.out.println();
	}
    }

    public static List<List<BTree>> getNodeByLevel(BTree root) {
	List<List<BTree>> result = new ArrayList<List<BTree>>();
	if (root == null) return null;
	List<BTree> levelList = new ArrayList<BTree>();
	levelList.add(root);
	while (levelList != null) {
	    result.add(levelList);
	    levelList = getLevelList(levelList);
	}
	return result;
    }

    public static List<BTree> getLevelList(List<BTree> ll) {
	List<BTree> result = new ArrayList<BTree>();
	if (ll == null || ll.size() == 0) return null;
	for (BTree node : ll) {
	    if (node.getLeft() != null) result.add(node.getLeft());
	    if (node.getRight() != null) result.add(node.getRight());
	}
	return result;
    }

    public static List<BTree> getLevelList(BTree root, int level) {
	List<BTree> result = new ArrayList<BTree>();
	if (root == null || level > BTree.getDepth(root) || level < 0) return result;
	if (level == 0) {
	    result.add(root);
	    return result;
	}
	for (BTree node : getLevelList(root.getLeft(), level - 1)) result.add(node);
	for (BTree node : getLevelList(root.getRight(), level - 1)) result.add(node);
	return result;
    }

}