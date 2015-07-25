package dynamicProgramming.stock_maximize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
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
