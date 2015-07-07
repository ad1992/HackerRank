package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 * 
 *
 */
public class CheckGCD {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());long ans=0;
		String s;
		StringTokenizer st; 
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				long K=Long.parseLong(st.nextToken());
				long arr[]=new long[N];
				if((s=br.readLine().trim())!=null)
				{
					st=new StringTokenizer(s);int p=0;
					for(int i=0;i<N;i++)
					{
						long num=Long.parseLong(st.nextToken());
						if(num%K==0)
						{
							arr[p++]=num/K;
							
						}
					}
					long gcd=arr[0];
					for(int i=1;i<p;i++)
					{
						gcd=getgcd(gcd,arr[i]);
					}
					if(gcd==1)
					{
						System.out.println("YES");
					}
					else
						System.out.println("NO");
					T--;
					
				}
			}
			
			
		}

	}

	private static long getgcd(long a, long b) {
		// TODO Auto-generated method stub
		if(b==0)
			return a;
		return getgcd(b,a%b);
		
	}

}
