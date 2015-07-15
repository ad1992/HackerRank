package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         Can you modify your previous Insertion Sort implementation to keep
 *         track of the number of shifts it makes while sorting? The only thing
 *         you should print is the number of shifts made by the algorithm to
 *         completely sort the array. A shift occurs when an element's position
 *         changes in the array. Do not shift an element if it is not necessary.
 * 
 *         Input Format The first line contains N, the number of elements to be
 *         sorted. The next line contains N integers a[1], a[2], ..., a[N].
 * 
 *         Output Format Output the number of shifts it takes to sort the array.
 */
public class Running_Time_of_Algorithms {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int shifts=0;
		for(int i=1;i<size;i++)
		{
			
			int j=i-1;;int temp=arr[i];
			while(j>=0&&temp<arr[j])
			{
				arr[j+1]=arr[j];				
				j--;
				shifts++;
			}
			arr[j+1]=temp;
			
			
			
		}
		System.out.println(shifts);
	}
	

}
