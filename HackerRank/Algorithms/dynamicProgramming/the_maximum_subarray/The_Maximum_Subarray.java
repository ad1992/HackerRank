package dynamicProgramming.the_maximum_subarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class The_Maximum_Subarray {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());StringTokenizer st;
		
		String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int arr[]=new int[N];
				for(int i=0;i<N;i++)
				{
					arr[i]=Integer.parseInt(st.nextToken());
					
				}
                int lis[]=new int[N];
				int maxcons=arr[0],maxnoncons=arr[0]>0?arr[0]:0;
                int max=arr[0];
				lis[0]=arr[0];
				for(int i=1;i<N;i++)
				{
					if(arr[i]>0)
						maxnoncons+=arr[i];				 
					lis[i]=arr[i];
					if(lis[i-1]>0)
                        lis[i]+=lis[i-1];
                    maxcons=Math.max(maxcons,lis[i]);
                    max=Math.max(max,arr[i]);
					
				}				
			    if(maxnoncons==0) 
                    maxnoncons=max;
                System.out.println(maxcons+" " +maxnoncons);
            }
		}

	}
    
}
