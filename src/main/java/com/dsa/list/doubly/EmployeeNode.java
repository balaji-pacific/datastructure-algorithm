/**
 * 
 */
package com.dsa.list.doubly;

/**
 * @author Balaji
 *
 */
public class EmployeeNode {
	
	private EmployeeNode previousNode;
	private Employee node;
	private EmployeeNode nextNode;
	
	public EmployeeNode(Employee employee) {
		this.node = employee;
	}

	/**
	 * @return the previousNode
	 */
	public EmployeeNode getPreviousNode() {
		return previousNode;
	}

	/**
	 * @param previousNode the previousNode to set
	 */
	public void setPreviousNode(EmployeeNode previousNode) {
		this.previousNode = previousNode;
	}

	/**
	 * @return the node
	 */
	public Employee getNode() {
		return node;
	}

	/**
	 * @param node the node to set
	 */
	public void setNode(Employee node) {
		this.node = node;
	}

	/**
	 * @return the nextNode
	 */
	public EmployeeNode getNextNode() {
		return nextNode;
	}

	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(EmployeeNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public String toString() {
		return node.toString();
	}

}
