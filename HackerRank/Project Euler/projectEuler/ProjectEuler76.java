package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 */

public class ProjectEuler76 {
private static long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int num=Integer.parseInt(br.readLine().trim());
			long ans=countways(num);
			System.out.println(ans);
		}
		

	}
	private static long countways(int num) {
		// TODO Auto-generated method stub
		long ways[]=new long[num+1];
		ways[0]=1;
		for(int i=1;i<num;i++)
		{
			for(int j=i;j<=num;j++)
				ways[j]=(ways[j]+ways[j-i])%con;
		}
		return ways[num];
	}
}
