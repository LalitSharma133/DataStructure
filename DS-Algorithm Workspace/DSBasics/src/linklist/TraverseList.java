package linklist;

import linklist.LinkedList.Node;

public class TraverseList {
	
	public void traverseList(LinkedList list)
	{
		System.out.println("Elements present in linkedlist are: ");
		System.out.println("------------------------------------");
		Node temp = list.head;
		while(temp != null)
		{
			System.out.print("-->");
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
	}
}
