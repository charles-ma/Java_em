import java.util.*;

class C8Q4 {
    public static void main(String[] args) {
	ArrayList<String> result = findPermu("abc");
	for(int i = 0; i < result.size(); i++) {
	    System.out.println(result.get(i));
	}
    }

    /*    public static ArrayList<String> findPermu(String s) {
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

    public static ArrayList<String> findPermu1(String s) {
	ArrayList<String> result = new ArrayList<String>();
	if(s.length == 1) {
	    result.add(s);
	    return result;
	}
	char c = s.charAt(0);
	ArrayList<Strng> sub = findPermu1(s.substring(1));
	for(int i = 0; i < sub.size(); i++) {
	    String ss = sub.get(i);
	    for(int j = 0; j <= ss.length(); j++) {
		result.add(ss.substring(0, j) + c + ss.substring(j));
	    }
	}
	return result;
	}*/
    
    public static ArrayList<String> findPermu(String s) {
	ArrayList<String> result = new ArrayList<String>();
	if(s.length() == 0 || s.length() == 1) {
	    result.add(s);
	    return result;
	}
	char c = s.charAt(0);
	String sub = s.substring(1);
	ArrayList<String> subresult = findPermu(sub);
	for(int i = 0; i < subresult.size(); i++) {
	    String ss = subresult.get(i);
	    for(int j = 0; j <= ss.length(); j++) {
		result.add(ss.substring(0, j) + c + ss.substring(j));
	    }
	}
	return result;
    }
}