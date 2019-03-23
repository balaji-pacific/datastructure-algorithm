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
	
	/**
	 * This method is to find the given value is available in the tree or not
	 * @param value
	 */
	public Object getNode(int value) {
		if(root != null) {
			if(root.getNode(value) != null) {
				return root.getNode(value).getData();			
			}			
		}
		return null;		
	}
	
	/**
	 * Getting Minimum value in the Tree
	 * @return
	 */
	public BSTNode getMinimum() {
		if(root != null) {
			return root.getMinimum();
		}
		return null;
	}
	
	/**
	 * Getting Maximum value in the Tree
	 * @return
	 */
	public BSTNode getMaximum() {
		if(root != null) {
			return root.getMaximum();
		}
		return null;
	}	
}
