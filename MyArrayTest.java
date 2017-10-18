import static org.junit.Assert.*;

import org.junit.Test;

public class MyArrayTest {
	final static int ARRAY_SIZE = 10;
	final static int[] ARRAY_TEST = {1, 2, 3, 4, 5};
	@Test
	public void testConstructor() {
		MyArray myArray_1 = new MyArray(ARRAY_SIZE);
		assertEquals(ARRAY_SIZE, myArray_1.getSize());
		
		MyArray myArray_2 = new MyArray(ARRAY_TEST);
		if (!myArray_2.equals(ARRAY_TEST)) {
			fail();
		}
//		assertEquals(ARRAY_TEST, myArray_2);
	}

}
