package linkedlists;

import java.util.LinkedList;
import java.util.ListIterator;

import static java.lang.System.*;

public class JavaLinkedList {

	
	
		private LinkedList<Integer> list;

		public JavaLinkedList(){
			list = new LinkedList<Integer>();
		}

		public JavaLinkedList(int[] nums){
			list = new LinkedList<Integer>();
			for(int num : nums){
				list.add(num);
			}
		}

		public double getSum( ){
			double total=0;
			
			
			for (Integer num : list)
				total+= num.intValue();
			
			
			return total;
		}

		public double getAvg(  ){
			
			double avg = 0;
			for ( Integer num : list){
				avg+=num;
			}
			return avg/list.size();
				
		}

		public int getLargest(){
			ListIterator<Integer> iter = list.listIterator();
			Integer max = iter.next();
			Integer b = null;
			while (iter.hasNext()){
				b = iter.next();
				if (max.intValue()< b.intValue()){
					max = b;
				}
			}
			
			return max;
		}

		public int getSmallest(){
			ListIterator<Integer> iter = list.listIterator();
			Integer smallest = iter.next();
			Integer b = null;
			while (iter.hasNext()){
				b = iter.next();
				if (smallest.intValue() > b.intValue()){
					smallest = b;
				}
			}
			return smallest;
		}

		public String toString(){
		 return  "Sum: " + getSum() + "\n" + "Average: " + getAvg() + "\n" + "Smallest: " + getSmallest() + "\n" + "Largest: "+ getLargest();
			
		}
	}



