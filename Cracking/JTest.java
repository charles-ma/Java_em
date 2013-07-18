import java.util.*;
import java.util.concurrent.locks.*;

public class JTest {
    public static void main(String ... args) {
	Collection<String> cs = new ArrayList<String>();
	cs.add("abc");
	//String[] b = (String[]) cs.toArray();
	Thread myThread = new Thread(new MyTask(0));
	Thread otherThread = new Thread(new MyTask(1));
	//myThread.start();
	//otherThread.start();
	int [] a = new int[3];
	for(int i : a) {System.out.println(i);}
	String[] b = new String[3];
	Object[] c = (Object[]) b;
    }
}

class MyTask implements Runnable {
    public static int i = 0;
    private int j = 0;
    private Lock myLock = new ReentrantLock();

    public MyTask(int j) {
	this.j = j;
    }

    public void run() {
	while(true) {
	    myLock.lock();
	    try {
		i = j;
		System.out.println("j:" + j + " i:" + i);
	    } finally {
		myLock.unlock();
	    }
	}
    }
}