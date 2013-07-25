public class MultiInterface extends A implements I, J{

    public static void main(String ... args) {
	System.out.println("This class has implemented a same interface twice.");
	new MultiInterface().printOut();
    }
}

class A implements I {
    public void printOut() {
	System.out.println("Method from A");
    }
}

interface I {

}

interface J {
    void printOut();
}