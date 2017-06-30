package com.raksugi;

import java.util.Arrays;

/**
 * Created by rakesh on 6/28/17.
 */
public class MergeSorter implements Sorter {

    private int[] merge(int[] sortedArray1, int[] sortedArray2) {
        /* if one of the arrays is null or empty */
        if (sortedArray1 == null || sortedArray1.length == 0) {
            return sortedArray2;
        }
        if (sortedArray2 == null || sortedArray2.length == 0) {
            return sortedArray1;
        }

        /* initialize locals */
        int[] resultArray = new int[sortedArray1.length + sortedArray2.length];
        int i = 0, j = 0, k = 0;

        /* while both pointers haven't reached the end */
        while (i < sortedArray1.length && j < sortedArray2.length) {
            if (sortedArray1[i] < sortedArray2[j]) {
                resultArray[k] = sortedArray1[i];
                i++;
            } else {
                resultArray[k] = sortedArray2[j];
                j++;
            }
            k++;
        }

        /* add the rest of the array that is not exhausted */
        if (i < sortedArray1.length) {
            while (i < sortedArray1.length) {
                resultArray[k++] = sortedArray1[i++];
            }
        } else {
            while (j < sortedArray2.length) {
                resultArray[k++] = sortedArray2[j++];
            }
        }

        return resultArray;
    }

    @Override
    public int[] sort(int[] inputArray) {
        if (inputArray.length <= 1) {
            return inputArray;
        }

        return this.merge(
                this.sort(Arrays.copyOfRange(inputArray, 0, inputArray.length / 2)),
                this.sort(Arrays.copyOfRange(inputArray, inputArray.length / 2, inputArray.length))
        );

    }
}
