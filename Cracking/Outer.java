/**
 * Experiment class for inner class(ordinary inner class, static inner class and local inner class)
 */
public class Outer {
    
    private int i = 0;
    private static int k = 6;

    /**
     * static inner class
     */
    private static class StaInn {
	public int getValue() {
	    return k;
	}
    }

    /**
     * ordinary inner class
     */
    private class Inner {
	public int getValue() {
	    return i;
	}
	
	public void addOne() {
	    i++;
	}
    }

    public int getValue() {
	return i;
    }

    public int inValue() {
	return new Inner().getValue();
    }

    public void addOne() {
	i++;
    }

    public Inner getIn() {
	return new Inner();
    }

    public void funIn() {
	final int j = 0;
	/**
	 * local inner class
	 */
	class FuncIn {
	    public int value() {
		return j;
	    }
	}
	System.out.println(new FuncIn().value());
    }
    
    /**
     * utility method to get formatted strings
     */
    private String formString(int i, int j) {
	return "The value from inner class is : " + i + "\nThe value from outer class is : " + j;
    }
 
    public static void main(String... args) {
	Outer outer = new Outer();
	Inner inner = outer.new Inner();
	System.out.println(outer.formString(inner.getValue(), outer.getValue()));
	outer.addOne();
	System.out.println(outer.formString(inner.getValue(), outer.getValue()));
	inner.addOne();
	System.out.println(outer.formString(inner.getValue(), outer.getValue()));
	System.out.println(new StaInn().getValue());
    } 
}