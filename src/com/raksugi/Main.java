package com.raksugi;

public class Main {

    public static void main(String[] args) {
        Sorter sorter = new InsertionSorter();
        int[] inputArray = {5, 14, -3, 12, 1, 6};
        sorter.sort(inputArray);
        for(int element: inputArray) {
            System.out.print(element + " ");
        }
    }
}
