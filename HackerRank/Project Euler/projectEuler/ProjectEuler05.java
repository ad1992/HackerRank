package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int prime[]=new int[41];
		for(int i=2;i<41;i++)
		{
			prime[i]=i;
		}
		prime[0]=prime[1]=-1;
		for(int i=2;i<41;i++)
		{
			if(prime[i]==i)
			{
				for(int j=i*i;j<41;j+=i)
					prime[j]=i;
			}
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			long ans=1;
			for(int i=2;i<=N;i++)
			{
				if(prime[i]==i)
				{
					int power=1;;
					for(int p=1;power*i<=N;p++)
					{
						power*=i;
					}
					ans*=power;
					//System.out.println(i+" "+power);
				}
				
			}
			System.out.println(ans);

		}

	}

}
