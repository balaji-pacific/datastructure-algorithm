/**
 * 
 */
package com.dsa.list.doubly;

/**
 * @author Balaji
 *
 */
public class DoublyLinkedListMain {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee balEmployee = new Employee("Balaji", "Soundarrajan", 34);
		Employee deepaEmployee = new Employee("Deepalakshmi", "Lakshminarasimhan", 28);
		Employee yashiEmployee = new Employee("Yashika", "Balaji", 3);
		Employee vasuEmployee = new Employee("Vasuki", "Soundarrajan", 55);
		Employee mohanEmployee  = new Employee("Mohan", "Soundarrajan", 40);
		Employee sampleEmployee  = new Employee("Sample", "Sam", 31);

		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		
		System.out.println("Size of the list : " + doublyLinkedList.getSize());
		
		doublyLinkedList.addNodeToHead(balEmployee);
		doublyLinkedList.addNodeToHead(deepaEmployee);
		doublyLinkedList.addNodeToHead(yashiEmployee);
		doublyLinkedList.addNodeToTail(vasuEmployee);
		doublyLinkedList.addNodeToTail(mohanEmployee);
		doublyLinkedList.addNodeToTail(sampleEmployee);
		
		
		System.out.println("Size of the list : " + doublyLinkedList.getSize());

	}

}
