public class DynamicBindingTest {
    public static void main(String ... args) {
	P.printName();
	C.printName();
	new P().printName();
	new C().printName();
	P a = new C();
	a.printName();
	/*P b = new P();
	C d = (C)b;
	b.printName();*/
    } 
}

class P {
    public static int a = 0;
    public static void printName() {
	System.out.println(a);
    }
}

class C extends P {
    public static int b = 1;
    public static void printName() {
	System.out.println(a - b);
    }
}