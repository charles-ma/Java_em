public class methodTest {
    public static void main(String... args) {
	new methodTest().b();
	new subClass().b();
    }

    protected void a() {
	System.out.println("a method");
    }

    public void b() {
	this.a();
    }
}

class subClass extends methodTest {
    @Override
    protected void a() {
	System.out.println("override a method");
    }
}