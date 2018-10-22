package array;

import array.CreateArray;

public class ArrayInsertion {
	
	public static void init()
	{
		int[] a = CreateArray.getArrayInstance().getArray();
		DisplayArray.getDisplayInstance().displayArray(a, 0, a.length);
	}
	
	public static void main(String []args)
	{
		init();
		System.out.println("Successful");
	}
}
