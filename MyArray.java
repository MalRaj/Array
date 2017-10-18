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
