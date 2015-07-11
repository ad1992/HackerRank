package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		while(T-->0)
		{
			long a=1;
			long b=1;
			long c=0;
			long sum=c;
			long N=Long.parseLong(br.readLine().trim());
			while(c<N)
			{
				c=a+b;
				if(c>N)
					break;
				if(c%2==0){
					sum+=c;
					
					}
				
				a=b;
				b=c;
				
				
				
			
			}
			System.out.println(sum);
		}
			
	}
}