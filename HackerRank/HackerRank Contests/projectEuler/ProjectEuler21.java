package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler21 {

	/**
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int arr[]=new int[100001];
		arr[0]=arr[1]=-1;
		for(int i=2;i<=100000;i++)
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
			if(sum<=100000&&sum!=i)
			{
				arr[i]=sum;
			}
			else
				arr[i]=-1;
			//System.out.println(arr[i]);
		}
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
	//	String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());long c=0l;
			for(int i=2;i<=N;i++)
			{
				if(arr[i]!=-1&&arr[arr[i]]!=-1)
				{
					if(i==arr[arr[i]])
					{
						c+=i;
						//System.out.println(i);
					}
						
				}
			}
			System.out.print(c+"\n");
			
		}	
		
	}
	
	
}
