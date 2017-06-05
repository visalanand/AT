package trees;
import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
	   BinarySearchTree tree = new BinarySearchTree();
	   
	   tree.add(4);
	   tree.add(5);
	   tree.add(6);
	   tree.add(7);
	   tree.add(8);
	   tree.add(9);
	   tree.add(10);
	   
	 System.out.println("In Order");
	 tree.inOrder();
	 System.out.println("PRE Order");
	 tree.postOrder();
	 System.out.println("Post Order");
	 tree.preOrder();
	 System.out.println("Reverse Order");
	 tree.revOrder();
	 
	 System.out.println("Height:"+ (tree.getHeight()-1));
	 System.out.println("Width: "+tree.getWidth());
	 System.out.println("leaves: "+tree.getNumLeaves());
	 System.out.println("Nodes: "+ tree.getNumNodes());
	 System.out.println("Levels: "+ tree.getNumLevels());
	 System.out.println(tree);
	 //add test cases here
 		
 		
 		
 		
 		
 		
 		
 
   }
}