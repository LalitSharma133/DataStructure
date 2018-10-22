package linklist;

import linklist.LinkedList.Node;

public class LengthLinkedList {

	int lengthLinkedList(LinkedList list) {
		int count = 0;
		System.out.println("Length of linkedlist is: ");
		System.out.println("------------------------------------");
		Node temp = list.head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		System.out.println(count);
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		return count;
	}

	int middleElement(int length) {
		int middle = 0;
		if (length != 1) {
			if (length % 2 == 0) {
				middle = length / 2;
			} else {
				middle = (length - 1) / 2;
			}
		}
		return middle;
	}

}
