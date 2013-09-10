public class C5Q21 {
    public static void main(String... args) {
	System.out.println(intPart("12"));
	System.out.println(fraPart("25"));
	System.out.println(toBinary("15.625"));
    }

    public static String toBinary(String value) {
	String[] parts = value.split("\\.");
	return intPart(parts[0]) + "." + fraPart(parts[1]);
    }
    
    public static String intPart(String value) {
	int part = Integer.parseInt(value);
	StringBuilder sb = new StringBuilder();
	String sign = "+";
	if (part < 0) sign = "-";
	while (part != 0) {
	    sb.append(part % 2);
	    part = part / 2;
	}
	return sign + sb.reverse().toString();
    }

    public static String fraPart(String value) {
	Double part = Double.parseDouble("0." + value);
	StringBuilder sb = new StringBuilder();
	while (part != 0 && sb.length() < 32) {
	    part *= 2;
	    if (part >= 1) {
		sb.append("1");
		part -= 1;
	    } else sb.append("0");
	}
	return sb.toString();
    }
}
