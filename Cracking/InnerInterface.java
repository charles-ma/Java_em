public class InnerInterface {

    public static void main(String... args) {
	A b = new InnerInterface().new B();
	System.out.println(b.a);
	C c = new C();
	System.out.println(InnerInterface.B.a);
    }

    private interface A {
	int a = 0;
	public void getA(String a);
    }

    public class B implements A {
	public void getA(String a) {

	}
    }
}

class C {

    public InnerInterface.B b = new InnerInterface().new B();
    
    public C() {
	System.out.println("Output from C: " + InnerInterface.B.a);
    }
}
