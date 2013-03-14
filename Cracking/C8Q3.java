import java.util.*;

class C8Q3 {
    public static void main(String[] args) {
	TreeSet<Integer> s = new TreeSet<Integer>();
	for(int i = 0; i < 3; i++) {
	    s.add(i);
	}
	ArrayList<Set<Integer>> l = findSubsets(s);
	for(int i = 0; i < l.size(); i++) {
	    if(l.get(i).size() == 0) System.out.print(" e");
	    for(int j : l.get(i)) {
		System.out.print(String.format("%2d", j));
	    }
	    System.out.println();
	}
    }

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
}

