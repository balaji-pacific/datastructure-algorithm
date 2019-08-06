/**
 * 
 */
package com.dsa.list.doubly;

/**
 * @author Balaji
 *
 */
public class DoublyLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private long size = 0;
	
	/**
	 * Adding the node to the head of the list
	 * @param employee
	 */
	public void addNodeToHead(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if(null == head) {
			node.setNextNode(null);
			node.setPreviousNode(null);
			tail = node;
		}else {
			node.setNextNode(head);
			node.setPreviousNode(null);
		}		
		head = node;
		size ++;
	}

	/**
	 * Adding the node to the tail of the list
	 * @param employee
	 */
	public void addNodeToTail(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if(null == head) {
			node.setNextNode(null);
			node.setPreviousNode(null);
			head = node;
		}else {
			node.setNextNode(null);
			node.setPreviousNode(tail);
		}
		tail = node;
		size ++;
	}
	
	/**
	 * Returns size of the list
	 * @return
	 */
	public long getSize() {
		return size;
	}
	
	/**
	 * Returns true if the list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return (null == head && null == tail);
	}

}
