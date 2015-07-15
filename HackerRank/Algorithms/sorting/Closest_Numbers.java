package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Challenge Given a list of unsorted integers, A={a1,a2,…,aN}, can you
 *         find the pair of elements that have the smallest absolute difference
 *         between them? If there are multiple pairs, find them all.
 * 
 *         Input Format The first line of input contains a single integer, N,
 *         representing the length of array A. In the second line, there are N
 *         space-separated integers, a1,a2,…,aN, representing the elements of
 *         array A.
 * 
 *         Output Format Output the pairs of elements with the smallest
 *         difference. If there are multiple pairs, output all of them in
 *         ascending order, all on the same line (consecutively) with just a
 *         single space between each pair of numbers. If there's a number which
 *         lies in two pair, print it two times (see the sample case #3 for
 *         explanation).
 * 
 */
public class Closest_Numbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());		
		int arr[]=new int[N];
		int diff[] = null;
		String s=br.readLine();
	    StringTokenizer st=new StringTokenizer(s);
		for(int i=0;i<N;i++)
		{
			
            int num=Integer.parseInt(st.nextToken()); 
            arr[i]=num;
			
		}
		Arrays.sort(arr);
		
		int k=0;
		int mindiff=Integer.MAX_VALUE;
		for(int i=1;i<N;i++)
		{
			int curdiff=Math.abs(arr[i]-arr[i-1]);
			if(curdiff<mindiff)
			{
				k=0;
				diff=new int[N];
				diff[k]=i;
				k++;
				mindiff=curdiff;
			}
			else if(curdiff==mindiff)
			{
				diff[k++]=i;
			}
		}
		for(int i=0;i<k;i++)
		{
			
			System.out.print(arr[diff[i]-1]+" "+arr[diff[i]]+" ");
			//System.out.println(Math.abs(arr[diff[i]-1]-arr[diff[i]]));
		}
		
	}

}
