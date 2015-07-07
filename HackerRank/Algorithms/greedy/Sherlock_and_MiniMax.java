package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Watson gives Sherlock an array A1,A2...AN. He asks him
 *         to find an integer M between P and Q(both inclusive), such that, min
 *         {|Ai-M|, 1 ≤ i ≤ N} is maximised. If there are multiple solutions,
 *         print the smallest one.
 * 
 *         Input Format The first line contains N. The next line contains space
 *         separated N integers, and denote the array A. The third line contains
 *         two space separated integers denoting P and Q.
 * 
 *         Output Format In one line, print the required answer.
 * 
 */
public class Sherlock_and_MiniMax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine().trim());
		long arr[]=new long[N];
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		for(int i=0;i<N;i++)
		{
			arr[i]=Long.parseLong(st.nextToken());
		}
        Arrays.sort(arr);
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		long p=Long.parseLong(st.nextToken());
		long q=Long.parseLong(st.nextToken());
		long max=Integer.MIN_VALUE;
		long diff1,diff2;
        diff1=diff2=Long.MAX_VALUE;
		for(int i=0;i<N;i++)
		{
			diff1=Math.min(diff1,Math.abs(p-arr[i]));
			diff2=Math.min(diff2,Math.abs(q-arr[i]));
			
		}
		max=Math.max(diff1,diff2);	
		long ans=0l; 
		if(max==diff1)
			ans=p;
		else
			ans=q;
			
		for(int i=0;i<N-1;i++)
		{
			long mid=(arr[i]+arr[i+1])/2;
			if(mid>=p&&mid<=q)
			{
				diff1=Math.abs(mid-arr[i]);
               // System.out.println(diff1+" "+max);
				if(max<diff1)
				{
					max=diff1;
					ans=mid;
				}
				
			}
			
		}
		System.out.println(ans);

	}

	

}
