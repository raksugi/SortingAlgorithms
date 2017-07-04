package com.raksugi;

/**
 * This is an in-place quicksort implementation.
 * 
 * Created by rakesh on 6/28/17.
 */
public class QuickSorter implements Sorter {
	
	/* startIndex and endIndex needed for in-place sorting */
	private void sortInternal(int[] inputArray, int startIndex, int endIndex) {
		if(startIndex >= endIndex) { return; }
		
		/* pick the last element as pivot */
		int pivot = inputArray[endIndex];
		/* initialize 2 pointers at both ends */
		int i = startIndex, j = endIndex - 1, temp;
		
		while(i <= j) {
			if(inputArray[i] > pivot) {
				/* swap  with `j` */
				temp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j] = temp;
				j--;
			} else {
				/* move to the next element */
				i++;
			}
		}

		/* swap the pivot with `i` */
		inputArray[endIndex] = inputArray[i];
		inputArray[i] = pivot;
		
		/* recursively call sortInternal */
		this.sortInternal(inputArray, startIndex, i - 1);
		this.sortInternal(inputArray, i + 1, endIndex);

	}
	
    @Override
    public int[] sort(int[] inputArray) {
        this.sortInternal(inputArray, 0, inputArray.length - 1);
        return inputArray;
    }
    
}
