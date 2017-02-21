package stacks;


	public class CircularArrayQueue
	{
		private int head;
		private int tail;
		private int theSize;
		private Object[] elements;
		public CircularArrayQueue(int capacity) { 
			elements = new Object[capacity];
			theSize = 1;
			head = 0;
			tail = 0;
		}
		//Zedai
		public void add(Object x) {
			if (tail == elements.length){
				Object[] temp = new Object[elements.length+1];
				int count = 0;
				for (int a = 0; a< elements.length;a++){
					temp[count++] = elements[a];
				}
				
			}
			
			
			elements[tail] = x;
			
			tail = (tail+1)%theSize;
			theSize++;
		}
		public Object remove() {
			Object n = elements[head];
			head = (head+1)%theSize;
			theSize--;
			return n;
		}
		public int size() {
			return theSize;
		}
		public String toString (){
			String s ="";
			for (Object n: elements){
				s+= n+ " ";
			}
			return s;
		}
		public static void main (String[] args){
			
		
				 CircularArrayQueue a = new CircularArrayQueue(10);
				 a.add(1);
				 a.add(2);
				 a.add(3);
				 a.add(4);
				 a.add(5);
				 a.add(6);
				 a.add(7);
				 a.add(8);
				 a.add(9);
				 System.out.println(a);
				 System.out.println("NEXT: " +a.remove());
				 System.out.println("NEXT: "+a.remove());
				 System.out.println("NEXT: "+a.remove());
				 System.out.println(a);
				 a.add(10);
				 System.out.println(a);
				 a.add(11);
				 System.out.println(a);
				 a.add(12);
				 System.out.println(a);
				 System.out.println("NEXT: "+a.remove());
				 System.out.println(a);
				 a.add(13);
				 System.out.println(a);
				 a.add(14);
				 System.out.println(a);
				 a.add(15);
				 System.out.println(a);
				 System.out.println("NEXT: "+a.remove());
				 System.out.println(a);
				 

			
		}
	}


