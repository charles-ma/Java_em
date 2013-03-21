class C9Q3 {
    public static void main(String[] args) {
	int[] a = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
	System.out.println(find(15, a));
    }

    public static int find(int v, int[] a) {
	return find(v, 0, a.length - 1, a);
    }
    
    public static int find(int v, int start, int end, int[] a) {
	if(start > end) return Integer.MAX_VALUE;
	int mid = (start + end) / 2;
	if(a[mid] == v) return mid;
	if(a[mid] >= a[start]) {
	    if(v > a[mid]) return find(v, mid + 1, end, a);
	    if(v >= a[start]) return find(v, start, mid - 1, a);
	    return find(v, mid + 1, end, a);
	} else {
	    if(v < a[mid]) return find(v, start, mid - 1, a);
	    if(v <= a[end]) return find(v, mid + 1, end, a);
	    return find(v, start, mid - 1, a);
	}
    }
}