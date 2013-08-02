import java.io.*;
import java.net.*;
import java.util.*;

public class Make {
    
    public static void main(String... args) {
	String queryString = "Google";
	if (args.length >= 1) queryString = args[0];
	new Make().connectWiki(queryString);
    }

    public static String parseUrl(String url) {
	return url;
    }

    public void connectWiki(String queryString) {
	Socket s = null;
	try {
	    try {
		s = new Socket("en.wikipedia.org", 80);
		sendRequest(s.getOutputStream(), queryString);
		display(s.getInputStream());
	    } finally {
		if (s != null) s.close();
	    } 
	} catch (UnknownHostException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public void sendRequest(OutputStream output, String queryString) {
	PrintWriter pw = new PrintWriter(output);
	String message = "GET /wiki/" + queryString  + " HTTP/1.1 \r\nHost: en.wikipedia.org\r\nConnection: keep-alive\r\nCache-Control: no-cache\r\nAccept: text/html\r\nUser-Agent: Mozilla/5.0\r\n\r\n";
	System.out.println(message);
	pw.println(message);
	pw.flush();
    }
    
    public void display(InputStream input) {
	Scanner scanner = new Scanner(input);
	while (scanner.hasNextLine()) {
	    String line = scanner.nextLine();
	    System.out.println(line);
	}
    }
}