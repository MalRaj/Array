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
	 * Constructs a new Array instance from an array
	 * @param array: is used to clone
	 */
	public MyArray(int[] array) {
		elements = array.clone();
	}
	
	/*
	 * Accessor methods
	 */
	public int getSize() {
		return elements.length;
	}
	
	public int[] getElements () {
		return elements;
	}
	
	/*
	 * Constructs a new Array instance in range from start(not included stop point)
	 *  to stop by step
	 * @param start: the start of range value for the Array instance
	 * @param stop:  the end of range value for the Array instance
	 * @param step:  the difference between 2 consecutive elements of the Array
	 * @return    :  null if step = 0 or start > stop
	 */
	public MyArray(int start, int stop, int step) {
		int range = stop - start;
		int size = 0;
		try {
			size = (range - 1) / step + 1;
		}
		catch (ArithmeticException e) {
			System.out.println("You should not divide a number by zero");
		}
		
		if (0 >= size) {
			elements = null; 
		}
		else {
			elements = new int[size];
			
			// Generate a range number from start to stop by the step (not include stop)
			elements[0] = start;
			if (size > 1) {
				for (int i = 1; i < size; i++) {
					elements[i] = elements[i-1] + step;
				}
			}
		}
	}
	
	/*
	 * Equal method
	 * @param array   : the array is compared with the elements of MyArray instance
	 * @return boolean: true if all the element of array and MyArray instance are equal
	 */
	public boolean equals (int[] array) {
		if (this.getSize() != array.length) {
			return false;
		}
		
		for (int i = 0; i < this.getSize(); i++) {
			if (this.elements[i] != array[i])
				return false;
		}
		
		return true;
	}
}
