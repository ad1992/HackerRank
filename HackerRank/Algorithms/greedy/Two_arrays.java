package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         You are given two integer arrays, A and B, each containing N
 *         integers. The size of the array is less than or equal to 1000. You
 *         are free to permute the order of the elements in the arrays.
 * 
 *         Now here's the real question: Is there an permutation A', B' possible
 *         of A and B, such that, A'i+B'i ≥ K for all i, where A'i denotes the
 *         ith element in the array A' and B'i denotes ith element in the array
 *         B'.
 * 
 * 
 *         Input Format The first line contains an integer, T, the number of
 *         test-cases. T test cases follow. Each test case has the following
 *         format:
 * 
 *         The first line contains two integers, N and K. The second line
 *         contains N space separated integers, denoting array A. The third line
 *         describes array B in a same format.
 * 
 *         Output Format For each test case, if such an arrangement exists,
 *         output "YES", otherwise "NO" (without quotes).
 * 
 */
public class Two_arrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				long K=Long.parseLong(st.nextToken());
				long A[]=new long[N];
				long B[]=new long[N];
				if((s=br.readLine().trim())!=null)
				{
					st=new StringTokenizer(s);
					for(int i=0;i<N;i++)
					{
						A[i]=Long.parseLong(st.nextToken());
					}
					if((s=br.readLine().trim())!=null)
					{
						st=new StringTokenizer(s);
						for(int i=0;i<N;i++)
						{
							B[i]=Long.parseLong(st.nextToken());
						}
						Arrays.sort(A);
						Arrays.sort(B);
						if(check(A,B,K))
						{
							out.println("YES");
						}
						else
						{
							out.println("NO");
						}
						T--;
					}
				}
			}
           
		}
         out.close();
	}

	private static boolean check(long[] A, long[] B, long K) {
		// TODO Auto-generated method stub
		int N=A.length;
		for(int i=0,j=N-1;i<N;i++,j--)
		{
			if(A[i]+B[j]<K)
			{
				return false;
			}
		}
		return true;
	}

}
