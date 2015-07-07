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
 *         Alice gives a wooden board composed of M X N wooden square pieces to
 *         Bob and asks him to find the minimal cost of breaking the board into
 *         square wooden pieces. Bob can cut the board along horizontal and
 *         vertical lines, and each cut divides the board in smaller parts. Each
 *         cut has a cost depending on whether the cut is made along a
 *         horizontal or a vertical line.
 * 
 *         Let us denote the costs of cutting it along consecutive vertical
 *         lines by x1, x2, ..., xn-1, and the cost of cutting it along
 *         horizontal lines by y1, y2, ..., ym-1. If a cut (of cost c) is made
 *         and it passes through n segments, then total cost of this cut will be
 *         n*c.
 * 
 *         The cost of cutting the whole board into single squares is the sum of
 *         the cost of successive cuts used to cut the whole board into square
 *         wooden pieces of size 1x1. Bob should compute the minimal cost of
 *         breaking the whole wooden board into squares of size 1x1.
 * 
 *         Bob needs your help to find the minimal cost. Can you help Bob with
 *         this challenge?
 * 
 *         Input Format A single integer in the first line T, stating the number
 *         of test cases. T testcases follow. For each test case, the first line
 *         contains two positive integers M and N separated by a single space.
 *         In the next line, there are integers y1, y2, ..., ym-1, separated by
 *         spaces. Following them are integers x1, x2, ..., xn-1, separated by
 *         spaces.
 * 
 *         Output Format For each test-case, write an integer in separate line
 *         which denotes the minimal cost of cutting the whole wooden board into
 *         single wooden squares. Since the answer can be very large, output the
 *         answer modulo 10^9+7.
 * 
 */
public class Cutting_boards {
	private static long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int M=Integer.parseInt(st.nextToken());
				int N=Integer.parseInt(st.nextToken());
				long Y[]=new long[M-1];
				long X[]=new long[N-1];
				if((s=br.readLine().trim())!=null)
				{
					st=new StringTokenizer(s);
					for(int i=0;i<M-1;i++)
					{
						Y[i]=Long.parseLong(st.nextToken());
					}
					if((s=br.readLine().trim())!=null)
					{
						st=new StringTokenizer(s);
						for(int i=0;i<N-1;i++)
						{
							X[i]=Long.parseLong(st.nextToken());
						}
						long cost=0l;
						Arrays.sort(X);
						Arrays.sort(Y);
						int h=1,v=1;
						M--;
						N--;
						int i=M-1;
						int j=N-1;
						while(i>=0 && j>=0)
						{
							if(Y[i]>=X[j])
							{
								cost=(cost+(Y[i]*v)%con)%con;
								h++;
								i--;
							}
							else
							{
								cost=(cost+(X[j]*h)%con)%con;
								v++;
								j--;
							}
						}
						//System.out.println(h+" "+v+" "+cost);
						while(i>=0)
						{
							cost=(cost+(Y[i]*v)%con)%con;
							h++;
							i--;
						}
						while(j>=0)
						{
							cost=(cost+(X[j]*h)%con)%con;
							v++;
							j--;
						}
						out.println(cost);
						T--;
						
					}
				}
			}
		}
		
		out.close();
	}

}
