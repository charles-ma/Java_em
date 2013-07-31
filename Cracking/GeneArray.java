public class GeneArray {

    //java compiler will not auto-boxing arrays of primitive types
    public static void main(String... args) {
	//int[] a = {1, 2, 3};
	String[] a = {"a", "b", "c"};
	String b  = GeneArray.<String>getMid(a);
	System.out.println(GeneArray.<Number>getMid(1, 2.0, 3));
	System.out.println(getMid(a));
	new SubGeneArray().setName("a", "b");
	new GeneArray().setName("c", "d");
	new SubGeneArray().setName(new String[]{"a", "b", "c"});
	SubGeneArray sb = new SubGeneArray();
	sb.setName("a", "b");
	//GeneArray as = new SubGeneArray();
	//as.setName("a", "b");
    }
    
    public static <T> T getMid(T... a) {
	return a[a.length / 2];
    }

    public void setName(String... names) {
	System.out.println("GeneArray!");
    }
}

class SubGeneArray extends GeneArray {
    @Override
    public void setName(String[] names) {
	System.out.println("SubGeneArray!");
    }
}