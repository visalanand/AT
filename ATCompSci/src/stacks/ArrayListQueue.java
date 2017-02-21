package stacks;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListQueue implements MyQueue {
	private ArrayList data;

	public ArrayListQueue() {
		data = new ArrayList();
	}

	public ArrayListQueue(ArrayList _data) {
		data = _data;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub

		return data.isEmpty();
	}

	@Override
	public boolean offer(Object item) {
		// TODO Auto-generated method stub
		data.add(item);
		return true;

	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		if (empty())
			return null;

		return data.remove(0);

	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return data.get(0);
	}

	// Adds q to the end of the current queue. Queue q is then cleared.

	public void append(ArrayListQueue q)

	{
		ArrayList queue = q.data;

		while (!queue.isEmpty()) {
			data.add(data.size(), queue.remove(0));
		}

	}

	// Inserts q to the current queue alternately.
	// Queue q is then cleared.

	public ArrayListQueue alternate(ArrayListQueue q)

	{
		ArrayList alternate = q.data;
		int oddInsert = 1;
		for ( Object a: data){
			alternate.add(oddInsert, a);
			oddInsert+=2;
		}
		
		
		
		
		return new ArrayListQueue(alternate);

	}

	public String toString() {
		String s = "";
		for (Object a : data) {
			s = s + a + " ";
		}
		return s;
	}

	public static void main(String[] args) {

		ArrayListQueue queue = new ArrayListQueue();

		for (int k = 1; k <= 5; k++)
			queue.offer(new Integer(k));

		ArrayListQueue queue2 = new ArrayListQueue();

		for (int k = 11; k <= 15; k++)
			queue2.offer(new Integer(k));
		System.out.println(queue2);
		ArrayListQueue queue3 = new ArrayListQueue();

		for (int k = 21; k <= 27; k++)
			queue3.offer(new Integer(k));
			System.out.println(queue3);
		ArrayListQueue temp = new ArrayListQueue(queue3.data);
		
		queue.append(queue3);
		System.out.println(queue);
		System.out.println();
		
		while (!(queue.empty())) {
			System.out.print(queue.poll() + "  ");
		}
		System.out.println();
		queue3 = temp;
		
		ArrayListQueue queue4 = queue3.alternate(queue2);

		System.out.println("Alternate");
		System.out.println(queue4);

		 ArrayListQueue queue5 = queue3.alternate(queue2);
		
		 System.out.println("Alternate");
		 System.out.println(queue5);

	}

}
