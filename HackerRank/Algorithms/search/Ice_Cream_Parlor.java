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
 *         Sunny and Johnny together have M dollars they want to spend on ice
 *         cream. The parlor offers N flavors, and they want to choose two
 *         flavors so that they end up spending the whole amount.
 * 
 *         You are given the cost of these flavors. The cost of the ith flavor
 *         is denoted by ci. You have to display the indices of the two flavors
 *         whose sum is M.
 * 
 *         Input Format
 * 
 *         The first line of the input contains T; T test cases follow. Each
 *         test case follows the format detailed below: The first line contains
 *         M. The second line contains N. The third line contains N
 *         space-separated integers denoting the price of each flavor. Here, the
 *         ith integer denotes ci.
 * 
 *         Output Format
 * 
 *         Output two integers, each of which is a valid index of a flavor. The
 *         lower index must be printed first. Indices are indexed from 1 to N.
 * 
 */
public class Ice_Cream_Parlor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;		
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			
			int M=Integer.parseInt(br.readLine().trim());
			int N=Integer.parseInt(br.readLine().trim());
			int price[]=new int[N];
            int index[]=new int[10001];
            for(int i=0;i<10001;i++)
			{
            	index[i]=-1;
			}          
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<N;i++)
				{
					price[i]=Integer.parseInt(st.nextToken());
                    index[price[i]]=i;
				}
                /*for(int i=0;i<N;i++)
                {
                System.out.println(index[price[i]]);    
                }*/
				int pos1=0,pos2=0;
                for(int i=0;i<N;i++)
				{
					
                	if(M-price[i]>=0){
                    int cur=index[M-price[i]];
                    if(cur>=0&&cur!=i)
					{
						pos1=i+1;
                        pos2=index[M-price[i]]+1;
                        break;
					}
                    }
				}
				out.println(pos1+" "+pos2);
                T--;
			}
		}
		out.close();
	}
}
