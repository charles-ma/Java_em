import java.util.*;

class C8Q4 {
    public static void main(String[] args) {
	ArrayList<String> result = findPermu("abc");
	for(int i = 0; i < result.size(); i++) {
	    System.out.println(result.get(i));
	}
    }

    public static ArrayList<String> findPermu(String s) {
	ArrayList<String> result = new ArrayList<String>();
	if(s.length() == 1) {
	    result.add(s);
	    return result;
	}
	char c = s.charAt(0);
	ArrayList<String> sub = findPermu(s.substring(1));
	for(int i = 0; i < sub.size(); i++) {
	    String str = sub.get(i);
	    for(int j = 0; j <= str.length(); j++) {
		result.add(str.substring(0, j) + c + str.substring(j));
	    }
	}
	return result;
    }
}