class A {
    private int i = 0;
    private B ins = null;

    public static void main(String... args) {
	A sample = new A();
	sample.setField(new B());
	sample.printField();
    }
    
    public void printField() {
	A newIns = ins;
	System.out.println(newIns.i);
    }

    public void setField(B ins) {
	this.ins = ins;
    } 
    
}

class B extends A {
    private int i = 1;
}