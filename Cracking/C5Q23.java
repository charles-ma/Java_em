import java.util.*;

public class C5Q23 {
    public static void main(String... args) {
	System.out.println(getString("23.5"));
    }

    public static String getString(String s) {
	String[] ss = s.split("\\.");
	return getIntString(ss[0]) + "." + getFraString(ss[1]);
    }

    public static String getIntString(String s) {
	int n = Integer.parseInt(s);
	StringBuilder sb = new StringBuilder();
	if (n == 0) return "0";
	while (n != 0) {
	    sb.append(n % 2);
	    n = n / 2;
	}
	return sb.reverse().toString();
    }

    public static String getFraString(String s) {
	double d = Double.parseDouble("0." + s); 
	StringBuilder sb = new StringBuilder();
	while (d != 0) {
	    d = d * 2;
	    sb.append(d >= 1 ? 1 : 0);
	    d -= 1;
	}
	return sb.reverse().toString();
    }
}