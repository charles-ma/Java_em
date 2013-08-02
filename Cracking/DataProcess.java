import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class DataProcess {

    private Map<String, Integer> keys = new HashMap<String, Integer>();
    private int keyIndex = 0;

    /**
     * Parse the whole data file
     */
    public void parseFile(String fileName) {
	BufferedReader input = null;
	Writer output = null;
	String line = null;
	try {
	    try{
		input = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		output = new BufferedWriter(new FileWriter("output.txt", true));
		int count = 1;
		while((line = input.readLine()) != null) {
		    output.append(parseLine(line, count++) + "\n");
		}
		output.append(getEndString());
	    } finally {
		input.close();
		output.close();
	    }
	} catch(IOException ioe) {
	    System.out.println("Error happened");
	}
    }

    /**
     * Get the titles of columns
     */
    private String getEndString() {
	Set<Map.Entry<String, Integer>> entries = keys.entrySet();
	String[] keyArray = new String[entries.size() + 1];
	keyArray[0] = " ";
	StringBuilder sb = new StringBuilder();
	for(Map.Entry entry : entries) {
	    keyArray[(Integer)entry.getValue() + 1] = (String)entry.getKey();
	}
	for(String key : keyArray) {
	    sb.append(key + "\t");
	}
	return sb.toString();
    }

    /**
     * Parse one line
     */
    public String parseLine(String line, int lineNum) {
	String[] pairs = getQueryString(line).split("&");
	String[] result = new String[30];
	StringBuilder sb = new StringBuilder(lineNum + "\t");
	for(String pair : pairs) {
	    if(!pair.equals("")) {
		String[] kv = pair.split("=");
		if(kv.length == 2) {
		    String key = kv[0];
		    String value = kv[1];
		    if(!keys.containsKey(key)) keys.put(key, keyIndex++);
		    result[keys.get(key)] = value;
		}
	    }
	}
	for(String item : result) {
	    if(item == null) sb.append(" \t");
	    else sb.append(item + "\t");
	}
	return sb.toString();
    }

    /**
     * Get the query strings from the file
     */
    public String getQueryString(String rawLine) {
	String queryString = rawLine.split("\t")[1];
	queryString = queryString.split("\\?")[1];
	if(queryString.charAt(queryString.length() - 1) == '"') queryString = queryString.substring(0, queryString.length() - 1);
	return queryString;
    }

    /**
     * App entrance
     */
    public static void main(String... args) {
	if(args.length == 0) new DataProcess().parseFile("Workbook1.txt");
	else new DataProcess().parseFile(args[0]);
    }

}