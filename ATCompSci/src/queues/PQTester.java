package queues;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	public PriorityQueue<String> pQueue;
	public String min ;
	public PQTester()
	{
		pQueue = new PriorityQueue<String>();
	}

	public PQTester(String list)
	{
		pQueue = new PriorityQueue<String>();
		String [] li = list.split(" ");
		for (String s : li){
			pQueue.add(s);
		}
	}

	public void setPQ(String list)
	{
		String [] lis = list.split(" ");
		pQueue = new PriorityQueue<String>();
		for (String s : lis)
		pQueue.add(s);
		
	}
	
	public Object getMin()
	{	PriorityQueue<String> pq = new PriorityQueue<String>();
		
		String b = pQueue.remove();
		pq.add(b);
		while (!pQueue.isEmpty()){
			String a = pQueue.remove();
			pq.add(a);
			if (b.compareTo(a)> 0)
			b = a;
		}
		pQueue = pq;
		min = b;
		return b;
	}
	
	public String getNaturalOrder()
	{
			PriorityQueue<String> pq = new PriorityQueue<String>();

		String s = "";
		String a= pQueue.remove();
		s = s+ min + " ";
		while (!pQueue.isEmpty()){
			a  = pQueue.remove();
			s = s+ a + " ";
			pq.add(a);
		}
		pQueue = pq;
		return s;		
	}
	public String toString (){
		return pQueue.toString();
	}

	//write a toString method
}