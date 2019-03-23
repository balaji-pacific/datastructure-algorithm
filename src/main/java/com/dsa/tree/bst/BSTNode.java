/**
 * 
 */
package com.dsa.tree.bst;

/**
 * @author Balaji Soundarrajan
 * 
 */
public class BSTNode {

	private int data;
	private BSTNode leftChild;
	private BSTNode rightChild;
	
	public static int heightL = 0;
	public static int heightR = 0;

	public BSTNode(int data) {
		this.data = data;
	}
	
	/**
	 * Insert the value into Binary Search Tree
	 * @param value
	 */
	public void insert(int value) {
		if(value == data) {
			System.out.println("Duplicate is not allowed");
			return;
		}
		if(value < data) {
			if(leftChild == null) {
				leftChild = new BSTNode(value);
			}else {
				leftChild.insert(value);
			}
		}else {
			if(rightChild == null) {
				rightChild = new BSTNode(value);
			}else {
				rightChild.insert(value);
			}
		}
	}
	
	/**
	 * Traverse the binary search tree using In Order technique
	 */
	public void traverseInOrder() {
		if(leftChild != null) {
			leftChild.traverseInOrder();
		}
		System.out.print(data + "  ");
		if(rightChild != null) {
			rightChild.traverseInOrder();
		}
	}
	
	/**
	 * Traverse the binary search tree using Pre Order technique
	 */
	public void traversePreOrder() {
		System.out.print(data + "  ");
		if(leftChild != null) {
			leftChild.traversePreOrder();
		}
		if(rightChild != null) {
			rightChild.traversePreOrder();
		}
	}
	
	/**
	 * Traverse the binary search tree using Post Order technique
	 */
	public void traversePostOrder() {
		if(leftChild != null) {
			leftChild.traversePostOrder();
		}
		if(rightChild != null) {
			rightChild.traversePostOrder();
		}
		System.out.print(data + "  ");
	}
	
	/**
	 * This method is to find the given value is available in the tree or not
	 * @param value
	 * @return null if the value is not available otherwise data
	 */
	public BSTNode getNode(int value) {
		if(value == data) {
			return this;
		}
		if(value < data) {
			if(leftChild != null) {
				return leftChild.getNode(value);
			}
		}else {
			if(rightChild != null) {
				return rightChild.getNode(value);
			}
		}
		return null;
	}
	
	/**
	 * Finding the minimum value in the Binary search tree
	 * @return
	 */
	public BSTNode getMinimum() {		
		if(leftChild == null) {
			return this;
		}
		if(leftChild != null) {
			return leftChild.getMinimum();		
		}
		return null;
	}
	
	/**
	 * Finding the maximum value in the Binary search tree
	 * @return
	 */
	public BSTNode getMaximum() {
		if(rightChild == null) {
			return this;
		}
		if(rightChild != null) {
			return rightChild.getMaximum();		
		}
		return null;
	}

	/**
	 * Get the height of the Binary Search Tree for Left
	 * @return
	 */
	public int getHeightL() {
		if(leftChild == null) {
			return heightL;
		}
		if(leftChild != null) {
			heightL++;
			return leftChild.getHeightL();
		}
		return 0;
	}
	
	
	/**
	 * Get the height of the Binary Search Tree for Right Child
	 * @return
	 */
	public int getHeightR() {
		if(rightChild == null) {
			return heightR;
		}
		if(rightChild != null) {
			heightR++;
			return rightChild.getHeightR();
		}
		return 0;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the leftNode
	 */
	public BSTNode getLeftNode() {
		return leftChild;
	}

	/**
	 * @param leftNode the leftNode to set
	 */
	public void setLeftNode(BSTNode leftNode) {
		this.leftChild = leftNode;
	}

	/**
	 * @return the rightNode
	 */
	public BSTNode getRightNode() {
		return rightChild;
	}

	/**
	 * @param rightNode the rightNode to set
	 */
	public void setRightNode(BSTNode rightNode) {
		this.rightChild = rightNode;
	}
}