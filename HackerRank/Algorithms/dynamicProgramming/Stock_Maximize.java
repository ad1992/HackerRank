package dynamicProgramming;
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
 *         Your algorithms have become so good at predicting the market that you
 *         now know what the share price of Wooden Orange Toothpicks Inc. (WOT)
 *         will be for the next N days.
 * 
 *         Each day, you can either buy one share of WOT, sell any number of
 *         shares of WOT that you own, or not make any transaction at all. What
 *         is the maximum profit you can obtain with an optimum trading
 *         strategy?
 * 
 *         Input
 * 
 *         The first line contains the number of test cases T. T test cases
 *         follow:
 * 
 *         The first line of each test case contains a number N. The next line
 *         contains N integers, denoting the predicted price of WOT shares for
 *         the next N days.
 * 
 *         Output
 * 
 *         Output T lines, containing the maximum profit which can be obtained
 *         for the corresponding test case.
 */
public class Stock_Maximize {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine());
		while(T>0)
		{
			int N=Integer.parseInt(br.readLine());
			if((s=br.readLine())!=null){				
			
				st=new StringTokenizer(s);
				int price[]=new int[N];
				for(int i=0;i<N;i++)
				{
					price[i]=Integer.parseInt(st.nextToken());					
					
				}
				int max[]=new int[N];
				max[N-1]=price[N-1];
				for(int i=N-2;i>=0;i--)
				{
					if(max[i+1]>price[i])
					{
						max[i]=max[i+1];
					}
					else
					{
						max[i]=price[i];
					}
				}
				long profit=0l;
				for(int i=0;i<N;i++)
				{
					if(max[i]>=price[i])
					{
						profit+=max[i]-price[i];
					}
				}
				out.println(profit);
				T--;
			}
		}
		out.close();

	}

	

}