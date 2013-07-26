public class AbTest {
    public void a() {
	System.out.println("From AbTest!");
    }

    public static void main(String... args) {
	new AbTest().a();
	new AbConcrete().a();
    }
}

abstract class AbInherited extends AbTest {
    public abstract void a();
}

class AbConcrete extends AbInherited {
    public void a() {
	System.out.println("From AbConcrete!");
    }
}
