package number_theory.little_panda_power;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi 
 * 
 */
public class Little_Panda_Power {
private static long x,y;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
        
		
		while(T>0)
		{
			StringBuilder s1=new StringBuilder();
            if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				long A=Long.parseLong(st.nextToken());
				long B=Long.parseLong(st.nextToken());
				long N=Long.parseLong(st.nextToken());
				long ans=1l;
				if(B<0)
				{
					egcd(A,N);
					if(x<0)
						x+=N;
					B=B*-1l;
					ans=pow(x,B,N);
					//System.out.println(x+" "+y);
				}
				else
				{
					ans=pow(A,B,N);
				}
				s1.append(ans+"\n");
				T--;
			}
            System.out.print(s1);
		}

	}

	private static long pow(long b, long m, long n) {
		// TODO Auto-generated method stub
		long a=1l;		
		while(m>0)
		{
			if((m&1)==1)
			{
				a=(a*b)%n;
			}
			b=(b*b)%n;
			m>>=1;
		}
		return a;
	}
	private static void egcd(long a,long n) {
		// TODO Auto-generated method stub
		if(a%n==0)
		{
			x=0;
			y=1;
			return;
		}
		egcd(n,a%n);
		long temp=x;
		x=y;
		y=temp-y*(a/n);
		
	}
	

}
