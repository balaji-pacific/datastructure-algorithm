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
		
		tree.insert(25);
		tree.insert(20);
		tree.insert(15);
		tree.insert(27);
		tree.insert(30);
		tree.insert(29);
		tree.insert(26);
		tree.insert(22);
		tree.insert(32);
		
		System.out.print("In Order Traversal : ");
		tree.traverseInOrderNode();
		
		System.out.println("");
		
		System.out.print("Pre Order Traversal : ");
		tree.traversePreOrderNode();
		
		System.out.println("");
		
		System.out.print("Post Order Traversal : ");
		tree.traversePostOrderNode();
	}

}
