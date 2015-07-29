package fundamentals.sherlock_and_permutations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Sherlock_and_Permutations {
private static long con=1000000007;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		while(T-->0)
		{
			s=br.readLine().trim();			
			st=new StringTokenizer(s);
			long  N=Long.parseLong(st.nextToken());
			long  M=Long.parseLong(st.nextToken());
			long r=M-1;
			long n=r+N;
			long ans=ncr(n,r);
			System.out.println(ans);
		}

	}

	private static long ncr(long n, long r) {
		if(n-r>r)
			r=n-r;
		long ans=1l;
		for(long i=1;i<=n-r;i++)
		{
			ans=((ans*(r+i)%con)%con*modInverse(i))%con;
		}
			
		return ans;
	}

	private static long modInverse(long b) {
		long a=1l;
		long m=con-2;
		while(m>0)
		{
			if((m&1)==1)
			{
				a=(a*b)%con;
			}
			b=(b*b)%con;
			m>>=1;
		}
		return a;
	}

}
