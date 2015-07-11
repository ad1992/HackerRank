package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		long sumsquare[]=new long[10001];
		long squaresum[]=new long[10001];
		sumsquare[1]=1;
		squaresum[1]=1;
		for(int i=2;i<=10000;i++)
		{
			sumsquare[i]=sumsquare[i-1]+i;
			squaresum[i]=squaresum[i-1]+i*i;
		}
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			long s1=sumsquare[N]*sumsquare[N];
			long s2=squaresum[N];
			long ans=s1-s2;
			///System.out.print(s1+" "+s2+"\n");
			System.out.print(ans+"\n");
		
		}
		
	}
}
