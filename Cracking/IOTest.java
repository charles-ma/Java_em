import java.io.*;

public class IOTest {
    
    public static void main(String... args) {
	new IOTest().readFile();
    }

    public void readFile() {
	File f = new File("sample");
	BufferedReader textInput = null;
	PrintWriter textOutput = null;
	DataInputStream dataInput = null;
	try {
	    try {
		//decorator pattern
		textInput = new BufferedReader(new FileReader(f));		
		textOutput = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		dataInput = new DataInputStream(new FileInputStream(f));
		String line = null;
		while((line = textInput.readLine()) != null) {
		    System.out.println(line);
		    textOutput.println(line);
		}
	    } finally {
		textOutput.close();
		textInput.close();
	    }
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}