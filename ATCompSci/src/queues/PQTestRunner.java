package queues;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -  

public class PQTestRunner {
	public static void main(String[] args) {

		PQTester pq = new PQTester("one two three four five six seven");
		PQTester pq2 = new PQTester("1 2 3 4 5 one two three four five");
		PQTester pq3 = new PQTester("a p h j e f m c i d k l g n o b");
		// add test cases
		System.out.println("toString() - " + pq.toString());
		System.out.println("Min - " + pq.getMin());
		System.out.println("getNaturalOrder - " + pq.getNaturalOrder());

		System.out.println("toString() - " + pq2.toString());
		System.out.println("Min - " + pq2.getMin());
		System.out.println("getNaturalOrder - " + pq2.getNaturalOrder());
		System.out.println("toString() - " + pq3.toString());
		System.out.println("Min - " + pq3.getMin());
		System.out.println("getNaturalOrder - " + pq3.getNaturalOrder());

	}
}