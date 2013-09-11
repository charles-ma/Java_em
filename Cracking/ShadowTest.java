class A {
    public static void main(String... args) {
	A v = new A();
	A v1 = new B();
	v.a();
	v1.a();
    }

    private void a() {
	System.out.println("a");
    }
}

class B extends A {
    private void a() {
	System.out.println("b");
    }
}