package linklist;

import java.util.Scanner;

public class Introduction {
	LinkedList linklist = new LinkedList();
	AddNode an = new AddNode();
	Scanner sc = new Scanner(System.in);
	Boolean isStarted = true;

	int getUserResponse() {
		System.out.println("Select Opertions to perform on Linked list");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("1. Create LinkedList");
		System.out.println("------------------------------------------");
		System.out.println("2. Add Node in begining of LinkedList");
		System.out.println("------------------------------------------");
		System.out.println("3. Add Node in the end of LinkedList");
		System.out.println("------------------------------------------");
		System.out.println("4. Add Node in the middle of LinkedList");
		System.out.println("------------------------------------------");
		System.out.println("5. Find the length of LinkedList");
		System.out.println("------------------------------------------");
		System.out.println("6. Display LinkedList");
		System.out.println("------------------------------------------");
		System.out.println("7. Exit");
		System.out.println("------------------------------------------");
		int response = sc.nextInt();
		return response;
	}

	void allCasesForLinkedList(int response) {
		LengthLinkedList length = new LengthLinkedList();
		switch (response) {
		case 1:
			System.out.println("Enter the element of Node");
			an.addNode(sc.nextInt(), linklist, InsertionType.END);
			break;
		case 2:
			System.out.println("Enter the element of Node");
			an.addNode(sc.nextInt(), linklist, InsertionType.BEGIN);
			break;
		case 3:
			System.out.println("Enter the element of Node");
			an.addNode(sc.nextInt(), linklist, InsertionType.END);
			break;
		case 4:
			System.out.println("Enter the element of Node");
			an.addNodeAtMiddle(sc.nextInt(), linklist, length.middleElement(length.lengthLinkedList(linklist)));
			break;
		case 5:
			length.lengthLinkedList(linklist);
			break;
		case 6:
			TraverseList traversal = new TraverseList();
			traversal.traverseList(linklist);
			break;
		case 7:
			isStarted = false;
			break;
		default:
			System.out.println("Wrong Entry... Please select Again..!!!");
			break;
		}
	}

	void checkStarted(Introduction intro) {
		if (isStarted) {
			int option = intro.getUserResponse();
			intro.allCasesForLinkedList(option);
			checkStarted(intro);
		} else
			System.out.println("Exiting...............!!!");
	}

	public static void main(String[] args) {
		Introduction intro = new Introduction();
		intro.checkStarted(intro);
	}
}
