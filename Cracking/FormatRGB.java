class FormatRGB {
    public static void main(String[] args) {
	formatRGB(255, 16, 1);
    }
    
    public static void formatRGB(int r, int g, int b) {
	System.out.println((toHex(r) + toHex(g) + toHex(b)).toUpperCase());
    }

    public static String toHex(int c) {
	String s = Integer.toHexString(c);
	return s.length() == 1? "0" + s : s;
    }
}
