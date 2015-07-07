package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         The Utopian Tree goes through 2 cycles of growth every year. The
 *         first growth cycle occurs during the spring, when it doubles in
 *         height. The second growth cycle occurs during the summer, when its
 *         height increases by 1 meter.
 * 
 *         Now, a new Utopian Tree sapling is planted at the onset of spring.
 *         Its height is 1 meter. Can you find the height of the tree after N
 *         growth cycles?
 * 
 *         Input Format
 * 
 *         The first line contains an integer, T, the number of test cases. T
 *         lines follow; each line contains an integer, N, that denotes the
 *         number of cycles for that test case.
 * 
 *         Constraints 1≤T≤10 0≤N≤60
 * 
 *         Output Format
 * 
 *         For each test case, print the height of the Utopian Tree after N
 *         cycles. Each line thus has to contain a single integer, only.
 * 
 */
public class Utopian_Tree {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			int ans=0;
			int N=Integer.parseInt(br.readLine());
			if(N==0)
				ans=1;
			else if(N==1)
				ans=2;
			else if((N&1)==1)
			{
				int a=(N+1)/2;
				int pow=(int) (Math.pow(2,a)-1);
				ans=pow*2;
				
			}
			else
			{
				N=N-1;
				int a=(N+1)/2;
				int pow=(int) (Math.pow(2,a)-1);
				ans=pow*2+1;
				
			}
			
			out.println(ans);
		}
		out.close();

	}

}
