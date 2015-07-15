package sorting;


import java.util.Scanner;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         Problem Statement
 * 
 *         The running time of Quicksort will depend on how balanced the
 *         partitions are. If you are unlucky and select the greatest or the
 *         smallest element as the pivot, then each partition will separate only
 *         one element at a time, so the running time will be similar to
 *         Insertion Sort.
 * 
 *         However, Quicksort will usually pick a pivot that is mid-range, and
 *         it will partition the array into two parts. Let's assume Partition is
 *         lucky and it always picks the median element as the pivot. What will
 *         be the running time in such a case?
 *         
 * 		   Challenge
 *         In practice, how much faster is Quicksort (in-place) than
 *         Insertion Sort? Compare the running time of the two algorithms by
 *         counting how many swaps or shifts each one takes to sort an array,
 *         and output the difference. You can modify your previous sorting code
 *         to keep track of the swaps. The number of swaps required by Quicksort
 *         to sort any given input have to be calculated. Keep in mind that the
 *         last element of a block is chosen as the pivot, and that the array is
 *         sorted in-place as demonstrated in the explanation below.
 * 
 *         Any time a number is lower than the partition, it should be
 *         "swapped", even if it doesn't actually move to a different location.
 *         Also ensure that you count the swap when the pivot is moved into
 *         place. The count for Insertion Sort should be the same as the
 *         previous challenge, where you just count the number of "shifts".
 * 
 *         Input Format There will be two lines of input:
 * 
 *         n - the size of the array ar - n numbers that make up the array
 * 
 *         Output Format Output one integer D, where D= (insertion sort shifts)
 *         - (quicksort swaps)
 */
public class Running_Time_of_Quicksort {
private static int quickshifts=0;
private static int insertionshifts=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			arr1[i]=arr[i];
		}
		
		quickSort(arr, 0, n - 1);
		insertionsort(arr1);
		//System.out.println(quickshifts+" "+insertionshifts);
		System.out.println(insertionshifts-quickshifts);

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
		
		return small + 1;

	}

	private static void swap(int[] arr, int k, int small) {
		// TODO Auto-generated method stub
		int temp;
		temp = arr[k];
		arr[k] = arr[small];
		arr[small] = temp;
		quickshifts++;

	}
	private static void insertionsort(int[] arr)
	{
		
		for(int i=1;i<arr.length;i++)
		{
			
			int j=i-1;;int temp=arr[i];
			while(j>=0&&temp<arr[j])
			{
				arr[j+1]=arr[j];				
				j--;
				insertionshifts++;
			}
			arr[j+1]=temp;		
			
		}
		
	}
}
