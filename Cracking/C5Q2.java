class C5Q2 {
    public static void main(String[] args) {
	getBinString("5.25");
    }

    public static void getBinString(String s) {
	String inte = "";
	String fra = "";
	int index = s.indexOf('.');
	
	if(index == -1) {
	    inte = s;
	} else {
	    inte = s.substring(0, index);
	    fra = "0." + s.substring(index + 1);
	}
	int intPart = Integer.parseInt(inte);
	inte = "";
	while(intPart != 0) {
	    inte += "" + intPart % 2;
	    intPart = intPart / 2;
	}
	if(fra.equals("")) {
	    System.out.println(s);
	    return;
	}
	double fraPart = Double.parseDouble(fra);
	fra = "";
	while(fraPart != 0) {
	    fraPart = fraPart * 2;
	    if(fraPart >= 1) {
		fra += "1";
		fraPart = fraPart - 1;
	    } else {
		fra += "0";
	    }
	    if(fra.length() > 32) throw new RuntimeException("The double cannot be represented!");
	}
	System.out.println(inte + "." + fra);
    }
}