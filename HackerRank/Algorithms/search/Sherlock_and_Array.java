package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Русский \| 中文 Watson gives Sherlock an array A of length N. Then he
 *         asks him to determine if there exists an element in the array such
 *         that the sum of the elements on its left is equal to the sum of the
 *         elements on its right. If there are no elements to the left/right,
 *         then the sum is considered to be zero. Formally, find an i, such
 *         that, A1+A2...Ai-1 =Ai+1+Ai+2...AN.
 * 
 *         Input Format The first line contains T, the number of test cases. For
 *         each test case, the first line contains N, the number of elements in
 *         the array A. The second line for each test case contains N
 *         space-separated integers, denoting the array A.
 * 
 *         Output Format For each test case print YES if there exists an element
 *         in the array, such that the sum of the elements on its left is equal
 *         to the sum of the elements on its right; otherwise print NO
 * 
 */
public class Sherlock_and_Array {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;		
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			
			int N=Integer.parseInt(br.readLine().trim());
			long sum[]=new long[N];
			long arr[]=new long[N];
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					arr[i]=Long.parseLong(st.nextToken());
					if(i==0)
						sum[0]=arr[i];
					else
						sum[i]=sum[i-1]+arr[i];
				}
				String ans="NO";						
				for(int i=1;i<N-1;i++)
				{
					long left=sum[i-1];
					long right=sum[N-1]-sum[i];
					if(left==right)
					{
						ans="YES";
						//System.out.println(i);
						break;
					}
				}
				if(N==1)
					ans="YES";
				out.println(ans);
				T--;
				
			}
		}
		out.close();

	}

}
