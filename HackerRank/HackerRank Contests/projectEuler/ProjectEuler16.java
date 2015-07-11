package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
	//	String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			int arr[]=new int[1000000];
			int size=1;
			arr[0]=1;
			for(int i=1;i<=N;i++)
			{
				size=fact(2,arr,size);
			}
			long sum=0;
			for(int i=size-1;i>=0;i--)
			{
				sum+=arr[i];
				//System.out.print(arr[i]);
			}
			System.out.println(sum);
		}

	}
	private static int fact(int n, int[] arr, int size) {
		// TODO Auto-generated method stub
		int carry=0;
		int i;
		for( i=0;i<size;i++)
		{
			int ans=n*arr[i]+carry;
			arr[i]=ans%10;
			carry=ans/10;
			
		}
		while(carry>0)
		{
			arr[i]=carry%10;
			carry/=10;
			i++;
		}
		return i;
	}


}
