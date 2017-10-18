import static org.junit.Assert.*;

import org.junit.Test;

public class MyArrayTest {
	final static int SIZE_ARRAY = 10;
	@Test
	public void testConstructor() {
		MyArray myArray = new MyArray(SIZE_ARRAY);
		assertEquals(SIZE_ARRAY, myArray.getSize());
	}

}
