/**
 * 
 */
package com.dsa.tree.bst;

import java.util.Scanner;

/**
 * @author Balaji Soundarrajan
 * This method is for getting the input from user to perform the Binary Search Tree operations
 * Following are the actual options available
 * 1. In order Traversal
 * 2. Pre order Traversal
 * 3. Post order Traversal
 * 4. Find minimum value of tree
 * 5. Find maximum value of the tree
 * 6. Height of the tree
 * 7. Search Node in tree
 *
 */
public class BSTUserInput {

	private static Scanner input;

	/**
	 * 
	 * This method is for getting the input from user to perform the Binary Search Tree operations
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("--------------------------------Binary search Tree---------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		BSTTree bstTree = new BSTTree();
		
		input = new Scanner(System.in);
		System.out.println("Enter the list of nodes(Integer) to insert into tree with comma seperated (eg: 1,2,3): ");
		
		//Code for getting user node as Input value
		/*
		 * String treeNodes = input.nextLine(); String[] nodes = treeNodes.split(",");
		 * for (String value : nodes) { bstTree.insert(Integer.parseInt(value.trim()));
		 * }
		 */
		
				
		/*
		 * bstTree.insert(25); bstTree.insert(20); bstTree.insert(15);
		 * bstTree.insert(27); bstTree.insert(30); bstTree.insert(29);
		 * bstTree.insert(26); bstTree.insert(22); bstTree.insert(32);
		 * bstTree.insert(17);
		 */
		
		
		bstTree.insert(100);
		bstTree.insert(58); 
		bstTree.insert(30); 
		bstTree.insert(47); 
		bstTree.insert(25);
		bstTree.insert(39);
		bstTree.insert(125);
		bstTree.insert(111);
		bstTree.insert(137);
		bstTree.insert(110);
		bstTree.insert(120);
		bstTree.insert(130);
		bstTree.insert(140);
		bstTree.insert(109);
		bstTree.insert(121);
		bstTree.insert(119);
		
		System.out.println("Nodes are inserted into the tree");		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		for(;;) {
			System.out.println("1. Insert Node into Tree");
			System.out.println("2. In order Traversal");
			System.out.println("3. Pre order Traversal");
			System.out.println("4. Post order Traversal");
			System.out.println("5. Find minimum value of tree");
			System.out.println("6. Find maximum value of the tree");
			System.out.println("7. Height of the tree");
			System.out.println("8. Search Node in tree");
			System.out.println("9. Delete Node in tree");
			System.out.println("10. Find path between root and node");
			System.out.println("Exit");
			System.out.println("Enter your option : ");			
			int inputOption = Integer.parseInt(input.nextLine());			
			switch(inputOption) {
			case 1:
				System.out.println("Enter the node value to insert into tree : ");
				String value = input.nextLine();
				bstTree.insert(Integer.parseInt(value.trim()));
			case 2:
				System.out.print("In Order Traversal : ");
				bstTree.traverseInOrderNode();
				System.out.println();
				break;
			case 3:
				System.out.print("Pre Order Traversal : ");
				bstTree.traversePreOrderNode();
				System.out.println();
				break;
			case 4:
				System.out.print("Post Order Traversal : ");
				bstTree.traversePostOrderNode();
				System.out.println();
				break;
			case 5:
				System.out.println(bstTree != null && bstTree.getMinimum()!=null ?  "Minimum value in the tree : " + bstTree.getMinimum().getData() : "Empty Tree");
				System.out.println();
				break;
			case 6:				
				System.out.println(bstTree != null && bstTree.getMaximum()!= null ? "Maximum value in the tree : "  + bstTree.getMaximum().getData() : "Empty tree");
				System.out.println();
				break;
			case 7:
				System.out.println("Height of the Binary Search Tree : " + bstTree.getHeight());
				System.out.println();
				break;
			case 8:
				System.out.println("Enter the node o search in the tree : ");
				int searchNode = Integer.parseInt(input.nextLine());	
				if(null!=bstTree.getNode(searchNode)) {
					System.out.println("Data " + bstTree.getNode(searchNode) +" is available");
				}else {
					System.out.println("Data " + searchNode + " is not available");
				}
				System.out.println();
				break;
			case 9:
				System.out.println("Enter the node to be deleted");
				int deleteNode = Integer.parseInt(input.nextLine());
				bstTree.delete(deleteNode);
				System.out.println("Node Deleted Successfully");
				break;
			case 10:
				System.out.println("Enter the node to get the path : ");
				int node = Integer.parseInt(input.nextLine());
				bstTree.getPath(node);
				System.out.println();
			default:
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println("\t\t\t\tThank you!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.exit(0);
			}
		}
	}
}
