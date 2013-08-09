import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {

    public static void main(String... args) {

	String sourcePath = "";
	String desPath = "./";

	if (args.length == 0) {
	    System.exit(0);
	} else if (args.length == 1) {
	    sourcePath = args[0];
	} else {
	    sourcePath = args[0];
	    desPath = args[1];
	} 

	new Copy().doCopy(sourcePath, desPath);
    }

    public void doCopy(String sourcePath, String desPath) {
	File sourceFile = new File(sourcePath);
	if (sourceFile.isDirectory()) {
	    File[] subFiles = sourceFile.listFiles();
	    for (File subFile : subFiles) {
		new File(desPath + File.separator + sourceFile.getName()).mkdir();
		doCopy(subFile.getPath(), desPath + File.separator + sourceFile.getName());
	    }
	} else {
	    FileInputStream input = null;
	    FileOutputStream output = null;
	    try {
		try {
		    input = new FileInputStream(sourceFile);
		    output = new FileOutputStream(desPath + File.separator + sourceFile.getName());
		    int length = (int) sourceFile.length();
		    byte[] buffer = new byte[length];
		    input.read(buffer);
		    output.write(buffer);
		} finally {
		    if (input != null) input.close();
		    if (output != null) output.close();
		}
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
    }

}