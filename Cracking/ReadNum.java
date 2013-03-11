import java.io.*;

class ReadNum {

    public static void main(String[] args) {
	try {
	    BufferedReader in = new BufferedReader(new FileReader("sample"));
	    int result = 0;
	    for(String s = in.readLine(); s != null; s = in.readLine()) {
		result += Integer.parseInt(s);
	    }
	    System.out.println(result);
	    in.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}