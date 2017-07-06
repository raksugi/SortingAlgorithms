package com.raksugi;

public class Main {

	public static void main(String[] args) {
		Sorter sorter = new QuickSorter();
		int[] inputArray = { 5, 14, -3, 12, 1, 6, 20, -99, 103, 0 };

		int[] result = sorter.sort(inputArray);

		for (int element : result) {
			System.out.print(element + " ");
		}
	}
}
