class C9Q5 {
    public static void main(String[] args) {
	String[] a = {"ava", "ball", "", "", "call", "", "dad", "", "", "", "", "", "", "", ""};
	System.out.println(find(a, "ball"));
    }

    public static int find(String[] a, String s) {
	return find(a, s, 0, a.length - 1);
    }

    public static int find(String[] a, String s, int start, int end) {
	if(start > end) return Integer.MAX_VALUE;
	int mid = (start + end) / 2;
	while(mid < a.length && a[mid].equals("")) {
	    mid++;
	}
	if(mid == a.length) return find(a, s, start, (start + end) / 2);
	if(a[mid].equals(s)) return mid;
	else if(a[mid].compareTo(s) > 0){
	    return find(a, s, start, mid - 1);
	} else {
	    return find(a, s, mid + 1, end);
	}
    }
}