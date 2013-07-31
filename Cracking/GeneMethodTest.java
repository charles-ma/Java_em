public class GeneMethodTest {
    
    public static void main(String... args) {
	GeneMethodTest gt = new GeneMethodTest();
	System.out.println(gt.echo(1));
	String s = gt.echo("abc");
	System.out.println(gt.echo("abc").getClass());
	gt.<String>echoV();
	gt.<String>echoV().getClass();
	//System.out.println(gt.<String>echoV().getClass());
    }
    
    public <T> T echo(T t) {
	return t;
    }

    public <T> T echoV() {
	T t = (T)(new Object());
	//System.out.println(t.getClass());
	return t;
    }
}