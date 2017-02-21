package queues;

import java.util.Queue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class SwimmerPQ {
	private PriorityQueue<Swimmer> pQueue = new PriorityQueue<Swimmer>();

	public SwimmerPQ() {
	}

	public void add(Swimmer obj) {
		pQueue.add(obj);
	}

	public Object getMin() {
		Iterator<Swimmer> iter = pQueue.iterator();
		Swimmer min = iter.next();
		Swimmer temp;
		while (iter.hasNext()) {
			temp = iter.next();
			if (min.compareTo(temp) > 0)
				min = temp;
		}
		return min;

	}

	public Object removeMin() {
		Swimmer min = (Swimmer) getMin();
		Iterator<Swimmer> iter = pQueue.iterator();
		Swimmer temp = null;
		while (iter.hasNext()) {
			temp = iter.next();
			if (temp.equals(min))
				iter.remove();
		}
		return min;
	}

	public String getNaturalOrder() {

		String s = "";
		while (!pQueue.isEmpty()) {
			s += pQueue.remove() + "\n";

		}
		return s;
	}
	public String toString (){
		return  pQueue.toString();
	}

	// write a toString method
}