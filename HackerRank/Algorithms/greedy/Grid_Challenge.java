package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Given a squared sized grid G of size N in which each cell has a
 *         lowercase letter. Denote the character in the ith row and in the jth
 *         column as G[i][j].
 * 
 *         You can perform one operation as many times as you like: Swap two
 *         column adjacent characters in the same row G[i][j] and G[i][j+1] for
 *         all valid i,j.
 * 
 *         Is it possible to rearrange the grid such that the following
 *         condition is true?
 * 
 *         G[i][1]≤G[i][2]≤⋯≤G[i][N] for 1≤i≤N and G[1][j]≤G[2][j]≤⋯≤G[N][j] for
 *         1≤j≤N
 * 
 *         In other words, is it possible to rearrange the grid such that every
 *         row and every column is lexicographically sorted?
 * 
 *         Note: c1≤c2, if letter c1 is equal to c2 or is before c2 in the
 *         alphabet.
 * 
 *         Input Format
 * 
 *         The first line begins with T, the number of testcases. In each
 *         testcase you will be given N. The following N lines contain N
 *         lowercase english alphabet each, describing the grid.
 * 
 *         Output Format
 * 
 *         Print T lines. On the ith line print YES if it is possible to
 *         rearrange the grid in the ith testcase or NO otherwise.
 * 
 */
public class Grid_Challenge {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			char arr[][]=new char[N][N];
			int i=0;
			while(i<N)
			{
				if((s=br.readLine().trim())!=null)
				{
					
					for(int j=0;j<N;j++)
					{
						arr[i][j]=s.charAt(j);
					}
					i++;
				}
			}
			for(i=0;i<N;i++)
			{
				for(int j=0;j<N-1;j++)
				{
					for(int k=0;k<N-j-1;k++)
					{
						if(arr[i][k]>arr[i][k+1])
						{
							char temp;
							temp=arr[i][k];
							arr[i][k]=arr[i][k+1];
							arr[i][k+1]=temp;
						}
					}
				}
			}
			if(check(arr))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
				
		}
	}

	private static boolean check(char[][] arr) {
		// TODO Auto-generated method stub
		int N=arr.length;
		for(int j=0;j<N;j++)
		{
			for(int k=0;k<N-1;k++)
			{
				if(arr[k][j]>arr[k+1][j])
				{
					return false;
				}
			}
		
		}
		return true;
	}

}
