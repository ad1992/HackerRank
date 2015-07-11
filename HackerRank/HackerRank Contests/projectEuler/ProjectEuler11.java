package projectEuler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub 
		int arr[]=new int[1000001];
		long sum[]=new long[10000];
		
		for(int i=2;i<=1000;i++)
		{
			arr[i]=i;
		}
		arr[0]=arr[1]=-1;
		for(int i=2;i<=100;i++)
		{
			sum[i]=sum[i-1];
			if(arr[i]==i)
			{
				sum[i]+=+arr[i];
				for(int j=i*i;j<=1000000;j+=i)
				{
					arr[j]=i;
				}
			}
			
			
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());		
			while(T-->0)
			{
				int num=Integer.parseInt(br.readLine().trim());		
				System.out.println(arr[num]);
			}
	}

}
