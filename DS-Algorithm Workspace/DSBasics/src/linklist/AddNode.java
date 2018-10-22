package linklist;

import linklist.LinkedList.Node;

public class AddNode {

	public LinkedList addNode(Integer value, LinkedList list, InsertionType location) {
		Node temp, newNode;
		if (location == InsertionType.BEGIN) {
			if (list.head != null) {
				newNode = new Node(value);
				newNode.next = list.head;
				list.head = newNode;

			} else {
				System.out.println("There is no element in  linked list");
				System.out.println("Added element : " + value);
				list.head = new Node(value);
			}
		}
		if (location == InsertionType.END) {
			if (list.head != null) {
				temp = list.head;
				while (temp.next != null) {
					temp = temp.next;
				}
				newNode = new Node(value);
				temp.next = newNode;
			} else {
				System.out.println("There is no element in  linked list");
				System.out.println("Added element : " + value);
				list.head = new Node(value);
			}
		}
		return list;
	}

	public LinkedList addNodeAtMiddle(Integer value, LinkedList list, int middleIntegerLocation) {
		int i = 1;
		Node temp = list.head;
		while (i < middleIntegerLocation) {
			temp = temp.next;
			i++;
		}
		Node newNode = new Node(value);
		newNode.next = temp.next;
		temp.next = newNode;
		return list;
	}
}
