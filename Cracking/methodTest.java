public class methodTest {
    public static void main(String... args) {
	methodTest m = new methodTest();
	m.b();
	subClass s = new subClass();
	s.b();
	methodTest a = new subClass();
	a.b();
    }

    private void a() {
	System.out.println("a method");
    }

    public void b() {
	this.a();
    }
}

class subClass extends methodTest {
    private void a() {
	System.out.println("override a method");
    }

    @Override
    public void b() {
	this.a();
    }
    
}