package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class PrimeFactorization2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int prime[]=new int[2000001];
		prime[0]=prime[1]=-1;
		for(int i=2;i<=2000000;i++)
		{
			prime[i]=i;
		}
		for(int i=2;i<=2000;i++)
		{
			if(prime[i]==i)
			{
				for(int j=i*2;j<=2000000;j+=i)
				{
					prime[j]=i;
				}
			}
		}
		
		/*for(int i=2;i<=1000000;i++)
		{
			if(prime[i]==i)
			System.out.println(prime[i]);
		}*/
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());long ans=0;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			if(prime[N]==N)
			{
				ans+=N;
				//System.out.println(N);
			}
			else
			{
				int k=prime[N];
				int l=k;
				//System.out.println("k="+k);
				int m=(int) Math.ceil(Math.sqrt(N));
				while(k>=1)
				{
					if(N%k==0&&prime[k]==k)
					{
						ans+=k;
						//System.out.println("k="+k+" " +(N/k));
						int d=N/k;
							if(prime[d]==d&&d>l)
								ans+=d;
							//System.out.println("d="+d);
						
						N/=k;
					}
					else
						k--;
				}
				
			}
			
		}
		System.out.println(ans);
	}

}
