package projectEuler;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler23 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int abundant[]=new int[24792];int c=0;
		for(int i=2;i<=99988;i++)
		{
			int sqrt=(int) Math.sqrt(i);
			int j=2;int sum=1;
			while(j<=sqrt)
			{
				if(i%j==0)
				{
					sum+=j+(i/j);
				
				}
				j++;
			
			}
		
			if(sqrt*sqrt==i)
				sum=sum-sqrt;
			if(sum>i)
			{
				abundant[c]=i;
				//System.out.println(abundant[c]);
				c++;
			}
		}
		c=0;
	/*for(int i=0;i<abundant.length;i++)
		{
		System.out.print(abundant[i]+" ");
		}*/
	
		boolean arr[]=new boolean[100001];
		//long max=28123l;
		//long ans=((max+1)/2)*max;
		for(int i=0;i<abundant.length;i++)
		{
			for(int j=i;j<abundant.length&&abundant[i]+abundant[j]<=100000;j++)
			{
				int s=abundant[i]+abundant[j];
				
				arr[s]=true;
			}
		}
		//System.out.println(ans-sum);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
	//	String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			System.out.println(arr[N]?"YES":"NO");
		}
		
		
	}

}
