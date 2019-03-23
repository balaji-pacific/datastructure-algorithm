/**
 * 
 */
package com.dsa.tree.bst;

/**
 * @author Balaji Soundarrajan
 * This class is to perform Binary Search Tree related operation
 */
public class BinarySearchTreeMain {

	/**
	 * Main method of BST operations
	 * @param args
	 */
	public static void main(String[] args) {
		
		BSTTree tree = new BSTTree();
		
		//Insert
		tree.insert(25);
		tree.insert(20); 
		tree.insert(15); 
		tree.insert(27); 
		tree.insert(30);
		tree.insert(29);
		tree.insert(26);
		tree.insert(22);
		tree.insert(32);
		
		//Inorder Traversal
		System.out.print("In Order Traversal : ");
		tree.traverseInOrderNode();
		
		System.out.println("");
		
		//Pre order Traversal
		System.out.print("Pre Order Traversal : ");
		tree.traversePreOrderNode();
		
		System.out.println("");
		
		//Post order Traversal
		System.out.print("Post Order Traversal : ");
		tree.traversePostOrderNode();
		
		System.out.println("");
		
		//Searching the node in tree
		if(null!=tree.getNode(33)) {
			System.out.println("Data " + tree.getNode(33) +" is available");
		}else {
			System.out.println("Data is not available");
		}
		
		if(null!=tree.getNode(29)) {
			System.out.println("Data " + tree.getNode(29) +" is available");
		}else {
			System.out.println("Data is not available");
		}
		
		//Finding maximum in the BST
		System.out.println(tree != null && tree.getMinimum()!=null ?  "Minimum value in the tree : " + tree.getMinimum().getData() : "Empty Tree");		
		
		
		//Finding maximum in the BST
		System.out.println(tree != null && tree.getMaximum()!= null ? "Maximum value in the tree : "  + tree.getMaximum().getData() : "Empty tree");
		
		
		//Get Height of the Binary Search Tree
		System.out.println("Height of the Binary Search Tree : " + tree.getHeight());
	}

}
