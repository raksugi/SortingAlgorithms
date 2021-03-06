package com.raksugi;

/**
 * Created by rakesh on 6/28/17.
 */
public class InsertionSorter implements Sorter {

	/**
	 * Inserts the last element into the right position.
	 * 
	 * @param inputArray
	 * @param size
	 * @return
	 */
	private int[] insert(int[] inputArray, int size) {
		int lastElementIndex = size;
		int newElement = inputArray[lastElementIndex];
		int temp;

		int i = lastElementIndex - 1;
		while (i >= 0) {
			if (inputArray[i] > newElement) {
				/* swap */
				temp = inputArray[i + 1];
				inputArray[i + 1] = inputArray[i];
				inputArray[i] = temp;
			} else {
				break;
			}
			i--;
		}
		return inputArray;
	}

	/**
	 * Do an insertion sort.
	 * 
	 * @param inputArray
	 * @return
	 */
	@Override
	public int[] sort(int[] inputArray) {
		if (inputArray.length <= 1) {
			return inputArray;
		}

		int i = 0;

		while (i < inputArray.length) {
			insert(inputArray, i);
			i++;
		}

		return inputArray;
	}
}
