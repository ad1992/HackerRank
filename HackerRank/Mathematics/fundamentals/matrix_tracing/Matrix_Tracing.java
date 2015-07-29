package fundamentals.matrix_tracing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Matrix_Tracing {
private static long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		while(T-->0)
		{
			s=br.readLine().trim();
			st=new StringTokenizer(s);
			long m=Long.parseLong(st.nextToken());
			long n=Long.parseLong(st.nextToken());
			long ans=ncr(m+n-2,m-1);
			System.out.println(ans);
					
		}

	}
	private static long ncr(long n,long r) {
		if(n-r>r)
			r=n-r;
		long ans=1l;
		for(long i=1;i<=n-r;i++)
		{
			ans=((ans*(i+r))%con*(modInverse(i)))%con;
		}
		return ans;
		
		
	}
	private static long modInverse(long b) {
		long m=con-2;
		long a=1l;
		while(m>0)
		{
			if((m&1)==1)
			{
				a=(a*b)%con;
			}
			b=(b*b)%con;
			m>>=1l;
		}
		return a;
	}

	

}
