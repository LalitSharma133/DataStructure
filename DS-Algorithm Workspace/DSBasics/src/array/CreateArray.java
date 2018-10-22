package array;

import java.util.Scanner;

public class CreateArray {
	
	static CreateArray  cr = null;
	
	private CreateArray()
	{
	}
	
	public static CreateArray getArrayInstance()
	{
		return cr = new CreateArray();
	}
	
	public <T> T[] getArray(String type)
	{
		System.out.println("Enter the size of array you want to create");
		Scanner scanner = new Scanner( System.in );
		int sizeOfArray = 0;
		if(type == "Integer")
		{
			sizeOfArray = scanner.nextInt();
			Integer [] array = new Integer[sizeOfArray];
			System.out.println("Enter the elements for array one by one and press enter");
			for(int i = 0; i<sizeOfArray;i++)
			{
				array[i] = scanner.nextInt();
			}
		}
		else
		{
			sizeOfArray = scanner.nextInt();
			String [] arr = new String[sizeOfArray];
			System.out.println("Enter the elements for array one by one and press enter");
			for(int i = 0; i<sizeOfArray;i++)
			{
				arr[i] = scanner.nextLine();
			}
		}
		return arr;
	}

}
