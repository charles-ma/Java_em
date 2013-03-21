class C9Q5 {
    public static void main(String[] args) {
	String[] a = {"ava", "ball", "", "", "call", "", "dad"};
	System.out.println(find(a, "ball"));
    }

    public static int find(String[] a, String s) {
	return find(a, s, 0, a.length - 1);
    }

    public static int find(String[] a, String s, int start, int end) {
	if(start > end) return -1;
	int mid = (start + end) / 2;
	if(a[mid].equals("")) {
	    while(a[mid].equals("") && mid <= end) {
		mid++;
	    }
	    if(mid > end) return find(a, s, start, (start + end) / 2 - 1);
	}
	if(a[mid].equals(s)) return mid;
	if(a[mid].compareTo(s) > 0) return find(a, s, start, mid - 1);
	else return find(a, s, mid + 1, end);
    }
}