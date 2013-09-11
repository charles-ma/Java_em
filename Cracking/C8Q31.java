import java.util.*;

public class C8Q31 {
    public static void main(String... args) {
	Set<Integer> s = new HashSet<Integer>();
	for (int i = 0; i < 4; i++) s.add(i);
	for (Set<Integer> set : getSubSet(s)) {
	    for (int i : set) System.out.printf("%3d", i);
	    System.out.println();
	}
    }
    
    public static List<Set<Integer>> getSubSet(Set<Integer> s) {
	List<Set<Integer>> result = new ArrayList<Set<Integer>>();
	if (s.isEmpty()) return result;
	int value = 0;
	for (int i : s) {
	    value = i;
	    s.remove(i);
	    break;
	}
	List<Set<Integer>> subResult = getSubSet(s);
	for (Set<Integer> set : subResult) {
	    result.add(set);
	    Set<Integer> set1 = new HashSet<Integer>(set);
	    set1.add(value);
	    result.add(set1);
	}
	if (result.size() == 0) {
	    Set<Integer> set = new HashSet<Integer>();
	    set.add(value);
	    result.add(set);
	    result.add(new HashSet<Integer>());
	}
	return result;
    }
}