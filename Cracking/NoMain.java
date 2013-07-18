public class NoMain {
    public static int j;
    static {
	int i = 0;
	j = 1;
	System.out.println("There is no main function!");
	System.exit(0);
    }
}