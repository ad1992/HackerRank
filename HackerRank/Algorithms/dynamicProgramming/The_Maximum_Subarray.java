
package dynamicProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class The_Maximum_Subarray
 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());StringTokenizer st;
		
		String s;
		while(T-->0)
		{
			int n1=Integer.parseInt(br.readLine());
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				int arr[]=new int[n1];
				for(int i=0;i<n1;i++)
				{
					arr[i]=Integer.parseInt(st.nextToken());
					
				}
				int maxcons=Integer.MIN_VALUE,maxnoncons=0;int max=Integer.MIN_VALUE;
				for(int i=0;i<n1;i++)
				{
					if(arr[i]>0)
						maxnoncons+=arr[i];
					if(arr[i]>max)
						max=arr[i];
					
				}
                if(maxnoncons==0)
                {
                    maxnoncons=max;
                    maxcons=max;
                }
                else{
				int lis[]=new int[n1];
				
				for(int i=0;i<n1;i++)
				{
					lis[i]=arr[i];
				}
				for(int i=1;i<n1;i++)
				{
					if(lis[i]<lis[i-1]+arr[i])
					{
						lis[i]=lis[i-1]+arr[i];
					}
					
                  //  System.out.println(lis[i]);
				}
				
				for(int i=0;i<n1;i++)
				{
					if(lis[i]>maxcons)
					{
						maxcons=lis[i];
					}
				}
				
			}
                System.out.println(maxcons+" " +maxnoncons);
		}

	}
    }
}
