package implementation;

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
 *         Little Bob loves chocolate, and he goes to a store with $N in his
 *         pocket. The price of each chocolate is $C. The store offers a
 *         discount: for every M wrappers he gives to the store, he gets one
 *         chocolate for free. How many chocolates does Bob get to eat?
 * 
 *         Input Format: The first line contains the number of test cases, T. T
 *         lines follow, each of which contains three integers, N, C, and M.
 * 
 *         Output Format: Print the total number of chocolates Bob eats.
 * 
 */
public class Chocolate_Feast {

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
				int N=Integer.parseInt(st.nextToken());
				int C=Integer.parseInt(st.nextToken());
				int K=Integer.parseInt(st.nextToken());
				int buy=N/C;
				int total=buy;
				//System.out.println(buy+" "+K);
						
				while(buy>1&&buy>=K)
				{
					total++;
					buy-=K;
					buy++;
				}
				out.println(total);
				T--;
			}
		}
		out.close();

	}

}
