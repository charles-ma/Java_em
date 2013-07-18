public class MultiInterface extends A implements I{

    public static void main(String ... args) {
	System.out.println("This class has implemented a same interface twice.");
    }
}

class A implements I {

}

interface I {

}