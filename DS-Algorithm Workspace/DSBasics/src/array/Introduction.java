package array;

import java.util.Scanner;

public class Introduction {

	static int userResponse;
	static Boolean operationPerformed = true;
	static int[] a = null;
	static int loc, Element;

	public static int operationsForArray() {
		System.out.println("Choose operation to start with array: ");
		System.out.println("1. Creating an array");
		System.out.println("2. Insertion in array at any specific location");
		System.out.println("3. Display of an array");
		System.out.println("4. Deletion in an array from any specific location");
		System.out.println("5. Exit the Programme");
		Scanner sc = new Scanner(System.in);
		userResponse = sc.nextInt();
		return userResponse;

	}

	public static void performOperations() {
		userResponse = operationsForArray();
		switch (userResponse) {
		case 1:
			a = CreateArray.getArrayInstance().getArray();
			operationPerformed = true;
			break;
		case 2:
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Location at which you want to enter the element");
			loc = sc.nextInt();
			System.out.println("Enter the Element which you want to enter");
			Element = sc.nextInt();
			if (a != null) {
				InsertionInArray.getInstanceofInsertionInArray();
				a = InsertionInArray.addElement(a, a.length, loc, Element);
			} else
				System.out.println("Please create the array first and then add element into it");
			operationPerformed = true;
			break;
		case 3:
			if (a != null)
				DisplayArray.getDisplayInstance().displayArray(a, 0, a.length);
			else
				System.out.println("Array is Empty - Please intialize array first");
			operationPerformed = true;
			break;
		case 4:
			if(a == null)
			{
			System.out.println("Array is Empty - Please intialize array first");	
			}
			else
			{
			System.out.println("Enter the location from where you want to delete an element");
			Scanner scan = new Scanner(System.in);
			loc =scan.nextInt();
			DeletionInArray.getInstanceOfDeleteion();
			DeletionInArray.deleteElement(a, loc, a.length);
			}
			operationPerformed = true;
			break;
		case 5:
			operationPerformed = false;
			break;
		default:
			System.out.println("Wrong Entry");
			System.out.println("Please choose again");
			operationPerformed = true;
			break;
		}
	}

	public static void startAgain() {
		if (operationPerformed) {
			performOperations();
			startAgain();
		} else
			System.out.println("Shutting Down....");
	}

	public static void main(String[] args) {

		startAgain();

	}

}
