/**
 * 
 */
package com.dsa.sort.algorithm;

/**
 * @author Balaji
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arrayValue = {156, 2, -15, 23, 893, 55, 2, -10, -456};
		
		System.out.println("Before Sorting : ");
		for(int x=0; x < arrayValue.length; x ++) {
			System.out.print(arrayValue[x] + " ");
		}
		
		for(int unsort=arrayValue.length -1; unsort > 0 ; unsort --) {			
			int largest = 0;			
			for(int i=1;i<=unsort;i++) {
				if(arrayValue[i] > arrayValue[largest]) {
					largest = i;
				}
			}
			int temp = arrayValue[largest];
			arrayValue[largest] = arrayValue[unsort];
			arrayValue[unsort] = temp;
		}		
		
		System.out.println("\nAfter Sorting : ");
		for(int x=0; x < arrayValue.length; x ++) {
			System.out.print(arrayValue[x] + " ");
		}

	}

}
