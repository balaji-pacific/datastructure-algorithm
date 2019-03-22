/**
 * 
 */
package com.dsa.tree.bst;

/**
 * Class is to perform the Binary Search Tree operations
 * @author Balaji Soundarrajan
 */
public class BSTTree {
	
	private BSTNode root;
	
	/**
	 * Method is to perform insertion
	 * @param value
	 */
	public void insert(int value) {
		if (root == null) {
			root = new BSTNode(value);
		}else {
			root.insert(value);
		}
	}
	
	/**
	 * Traverse the binary search tree using In Order technique
	 */
	public void traverseInOrderNode() {
		if(root != null) {
			root.traverseInOrder();
		}
	}

	/**
	 * Traverse the binary search tree using Pre Order technique
	 */
	public void traversePreOrderNode() {
		if(root != null) {
			root.traversePreOrder();
		}
	}
	
	
	/**
	 * Traverse the binary search tree using Post Order technique
	 */
	public void traversePostOrderNode() {
		if(root != null) {
			root.traversePostOrder();
		}
	}
}
