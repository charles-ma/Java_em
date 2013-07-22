public class FinalInherit {

    public void printF() {

    }

    public static void main(String ... args) {
	System.out.println("here");
    }
}

class Sub extends FinalInherit {
    @Override
    public final void printF() {
	
    }
}