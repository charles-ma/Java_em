public class C5Q22 {
    public static void main(String... args) {
	System.out.println(toBinary("12.75"));
    }

    public static String toBinary(String d) {
	String[] parts = d.split("\\.");
	String intPart = parts[0];
	String fraPart = parts[1];
	return bInt(intPart) + "." + bFra(fraPart);
    }

    public static String bFra(String s) {
	double v = Double.parseDouble("0." + s);
	StringBuilder sb = new StringBuilder();
	int count = 0;
	while (v != 0 && count < 30) {
	    sb.append(v * 2 >= 1 ? 1 : 0);
	    v = v * 2 >= 1 ? v * 2 - 1 : v * 2;
	    count++;
	}
	return sb.toString();
    }

    public static String bInt(String s) {
	int v = Integer.parseInt(s);
	StringBuilder sb = new StringBuilder();
	while (v != 0) {
	    sb.append(v % 2);
	    v /= 2;
	}
	return sb.reverse().toString();
    }
}