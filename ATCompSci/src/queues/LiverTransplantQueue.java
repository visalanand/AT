package queues;

import java.util.PriorityQueue;

public class LiverTransplantQueue implements Priority_Queue {
	
	PriorityQueue<Patient> liver = new PriorityQueue<Patient>();
	
	
	 public LiverTransplantQueue() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return liver.isEmpty();
	}

	@Override
	public void add(Object x) {
		// TODO Auto-generated method stub
		liver.add((Patient)x);
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return liver.remove();
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return liver.peek();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return liver.size();
	}
	public String toString(){
		return liver.toString();
	}
	
	

}
