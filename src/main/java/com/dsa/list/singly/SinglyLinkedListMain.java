/**
 * 
 */
package com.dsa.list.singly;

/**
 * Main class for performing linked list operation
 * @author Balaji
 *
 */
public class SinglyLinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student balStudent = new Student("Balaji", "Soundarrajan", 34);
		Student deepaStudent = new Student("Deepalakshmi", "Lakshminarasimhan", 28);
		Student yashiStudent = new Student("Yashika", "Balaji", 3);
		Student vasuStudent = new Student("Vasuki", "Soundarrajan", 55);
		Student mohanStudent  = new Student("Mohan", "Soundarrajan", 40);
		Student sampleStudent  = new Student("Sample", "Sam", 31);
		
		System.out.println("Insert Completed");
		
		System.out.println("Printing the node in the list");
		SinglyLinkedList linkedList = new SinglyLinkedList();
		System.out.println("Size of the list is : " + linkedList.getSize());
		System.out.println("List is empty : " + linkedList.isEmpty());
		linkedList.addToList(balStudent);
		linkedList.addToList(deepaStudent);
		linkedList.addToList(yashiStudent);
		linkedList.addToList(vasuStudent);
		linkedList.addToList(mohanStudent);
		linkedList.addToList(sampleStudent);
		
		linkedList.printList();
		
		System.out.println("Size of the list is : " + linkedList.getSize());
		System.out.println("List is empty : " + linkedList.isEmpty());

		System.out.println("Deleting the node");
		Student deletedNode = linkedList.deleteNode();
		if(null == deletedNode) {
			System.out.println("Node not deleted");
		}else {
			System.out.println("Node " + deletedNode + " is deleted");
		}
		linkedList.printList();
		deletedNode = linkedList.deleteNode();
		if(null == deletedNode) {
			System.out.println("Node not deleted");
		}else {
			System.out.println("Node " + deletedNode + " is deleted");
		}
		System.out.println("Size of the list is : " + linkedList.getSize());
		linkedList.printList();
		
	}

}
