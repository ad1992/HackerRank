package sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class InsertionSortPartII {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<size;i++)
		{
			
			int j=i-1;;int temp=arr[i];
			while(j>=0&&temp<arr[j])
			{
				arr[j+1]=arr[j];				
				j--;;
			}
			arr[j+1]=temp;
			//System.out.println(arr[i]);
			for( j=0;j<size;j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}

}
