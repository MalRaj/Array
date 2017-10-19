import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MyArrayTest {	
	@Test
	public void testConstructor() {
		int[] expectedArray_1 = {0, 0, 0, 0, 0};
		MyArray myArray_1 = new MyArray(5);
		assertEquals("Failed: Created instance by size", 
				Arrays.toString(expectedArray_1), 
				Arrays.toString(myArray_1.getElements()));
		
		int[] expectedArray_2 = {1, 2, 3, 4, 5};
		MyArray myArray_2 = new MyArray(expectedArray_2);
		assertEquals("Failed: Created instance by an array",
				Arrays.toString(expectedArray_2), 
				Arrays.toString(myArray_2.getElements()));
		
		
		MyArray myArray_3 = new MyArray(0, 10, 3);
		int[] expectedArray_3 = {0, 3, 6, 9};
		assertEquals("Failed: Created instance by start, stop, and step",
				Arrays.toString(expectedArray_3), 
				Arrays.toString(myArray_3.getElements()));
		
		MyArray myArray_4 = new MyArray(0, 10, 0);
		int[] expectedArray_4 = null;
		assertEquals("Failed: Created instance by start, stop, and step with step = 0",
				Arrays.toString(expectedArray_4), 
				Arrays.toString(myArray_4.getElements()));
		
		MyArray myArray_5 = new MyArray(10, 10, 2);
		int[] expectedArray_5 = {10};
		assertEquals("Failed: Created instance by start, stop, and step with start = stop",
				Arrays.toString(expectedArray_5), 
				Arrays.toString(myArray_5.getElements()));
		
		MyArray myArray_6 = new MyArray(10, 0, 3);
		int[] expectedArray_6 = null;
		assertEquals("Failed: Created instance by start, stop, and step with start > stop",
				Arrays.toString(expectedArray_6), 
				Arrays.toString(myArray_6.getElements()));
	}

}
