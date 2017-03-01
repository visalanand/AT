package queues;

public class LiverQueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LiverTransplantQueue pq= new LiverTransplantQueue();
		pq.add(new Patient("Smith",3,1));
		pq.add(new Patient("Chen",2,2));
		pq.add(new Patient("Jones",3,3));
		pq.add(new Patient("Wong",3,4));
		pq.add(new Patient("Gupta",2,5));
		pq.add(new Patient("Garcia",1,6));
		pq.add(new Patient("Brown",3,7));
		System.out.println("The list is");
		System.out.println(pq);  
		while(pq.size()>0)
		{
       			 System.out.println("The next patient for the liver transplant is");
       			 System.out.println(pq.poll());
	  }

	}

}
