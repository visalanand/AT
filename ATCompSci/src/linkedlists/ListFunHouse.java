package linkedlists;

import static java.lang.System.*;

public class ListFunHouse {
	// this method will print the entire list on the screen
	public static void print(ListNode list) {
		while (list != null) {

			System.out.println(list);
			list = list.getNext();
		}

	}

	// this method will return the number of nodes present in list
	public static int nodeCount(ListNode list) {
		int count = 0;
		while (list.getNext() != null) {
			count++;
			list = list.getNext();
		}
		return count;
	}

	// this method will create a new node with the same value as the first node
	// and add this
	// new node to the list. Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list) {
		ListNode listNode = new ListNode();
		listNode.setValue(list.getValue());

		ListNode afterfirst = list.getNext();

		list.setNext(listNode);
		listNode.setNext(afterfirst);

	}

	// this method will create a new node with the same value as the last node
	// and add this
	// new node at the end. Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list) {

		while (list.hasNext()) {
			list = list.getNext();
		}
		ListNode afterLast = new ListNode();
		afterLast.setValue(list.getValue());
		afterLast.setNext(null);
		list.setNext(afterLast);

	}

	// method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list) {
		int x = 1;
		ListNode previous = null;
		while (list.getNext() != null) {
			if (x % 2 == 0) {
				previous.setNext(list.getNext());
			}
			previous = list;
			if (list.getNext() != null)
				list = list.getNext();
			else {
				break;
			}
			x++;
		}

	}

	// this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value) {
		int count = 1;

		while (list != null) {
			if (count % x == 0) {
				list.setValue(value);
			}

			count++;
			list = list.getNext();
		}

	}

	// this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x) {
		int count = 1;
		ListNode previous = list;

		while (list != null) {
			if (count % x == 0) {
				previous.setNext(list.getNext());
			}
			previous = list;
			list = list.getNext();
			count++;

		}

	}
}