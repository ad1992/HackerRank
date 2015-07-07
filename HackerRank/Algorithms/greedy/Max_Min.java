package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Given a list of N integers, your task is to select K integers from
 *         the list such that its unfairness is minimized.
 * 
 *         if (x1,x2,x3,…,xk) are K numbers selected from the list N, the
 *         unfairness is defined as
 * 
 *         max(x1,x2,…,xk)−min(x1,x2,…,xk)
 * 
 *         where max denotes the largest integer among the elements of K, and
 *         min denotes the smallest integer among the elements of K.
 * 
 *         Input Format The first line contains an integer N. The second line
 *         contains an integer K. N lines follow. Each line contains an integer
 *         that belongs to the list N.
 * 
 *         Note: Integers in the list N may not be unique.
 * 
 *         Output Format An integer that denotes the minimum possible value of
 *         unfairness.
 */
public class Max_Min {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine().trim());
		int K=Integer.parseInt(br.readLine().trim())-1;
		long arr[]=new long[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(br.readLine().trim());
		}
		Arrays.sort(arr);
		long unfairness=Long.MAX_VALUE;
		for(int i=0;i+K<N;i++)
		{
			long diff=arr[i+K]-arr[i];
            	//System.out.println(arr[i]+" "+arr[i+K]);
			if(unfairness>diff)
				unfairness=diff;
			
			
		}
		System.out.println(unfairness);
	}

}
