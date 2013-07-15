import java.util.*;

public class JTest {
    public static void main(String ... args) {
	Collection<String> cs = new ArrayList<String>();
	cs.add("abc");
	//String[] b = (String[]) cs.toArray();
	Thread myThread = new Thread(new MyTask());
	myThread.start();
	for(int i = 0; i < 10000; ++i) {
	    System.out.println(i);
	}
    }
}

class MyTask implements Runnable {
    public void run() {
	System.exit(0);
    }
}