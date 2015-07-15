package sorting;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         In the previous challenge, you wrote a partition method to split an
 *         array into two sub-arrays, one containing smaller elements and one
 *         containing larger elements than a given number. This means you
 *         'sorted' half the array with respect to the other half. Can you
 *         repeatedly use partition to sort an entire array? Input Format There
 *         will be two lines of input:
 * 
 *         n - the size of the array ar - the n numbers of the array
 * 
 *         Output Format Print every partitioned sub-array on a new line.
 * 
 */
public class QuickSort_2_Sorting {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     int[] arr = new int[n];
	     for(int i=0;i<n;i++){
	        arr[i]=in.nextInt(); 
	     }
	     quickSort(arr,0,n-1);
	    // printArray(arr,0,n-1);
	     in.close();
	 }

	private static void printArray(int[] arr,int i,int j) {
         for(int k=i;k<=j;k++){
            System.out.print(arr[k]+" ");
         }
           System.out.println("");
      }
       

	private static void quickSort(int[] arr,int i,int j) {
		// TODO Auto-generated method stub
		if(i<j)
		{
			int pos=partition(arr,i,j);
			quickSort(arr,i,pos-1);
			quickSort(arr,pos+1,j);
			printArray(arr,i,j);
		}
		
	}

	private static int partition(int[] arr,int i,int j) {
		// TODO Auto-generated method stub
		int pivot=arr[i];
		int large=j;
		String less="";
		String grt="";
		
		
		for(int k=j;k>i;k--)
		{
			if(arr[k]>=pivot)
			{
				grt=arr[k]+" "+grt;			
				
				large--;
				
			}
			else
			{
				less=arr[k]+" "+less;
			}
			
		
		}
	//	System.out.println(less+" "+pivot+" "+grt);
		StringTokenizer st=new StringTokenizer(less);
		while(st.hasMoreTokens())
		{
			arr[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		st=new StringTokenizer(grt);
		arr[i]=pivot;
		i++;
		while(st.hasMoreTokens())
		{
			arr[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		
		return large;
		
		
	}

	

}
