/*
 * Simple version of Array
 */

public class MyArray {
	int[] elements;
	
	/*
	 * Constructor a new Array instance
	 * @param size: the size of the Array instance
	 */
	public MyArray(int size) {
		elements = new int[size];
	}
	
	/*
	 * Accessor methods
	 */
	public int getSize() {
		return elements.length;
	}
}
