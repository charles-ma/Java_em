import java.util.*;

class C8Q3 {
    public static void main(String[] args) {
	TreeSet<Integer> s = new TreeSet<Integer>();
	ArrayList<Integer> a = new ArrayList<Integer>();
	for(int i = 0; i < 3; i++) {
	    s.add(i);
	    a.add(i);
	}
	ArrayList<Set<Integer>> l = findSubsets(s);
	ArrayList<ArrayList<Integer>> ll = findSubsets1(a);
	/*	for(int i = 0; i < l.size(); i++) {
	    if(l.get(i).size() == 0) System.out.print(" e");
	    for(int j : l.get(i)) {
		System.out.print(String.format("%2d", j));
	    }
	    System.out.println();
	    }*/
	for(int i = 0; i < ll.size(); i++) {
	    if(ll.get(i).size() == 0) System.out.print(" e");
	    for(int j : ll.get(i)) {
		System.out.print(String.format("%2d", j));
	    }
	    System.out.println();
	}
    }

    /**
     * Find all the subsets using recursion
     */
    public static ArrayList<Set<Integer>> findSubsets(Set<Integer> s) {
	ArrayList<Set<Integer>> result = new ArrayList<Set<Integer>>();
	Iterator<Integer> it = s.iterator();
	int e = 0;
	if(it.hasNext()) e = it.next();
	else {
	    result.add(s);
	    return result;
	}
	s.remove(e);
	ArrayList<Set<Integer>> sub = findSubsets(s);
	result.addAll(sub);
	int size = result.size();
	for(int i = 0; i < size; i++) {
	    Set<Integer> ele = new TreeSet(result.get(i));
	    ele.add(e);
	    result.add(ele);
	}
	return result;
    }

    /**
     * Find all the subsets using a bit representation
     */
    public static ArrayList<ArrayList<Integer>> findSubsets1(ArrayList<Integer> s) {
	int mask = 1 << s.size();
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	for(int i = 0; i < mask; i++) {
	    ArrayList<Integer> sub = new ArrayList<Integer>();
	    for(int j = 0; j < s.size(); j++) {
		if(((1 << j) & i) != 0) sub.add(s.get(j));
	    }
	    result.add(sub);
	}
	return result;
    }
}

