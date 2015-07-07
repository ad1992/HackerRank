package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler18{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int N;
		String line="";
		StringTokenizer st;
		
		while(T-->0)
		{
			N=Integer.parseInt(br.readLine().trim());
			int arr[][]=new int [N][];
			for(int i=0;i<N;i++)
			{
				
					if((line=br.readLine().trim())!=null)
					{
						arr[i]=new int[i+1];
						st=new StringTokenizer(line," ");
						for(int j=0;j<=i;j++)
						{
						
						arr[i][j]=Integer.parseInt(st.nextToken());
					
						}
					
					}
			}
			
				
			System.out.println(calculate(arr));

	}

}

	private static int calculate(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=arr.length-1 ;i>0;i--)
		{
			for(int j=0;j<arr[i].length-1;j++)
			{
				arr[i-1][j]+=arr[i][j]>arr[i][j+1]?arr[i][j]:arr[i][j+1];
			}
		}
		
		return arr[0][0];
	}
}
