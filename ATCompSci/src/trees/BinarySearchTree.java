package trees;
import static java.lang.System.*;

import java.util.Collections;
import java.util.LinkedList;

public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null)
			tree = new TreeNode(val);
		
		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);
		
		
		if(dirTest <= 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		
		return tree;
	}
	
	
	
	public boolean remove (TreeNode tree, TreeNode higher){
		
		if (higher == tree){
			tree = null;
			return true;
		}
		
		if (remove(tree,higher.getLeft())){
			return true;
		}
		else if (remove(tree, higher.getRight())){
			return true;
			
		}
		else {
			return false;
		}
	}
	public boolean search(TreeNode tree, Comparable value){
		TreeNode temp = null;
		int leaves = getNumLevels();
		int count = 0;
		while ( count < leaves ){
			if (tree.getValue() == value){
				return true;
			}
			else if (tree.getRight() != null) {
				temp = tree;
				tree = tree.getRight();
				count++;
			}
			else if (tree.getLeft() != null){
				temp = tree;
				tree = tree.getLeft();
				count++;
			}
			else {
				tree = temp;
				
			}
		}
		return false;
	}
   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}

	//add preOrder, postOrder, and revOrder
	
	
	
	
	
	
	



	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}
	
	
	public int getWidth(){
		TreeNode temp = root;
		int count = 0; 
		while (! (temp.getRight()== null)|| !(temp.getLeft()==null)){
			count++;
			if (temp.getLeft()!= null)
			temp = temp.getLeft();
			else if (temp.getRight() != null){
				temp = temp.getRight();
			}
					
		}
		return count;
	}



	//add getNumLeaves, getWidth, getHeight, getNumNodes, and isFull














	
	
	
	//search
	
	//maxNode
	
	//minNode
	
	//level order
	
	//display like a tree
	
	//remove


	public String toString()
	{
		return "";
	}

	private String toString(TreeNode tree)
	{
		return "";
	}
}