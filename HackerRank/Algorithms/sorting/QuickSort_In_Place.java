package sorting;

import java.util.Scanner;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         The previous version of Quicksort was easy to understand, but it was
 *         not optimal. It required copying the numbers into other arrays, which
 *         takes up space and time. To make things faster, one can create an
 *         "in-place" version of Quicksort, where the numbers are all sorted
 *         within the array itself.
 * 
 *         Input Format There will be two lines of input:
 * 
 *         n - the size of the array ar - the n numbers of the array
 * 
 *         Output Format Print the entire array on a new line at the end of
 *         every partitioning method.
 * 
 */

public class QuickSort_In_Place {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		quickSort(arr, 0, n - 1);

		in.close();
	}

	private static void quickSort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if (i < j) {
			int pos = partition(arr, i, j);
			quickSort(arr, i, pos - 1);
			quickSort(arr, pos + 1, j);
			// printArray(arr,i,j);
		}

	}

	private static int partition(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int pivot = arr[j];
		int small = i - 1;
		for (int k = i; k < j; k++) {
			if (arr[k] <= pivot) {
				small++;
				swap(arr, k, small);

			}

		}
		swap(arr, j, small + 1);
		printArray(arr, 0, arr.length - 1);
		return small + 1;

	}

	private static void swap(int[] arr, int k, int small) {
		// TODO Auto-generated method stub
		int temp;
		temp = arr[k];
		arr[k] = arr[small];
		arr[small] = temp;

	}

	private static void printArray(int[] arr, int i, int j) {
		for (int k = i; k <= j; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println("");
	}
}
