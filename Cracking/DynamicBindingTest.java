public class DynamicBindingTest {
    public static void main(String ... args) {
	P.printName();
	C.printName();
	new P().printName();
	new C().printName();
	P a = new C();
	a.printName();
	a.dynaPrint();
	C c = new C();
	c.printD();
	P[] arrayP = new C[1];
	arrayP[0] = new C();
	C[] arrayC = (C[]) arrayP;
	System.out.println(arrayC instanceof P[]);
	Object[] o = new Object[2];
	//String[] s = (String[]) o;
    } 
}

class P {
    public static int a = 0;
    protected int pr = 5;
    public static void printName() {
	System.out.println(a);
    }
    public static void printName(String s) {

    }
    public void dynaPrint() {
	printName();
    }

}

class D extends P {
    
}

class C extends P {
    public static int b = 1;
    private D d = new D();
    
    public void printD() {
	System.out.println(d.pr);
    }

    public static void printName() {
	System.out.println(a - b);
    }

    public void dynaPrint() {
	printName();
	System.out.println("dynamic binding");
    }
}

