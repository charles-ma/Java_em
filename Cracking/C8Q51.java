public class C8Q51 {
    public static void main(String... args) {
	printParen(3);
    }

    public static void printParen(int n) {
	printParen(n - 1, n, true, new StringBuilder());
    }

    public static void printParen(int l, int r, boolean lr, StringBuilder sb) {
	if (lr) sb.append("(");
	else sb.append(")");
	if (r == 0) {
	    System.out.println(sb.toString());
	    sb.deleteCharAt(sb.length() - 1);
	    return;
	}	
	if (l > 0) printParen(l - 1, r, true, sb);
	if (r - 1 >= l)printParen(l, r - 1, false, sb);
	sb.deleteCharAt(sb.length() - 1);
    }
    
}