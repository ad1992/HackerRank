package fundamentals.connecting_towns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Connecting_Towns {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		while(T-->0)
		{
			int n=Integer.parseInt(br.readLine());
			long ans=1;
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				for(int i=0;i<n-1;i++)
				{
					int num=Integer.parseInt(st.nextToken());
					ans=(ans*(num%1234567))%1234567;
				}
				System.out.println(ans);
			}
		}
	}

}
