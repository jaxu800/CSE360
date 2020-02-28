/* Author: Jason Xu
 * Class ID: 166
 * Assignment #: 1
 * Description: This file contains junit tests for the SimpleList file
 * It tests each of the methods in the SimpleList file twice, one for success and one for failure
 */

package assign1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {
	
	//This method checks to make sure the constructor produces a new object.
	@Test
	public void testSimpleList() {
		SimpleList testing = new SimpleList();
		assertNotNull(testing);
	}
	
	//This method checks to see if the add method successfully adds one element to the array. 
	@Test
	public void testAddSuccess() {
		SimpleList testing = new SimpleList();
		testing.add(1);
		assertEquals(0, testing.search(1));
	}
	
	//This method checks to see if the add method doesn't incorrectly add unwanted elements. 
	@Test
	public void testAddFailure() {
		SimpleList testing = new SimpleList();
		testing.add(5);
		testing.add(2);
		assertEquals(-1, testing.search(6));
	}
	
	//This method checks if the remove method successfully removes only the first instance of the 
	//desired element in the array. 
	@Test
	public void testRemoveSuccess() {
		SimpleList testing = new SimpleList();
		testing.add(3);
		testing.add(6);
		testing.add(2);
		testing.add(6);
		testing.remove(6);
		assertTrue(testing.toString().equals("2 6 3"));
	}
	
	//This method checks if the remove method does nothing to the array if the desired element to be removed
	//is not found. 
	@Test
	public void testRemoveFailure() {
		SimpleList testing = new SimpleList();
		testing.add(5);
		testing.add(9);
		testing.add(15);
		testing.remove(3);
		assertTrue(testing.toString().equals("15 9 5"));
	}
	
	//This method checks if the count method correctly returns the total number of elements in the array. 
	@Test
	public void testCountSuccess() {
		SimpleList testing = new SimpleList();
		testing.add(6);
		testing.add(2);
		assertEquals(2, testing.count());
	}
	
	//This method checks to see if the count method doesn't return an incorrect number of elements in the array.
	@Test
	public void testCountFailure() {
		SimpleList testing = new SimpleList();
		testing.add(1);
		testing.add(7);
		testing.add(3);
		assertNotEquals(2, testing.count());
	}
	
	//This method checks if the toString method correctly returns a string of the array with spaces between 
	//each element and no space after the last element. 
	@Test
	public void testToStringSuccess() {
		SimpleList testing = new SimpleList();
		testing.add(2);
		testing.add(7);
		testing.add(3);
		testing.add(6);
		assertTrue(testing.toString().equals("6 3 7 2"));
	}
	
	//This method checks the toString method to ensure that there is no space after the last element in the
	//string version of the array. 
	@Test 
	public void testToStringFailure() {
		SimpleList testing = new SimpleList();
		testing.add(6);
		testing.add(3);
		testing.add(1);
		assertFalse(testing.toString().equals("1 3 6 "));
	}
	
	//This method checks the search method to ensure that it accurately returns the index of the desired element
	//in the array.
	@Test 
	public void testSearchSuccess() {
		SimpleList testing = new SimpleList();
		testing.add(1);
		testing.add(6);
		testing.add(2);
		assertEquals(2, testing.search(1));
	}
	
	//This method checks the search method to ensure that if the element is not found, it will return -1.
	@Test
	public void testSearchFailure() {
		SimpleList testing = new SimpleList();
		testing.add(8);
		testing.add(3);
		assertEquals(-1, testing.search(1));
	}

}
