package linkedlists;

import java.util.*;
import static java.lang.System.*;

public class ListFunHouseRunner
{
	public static void main ( String[] args )
	{
		ListNode z = new ListNode("cheese",
	 			new ListNode("pepperoni",
      		new ListNode("onions",
       		new ListNode("peppers",
	 			new ListNode("bacon",
      		new ListNode("pineapple",
       		new ListNode("sausage",		       		
	 			new ListNode("garlic",null))))))));
			 			
		out.println("Worksheet LL#2 Runner\n\n");	
		
		out.println("Original list values\n");	
		
		ListFunHouse.print(z);
		out.println("\n");
		
		out.println("\t num nodes = " + ListFunHouse.nodeCount(z));

		out.println("\nList values after calling nodeCount\n");	
		
		ListFunHouse.print(z);
		out.println();		

		ListFunHouse.doubleFirst(z);		
		out.println("\nList values after calling doubleFirst\n");							
		
		ListFunHouse.print(z);
		out.println();	

		ListFunHouse.doubleLast(z);		
		out.println("\nList values after calling doubleLast\n");							
		
		ListFunHouse.print(z);
		out.println();				
		
		
		ListFunHouse.removeXthNode(z,2);		
		out.println("\nList values after calling removeXthNode(2)\n");					
		
		ListFunHouse.print(z);
		out.println();			
		
		
		ListFunHouse.setXthNode(z,2,"PIZZA!");		
		out.print("\t");
		out.println("\nList values after calling setXthNode(2,PIZZA!)\n");										
	
		ListFunHouse.print(z);
		out.println();	
		
		
		System.out.println("Skip every other");
		ListFunHouse.skipEveryOther(z);
		ListFunHouse.print(z);
		
	}
}