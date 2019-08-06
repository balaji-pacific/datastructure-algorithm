/**
 * 
 */
package com.dsa.list.singly;

/**
 * This class is maintaining list of operation performed in Single linked list
 * @author Balaji
 *
 */
public class SinglyLinkedList {

	private StudentNode head;
	private long size = 0;

	/**
	 * Adding new node to the list in the front
	 * 
	 * @param student
	 */
	public void addToList(Student student) {
		StudentNode node = new StudentNode(student);
		node.setNext(head);
		head = node;
		size++;
	}

	/**
	 * Printing the node from the list
	 */
	public void printList() {
		StudentNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

	/**
	 * Delete the specific node from the list
	 * 
	 * @param student
	 * @return Student
	 */
	public Student deleteNode() {
		if (isEmpty()) {
			System.out.println("List is empty");
		}
		StudentNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode.getNode();
	}

	/**
	 * Returning size of the list
	 * 
	 * @return
	 */
	public long getSize() {
		return size;
	}

	/**
	 * Return true if the list is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (0 == getSize()) {
			return true;
		} else {
			return false;
		}
	}
}
