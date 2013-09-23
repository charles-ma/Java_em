import java.util.*;

public class C8Q32 {
    public static void main(String... args) {
	Set<Integer> s = new HashSet<Integer>();
	for (int i = 0; i < 3; i++) s.add(i);
	LinkedList<Set<Integer>> result = getSubSets(s);
	for (Set<Integer> set : result) {
	    for (int i : set) System.out.printf("%2d", i);
	    System.out.println();
	}
	System.out.println();
    }
    
    public static LinkedList<Set<Integer>> getSubSets(Set<Integer> s) {
	Iterator<Integer> i = s.iterator();
	int e = 0;
	LinkedList<Set<Integer>> result = new LinkedList<Set<Integer>>();
	if (!i.hasNext()) {
	    HashSet<Integer> em = new HashSet<Integer>();
	    result.add(em);
	    return result;
	}
	e = i.next();
	s.remove(e);
	LinkedList<Set<Integer>> subsets = getSubSets(s);
	for (Set<Integer> set : subsets) {
	    result.add(set);
	    Set<Integer> nSet = new HashSet<Integer>(set);
	    nSet.add(e);
	    result.add(nSet);
	}
	return result;
    }
}