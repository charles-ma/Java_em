public class BinaryS {

    public static void main(String... args) {
	int[] a = {1, 5, 9, 10, 23, 59};
	System.out.println(doS(a, 5));
    }

    public static int doS(int[] a, int value) {
	if (a == null) return -1;
	else return doS(a, 0, a.length - 1, value);
    }

    public static int doS(int[] a, int start, int end, int value) {
	if (a == null || start > end) return -1;
	int mid = (start + end) / 2;
	if (a[mid] == value) return mid;
	else if (a[mid] < value) return doS(a, mid + 1, end, value);
	else return doS(a, start, mid - 1, value);
    }

}