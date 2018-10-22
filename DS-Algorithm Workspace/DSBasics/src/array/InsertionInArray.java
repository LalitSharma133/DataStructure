package array;

public class InsertionInArray {

	static InsertionInArray insertion = null;

	private InsertionInArray() {

	}

	public static InsertionInArray getInstanceofInsertionInArray() {
		return insertion = new InsertionInArray();
	}

	public static int[] addElement(int[] a, int length, int loc, int Element) {
		if (loc > length) {
			System.out.println("Array Out of Bound");
			return a;
		} else {
			int[] b = new int[length + 1];
			int index = 0;
			while (index < length) {
				b[index] = a[index];
				index++;
			}
			int i = length;
			while (i >= loc) {
				b[i] = b[i - 1];
				i--;
			}
			b[i] = Element;
			return b;
		}
	}

}
