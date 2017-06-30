package com.raksugi;

/**
 * Created by rakesh on 6/28/17.
 */
public class SelectionSorter implements Sorter {

    /**
     * Finds the index of the maximum value element
     * from the inputArray.
     *
     * @param inputArray
     * @param size
     * @return
     */
    private int findMaxIndex(int[] inputArray, int size) {
        /*  assume first index is maxIndex and
            first value is maxValue.
         */
        int maxIndex = 0, maxValue = inputArray[0];
        int i = 1;

        while(i < size) {
            if(inputArray[i] > maxValue) {
                maxValue = inputArray[i];
                maxIndex = i;
            }
            i++;
        }

        return maxIndex;
    }

    @Override
    public int[] sort(int[] inputArray) {
        if(inputArray.length <= 1) { return inputArray; }

        int i = inputArray.length;
        while(i > 0) {
            int maxIndex = findMaxIndex(inputArray, i);
            int temp = inputArray[maxIndex];
            inputArray[maxIndex] = inputArray[i - 1];
            inputArray[i - 1] = temp;

            i--;
        }
        return inputArray;
    }
}
