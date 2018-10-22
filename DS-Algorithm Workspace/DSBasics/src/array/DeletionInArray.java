package array;

public class DeletionInArray {

	static DeletionInArray deletion = null;

	private DeletionInArray() {
	}

	public static DeletionInArray getInstanceOfDeleteion() {
		return deletion = new DeletionInArray();
	}

	public static int[] deleteElement(int[] a, int location, int length) {
		if(location<=length)
		{
		int i = (location - 1);
		while (i < length - 1) {
			a[i] = a[i + 1];
			i++;
		}
		
		int j = 0;
		int[] b = new int[length - 1];
		while (j < b.length) {
			b[j] = a[j];
			j++;
		}
		return b;
	}
	else
	{
		System.out.println("Array Out of Bound");
		return a;
	}
	}

}
