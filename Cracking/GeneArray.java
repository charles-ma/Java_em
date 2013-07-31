public class GeneArray {

    //java compiler will not auto-boxing arrays of primitive types
    public static void main(String... args) {
	//int[] a = {1, 2, 3};
	String[] a = {"a", "b", "c"};
	System.out.println(getMid(a));
    }
    
    public static <T> T getMid(T[] a) {
	return a[a.length / 2];
    }
}