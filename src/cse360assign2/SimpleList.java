/* Author: Jason Xu
 * Class ID: 166
 * Assignment #: 1
 * Description: This file contains methods for manipulating an array.
 * It contains a constructor to create a new object of type SimpleList
 * It also contains an add function, a remove function, a search function, and a toString function.
 */

package cse360assign2;

public class SimpleList {
	
	//Class variables
	//List is an int array to store the elements
	//Count is an int variable to keep track of amount of elements in the array
	private int[] list;
	private int count;
	
	/* Constructor
	 * Creates new object of type SimpleList
	 */
	SimpleList() {
		list = new int[10];
		count = 0;
	}
	
	/* Add method
	 * Parameter of type int, includes element wanted to be added to array.
	 * Void method, no return type.
	 * This method adds the element from the parameter into the first index of the array and moves 
	 * the following elements up. 
	 */
	public void add(int num) {
		int[] temp = new int[list.length];
		temp = list.clone();
		if(count == 10) {
			count--;
		}
		for(int increment = 0; increment < count; increment++) {
			list[increment+1] = temp[increment];
		}
		list[0] = num;
		if(count < 10) {
			count++; //increase count once element is added
		}
	}
	
	/* Remove method
	 * Parameter of type int, includes element wanted to be removed from the array.
	 * Void method, no return type
	 * This method searches the array and removes the first instance of the element from the parameter.
	 * Once the element is removed, it moves every subsequent element down one index.
	 * If no element is found, nothing happens. 
	 */
	public void remove(int num) {
		int increment = 0;
		boolean found = false; //set boolean variable so method stops after first instance
		while(increment < list.length && found == false) {
			if(list[increment] == num) {
				int[] temp = new int[list.length];
				temp = list.clone(); //create clone of list to move elements of array down
				for(int tracker = increment; tracker < list.length - 1; tracker++) {
					list[tracker] = temp[tracker + 1];
				}
				list[list.length - 1] = 0;
				count--; //decrease count once element is removed
				found = true; //set found to true so it only removes one instance of the variable
			}
			increment++;
		}
	}
	
	/* Count method
	 * No parameter
	 * Return type int, returns the count of the total number of elements present in the array.
	 * This method just returns the total number of elements that have been added to the array.
	 */
	public int count() {
		return count;
	}
	
	/* toString method
	 * No parameter
	 * Return type String, Returns the array as a string.
	 * This method returns a string of the array's elements with a space in between each element, but no space
	 * after the last element added. 
	 */
	public String toString() {
		String listString = "";
		for(int increment = 0; increment < count; increment++) {
			listString += Integer.toString(list[increment]) + " ";
		}
		listString = listString.substring(0, listString.length() - 1); //remove last space from the string
		return listString;
	}
	
	/* Search method
	 * Parameter of type int, parameter is the element you want to search for in the array.
	 * Return of type int, if the element is found, it returns the index of the first instance of the found element.
	 * If the element is not found, it returns -1
	 * This program searches the array for a given element in the parameter and if the element
	 * is found it returns the index of the element and if it isn't it returns -1. 
	 */
	public int search(int num) {
		int tracker = 0;
		boolean found = false; //boolean variable so that only first instance of the variable is found
		while (tracker < list.length && found == false) {
			if(list[tracker] == num) {
				found = true;
			}
			tracker++;
		}
		if(found == true) { //once found, the index will be one greater than the actual desired index
			tracker--;
			return tracker;
		}
		else {
			return -1;
		}
		
	}
	
}

