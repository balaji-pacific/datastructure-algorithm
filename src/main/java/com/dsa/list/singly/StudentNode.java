/**
 * 
 */
package com.dsa.list.singly;

/**
 * Structure of Singly linked list
 * @author Balaji
 *
 */
public class StudentNode {
	
	private Student node;
	private StudentNode next;
	
	public StudentNode(Student student) {
		this.node = student;
	}

	/**
	 * @return the node
	 */
	public Student getNode() {
		return node;
	}

	/**
	 * @param node the node to set
	 */
	public void setNode(Student node) {
		this.node = node;
	}

	/**
	 * @return the next
	 */
	public StudentNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(StudentNode next) {
		this.next = next;
	}
	
	public String toString() {
		return node.toString();
	}

}
