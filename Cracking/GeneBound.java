import java.io.Serializable;

public class GeneBound {
    public static void main(String... args) {
	System.out.println("This is a generic class with two bounds!");
	new GeneTwoBounds<String>();
    }
}

class GeneTwoBounds<T extends Serializable & Comparable> {
    public void exeFun(T t1, T t2) {
	t1.compareTo(t2);
    }
}