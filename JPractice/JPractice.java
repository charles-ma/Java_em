import java.io.*;
import java.util.*;

public class JPractice {

    private int f = 0;
    private int g = 5;
    private final int a;
    private int b;
    private static int c;
    static int[][] twoD;    
    static
    {//will be excecuted before the main function
	c = 3;
	System.out.println("Hello World!");
	//	System.exit(0);
    }

    {
	this.a = 1;//initialization block, it's legal and will be executed before the constructors
	this.b = 0;
    }

    public static void main(String args[]){
	SelfContain s = new SelfContain();
	System.out.println(s.s.s.s.s.s.s == s.s);
	//	System.exit(0);
	JPractice practice = new JPractice();
    	practice.execute();
	ArrayList<List<String>> a = new ArrayList<List<String>>();
	a.add(new ArrayList<String>());
	arrayIsObj(new int[20]);
	int[] b = new int[20];
	b.equals(a);
	System.out.println(twoD);
	ArrayList<?> noType = new ArrayList<String>();
    }

    public static void arrayIsObj(Object o) {
	
    }

    /**
     *Constructor for JPractice
     */
    public JPractice(){
	
    }

    /**
     *Put anything you want executed here.
     */
    public void execute(){
	System.out.println(this.catExcep());
	System.out.println(c);
    }

    public <T> T[] toArray(T[] a) {
	return a;
    }

    /**
     *Experiment about try catch finally 
     */              
    public int catExcep(){
	try{
	    this.throwExcep();
	    return this.f++;
	}
	catch(IOException e){
	    e.printStackTrace();
	    //System.exit(0);//exit java virtual machine will terminate the whole process and won't let finally be executed
	    return this.f++;
	}finally{
	    //finally will be executed before the return statement in try and catch block
	    this.f++;
	    System.out.println(this.f);
	    //return this.f;
	}
	//employee a = new employee();
	//employee b = new employee();
	//System.out.println(a.equals(b));
	//return this.g;
    }
    
    /**
     *throws an exception
     */
    public void throwExcep() throws IOException{
	throw new IOException();
    }
}

//sample class
class employee {
    
    private final int i;//final variable cannot be changed after initialization, i can only be initialized at declaration or in the constructor, i won't be set to default value if not explicitly initialized
    private static int j;//j will be shared by all the instances of this class but j can be changed after initialization, a little confusing with the function of final, j will be set to default value if not explicitly initialized
    private int k;//k will be initialized to its default value 0

    /**
     *Constructor
     */
    public employee(){
	i = 1;
	System.out.println(k);
	System.out.println(j);
    }

    /**
     *method in a class can call variables of any instance of this class, say, equals can call other.i and this.i
     */
    public boolean equals(employee other){
	System.out.println(this.i);
	return this.i == other.i;
    }

}

/**
 *This class includes self-contained constructor, can't be initialized normally
 */
class SelfContain {
    static SelfContain s = new SelfContain();
    public SelfContain() {

    }
}