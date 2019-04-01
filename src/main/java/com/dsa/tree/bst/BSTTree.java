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
	
	/**
	 * Get the height of the Binary Search Tree
	 * @return
	 */
	public int getHeight() {
		int left = root.getHeightL();
		int right = root.getHeightR();
		return left > right ? left : right;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void delete(int value) {
		root = delete(root, value);		
	}
	
	/**
	 * 
	 * @param subTreeRoot
	 * @param value
	 * @return
	 */
	private BSTNode delete(BSTNode subTreeRoot, int value) {
		if(subTreeRoot == null) {
			return subTreeRoot;
		}
		
		if(value < subTreeRoot.getData()) {
			subTreeRoot.setLeftNode(delete(subTreeRoot.getLeftNode(), value));
		}else if(value > subTreeRoot.getData()){
			subTreeRoot.setRightNode(delete(subTreeRoot.getRightNode(), value));
		}else if(value == subTreeRoot.getData()) {
			if(subTreeRoot.getLeftNode() == null) {
				return subTreeRoot.getRightNode();
			}else if(subTreeRoot.getRightNode() == null) {
				return subTreeRoot.getLeftNode();
			}
			subTreeRoot.setData(subTreeRoot.getRightNode().getMinimum().getData());		
			subTreeRoot.setRightNode(delete(subTreeRoot.getRightNode(), subTreeRoot.getData()));
		}
		return subTreeRoot;
	}
	
	/**
	 * Get the path between root and node
	 * @param value
	 */
	public void getPath(int value) {
		System.out.print("The path between root and node is : ");
		root.getPath(value);
	}
}
