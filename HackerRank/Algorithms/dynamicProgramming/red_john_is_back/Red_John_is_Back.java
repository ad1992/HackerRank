package dynamicProgramming.red_john_is_back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Red_John_is_Back {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		int ways[]=new int[41];
		ways[0]=ways[1]=ways[2]=ways[3]=1;
		for(int i=4;i<=40;i++)
			ways[i]=ways[i-1]+ways[i-4];
		int prime[]=new int[217287];//ways[40]=217286
		//System.out.println(Math.sqrt(ways[40]));
		for(int i=1;i<prime.length;i++)
			prime[i]=i;
		for(int i=2;i<=467;i+=1)//sqrt(ways[40])=467
		{
			if(prime[i]==i)
			{
				for(int j=i;j<=217286;j+=i)
				{
					prime[j]=i;
				}
			}
		}
		prime[1]=prime[0]=-1;
		int count[]=new int[217287];
		count[2]=1;
		for(int i=3;i<count.length;i++)
		{
			if(prime[i]==i)
				count[i]++;
			count[i]+=count[i-1];
		}
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			System.out.println(count[ways[N]]);
		}

	}

}
